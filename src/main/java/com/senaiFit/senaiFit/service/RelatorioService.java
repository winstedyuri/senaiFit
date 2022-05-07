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
        return "O total de checkins para o usuário na data informada é: " + quantidadeCheckInsMes;
    }

    public String buscaCheckinMesParceiros(LocalDate dataInicio, LocalDate dataFim, Long idParceiros) {
        Integer quantidadeCheckInsMesParceiros = checkInRepository.buscaCheckInMesParceiros(dataInicio, dataFim, idParceiros);
        return "O total de checkins para o parceiro na data informada é: " + quantidadeCheckInsMesParceiros;
    }

    public String buscaUsuariosQueSuperaramLimite(LocalDate dataInicio, LocalDate dataFim) {
        Integer quantidadeUsuariosSuperouAtividade = checkInRepository.buscaUsuariosQueSuperaramLimite(dataInicio, dataFim);
        return "O total de usuários que superaram a atividade em um mês é: " + quantidadeUsuariosSuperouAtividade;
    }
}
