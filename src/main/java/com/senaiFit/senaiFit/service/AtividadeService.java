package com.senaiFit.senaiFit.service;

import com.senaiFit.senaiFit.entidade.Atividade;
import com.senaiFit.senaiFit.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtividadeService {

    @Autowired
    AtividadeRepository repository;

    public Atividade criaAtividade(Atividade atividade) {
        Atividade atividadeSalva = new Atividade();
        atividadeSalva.setDuracao(atividade.getDuracao());
        atividadeSalva.setFaixaEtaria(atividade.getFaixaEtaria());
        repository.save(atividadeSalva);
        return atividadeSalva;
    }
}
