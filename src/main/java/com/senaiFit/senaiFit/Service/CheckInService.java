package com.senaiFit.senaiFit.Service;

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

    public CheckIn criaCheckIn(CheckInDto checkInDto) {
        CheckIn checkInSalvo = new CheckIn();
        Atividade atividade = atividadeRepository.getById(checkInDto.getAtividadeId());
        Usuario usuario = usuarioRepository.getById(checkInDto.getUsuarioId());
        checkInSalvo.setAtividade(atividade);
        checkInSalvo.setUsuario(usuario);
        repository.save(checkInSalvo);
        return checkInSalvo;
    }
}
