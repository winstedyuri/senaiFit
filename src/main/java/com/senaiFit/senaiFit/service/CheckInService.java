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

        if (usuario.isPresent()) {
            checkInSalvo.setUsuario(usuario.get());
        }

        if (atividade.isPresent()) {
            checkInSalvo.setAtividade(atividade.get());
            int idade = usuario.get().getIdade();
            int duracao = atividade.get().getDuracao();

            if (idade >= 14 && idade <= 18) {
                sugestaoDeAtividade = "Seu limite é de: 45 minutos de atividades por\n" +
                        "checkin, limitado a 135 minutos por semana.";
            }

            if (idade >= 19 && idade <= 60) {
                sugestaoDeAtividade = "Seu limite é de: 60 minutos de atividade por\n" +
                        "checkin, limitado a 420 minutos por semana.";
            }

            if (idade >= 61) {
                sugestaoDeAtividade = "Seu limite é de: 30 minutos de atividade por\n" +
                        "checkin, limitado a 90 minutos por semana.";
            }

        }
        repository.save(checkInSalvo);
        return sugestaoDeAtividade;
    }
}
