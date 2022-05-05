package com.senaiFit.senaiFit.service;

import com.senaiFit.senaiFit.entidade.Parceiros;
import com.senaiFit.senaiFit.repository.AcademiaRepository;
import com.senaiFit.senaiFit.repository.EstudioRepository;
import com.senaiFit.senaiFit.repository.ParceirosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParceirosService {

    @Autowired
    AcademiaRepository academiaRepository;

    @Autowired
    EstudioRepository estudioRepository;

    @Autowired
    ParceirosRepository repository;
    public Parceiros criaParceiros(Parceiros parceiros) {
        Parceiros parceirosSalva = new Parceiros();
        parceirosSalva.setAcademia(academiaRepository.save(parceiros.getAcademia()));
        parceirosSalva.setEndereco(parceiros.getEndereco());
        parceirosSalva.setEstudio(estudioRepository.save(parceiros.getEstudio()));
        parceirosSalva.setDataIngressoPrograma(parceiros.getDataIngressoPrograma());
        repository.save(parceirosSalva);
        return parceirosSalva;
    }
}
