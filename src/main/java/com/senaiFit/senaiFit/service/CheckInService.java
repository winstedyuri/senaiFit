package com.senaiFit.senaiFit.service;

import com.senaiFit.senaiFit.Dto.CheckInDto;
import com.senaiFit.senaiFit.entidade.Atividade;
import com.senaiFit.senaiFit.entidade.CheckIn;
import com.senaiFit.senaiFit.entidade.Usuario;
import com.senaiFit.senaiFit.repository.AtividadeRepository;
import com.senaiFit.senaiFit.repository.CheckInRepository;
import com.senaiFit.senaiFit.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;


@Service
public class CheckInService {

    @Autowired
    CheckInRepository repository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    AtividadeRepository atividadeRepository;

    public String criaCheckIn(CheckInDto checkInDto) {

        String sugestaoDeAtividade = "Usuário não encontrado, não temos uma sugestão de atividade.";
        CheckIn checkInSalvo = new CheckIn();
        Optional<Atividade> atividade = atividadeRepository.findById(checkInDto.getAtividadeId());
        Optional<Usuario> usuario = usuarioRepository.findById(checkInDto.getUsuarioId());
        Integer quantidadeTotalCheckIns = 0;
        int idadeUsuario = 0;
        Integer limiteAtividadeSemana = 0;

        if (usuario.isPresent()) {
            checkInSalvo.setUsuario(usuario.get());
            quantidadeTotalCheckIns = usuario.get().getQuantidadeCheckIn() != null ? usuario.get().getQuantidadeCheckIn() : 0;
            idadeUsuario = usuario.get().getIdade();
            limiteAtividadeSemana = usuario.get().getLimiteAtividadeSemana() != null ? usuario.get().getLimiteAtividadeSemana() : 0;
        }

        if (atividade.isPresent()) {
            checkInSalvo.setDataCheckIn(LocalDate.now());
            checkInSalvo.setAtividade(atividade.get());

            if (idadeUsuario >= 14 && idadeUsuario <= 18) {
                if (checkInDto.getDuracaoAtividade() >= 45) {
                    sugestaoDeAtividade = "Cuidado! O excesso de atividade física também pode fazer mal para sua saúde!";
                } else {
                    sugestaoDeAtividade = "Seu limite é de: 45 minutos de atividades por\n" +
                            "checkin, limitado a 135 minutos por semana.";
                }
                limiteAtividadeSemana += checkInDto.getDuracaoAtividade();
                if (limiteAtividadeSemana >= 135) {
                    usuario.get().setSuperaLimiteAtividade(true);
                }
            }

            if (idadeUsuario >= 19 && idadeUsuario <= 60) {
                if (checkInDto.getDuracaoAtividade() >= 60) {
                    sugestaoDeAtividade = "Cuidado! O excesso de atividade física também pode fazer mal para sua saúde!";
                } else {
                    sugestaoDeAtividade = "Seu limite é de: 60 minutos de atividade por\n" +
                            "checkin, limitado a 420 minutos por semana.";
                }
                limiteAtividadeSemana += checkInDto.getDuracaoAtividade();
                if (limiteAtividadeSemana >= 420) {
                    usuario.get().setSuperaLimiteAtividade(true);
                }
            }

            if (idadeUsuario >= 61) {
                if (checkInDto.getDuracaoAtividade() >= 30) {
                    sugestaoDeAtividade = "Cuidado! O excesso de atividade física também pode fazer mal para sua saúde!";
                } else {
                    sugestaoDeAtividade = "Seu limite é de: 30 minutos de atividade por\n" +
                            "checkin, limitado a 90 minutos por semana.";
                }
                limiteAtividadeSemana += checkInDto.getDuracaoAtividade();
                if (limiteAtividadeSemana >= 90) {
                    usuario.get().setSuperaLimiteAtividade(true);
                }
            }
            quantidadeTotalCheckIns += 1;
        }

        if (usuario.isPresent()) {
            usuario.get().setQuantidadeCheckIn(quantidadeTotalCheckIns);
            usuario.get().setLimiteAtividadeSemana(limiteAtividadeSemana);
            usuarioRepository.save(usuario.get());
        }

        repository.save(checkInSalvo);
        return sugestaoDeAtividade;
    }
}
