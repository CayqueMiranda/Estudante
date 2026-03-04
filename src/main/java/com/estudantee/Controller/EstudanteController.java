package com.estudantee.Controller;

import com.estudantee.Models.EstudanteModel;
import com.estudantee.Services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel) {
        return estudanteService.criarEstudante(estudanteModel);
    }

    @GetMapping
    public List<EstudanteModel> listarEstudante() {
        return estudanteService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id) {
        estudanteService.deletarEstudante(id);
    }

    @GetMapping("/{id}")
    public void buscarPorId(@PathVariable Long id) {
        estudanteService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public EstudanteModel atualizar(@PathVariable Long id,  @RequestBody EstudanteModel estudanteModel) {
        estudanteService.atualizar(id, estudanteModel);
        return estudanteService.atualizar(id, estudanteModel);
    }

}
