package com.estudantee.Services;

import com.estudantee.Models.EstudanteModel;
import com.estudantee.Repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel) {
        return estudanteRepository.save(estudanteModel);
    }

    public List<EstudanteModel> findAll() {
        return estudanteRepository.findAll();
    }

    public void deletarEstudante(Long id) {
        estudanteRepository.deleteById(id);
    }

    public void buscarPorId(Long id) {
        estudanteRepository.findById(id);
    }

    public EstudanteModel atualizar(Long id, EstudanteModel estudanteModel){
        EstudanteModel model = estudanteRepository.findById(id).get();
        model.setNome(estudanteModel.getNome());
        model.setEmail(estudanteModel.getEmail());
        model.setIdade(estudanteModel.getIdade());

        return estudanteRepository.save(model);
    }
}
