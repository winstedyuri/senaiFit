package com.senaiFit.senaiFit.service;

import com.senaiFit.senaiFit.repository.CheckInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RelatorioService {

    @Autowired
    CheckInRepository checkInRepository;

    public String buscaCheckinMes(LocalDate dataInicio, LocalDate dataFim, Long idUsuario) {
        Integer quantidadeCheckInsMes = checkInRepository.buscaCheckInMes(dataInicio, dataFim, idUsuario);
        return "O total de checkins para a data informada é de: " + quantidadeCheckInsMes;

    }
}
