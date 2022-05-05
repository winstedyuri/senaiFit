package com.senaiFit.senaiFit.service;

import com.senaiFit.senaiFit.entidade.Usuario;
import com.senaiFit.senaiFit.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public Usuario criaUsuario(Usuario usuario){
        Usuario usuarioSalvo = new Usuario();
        usuarioSalvo.setAltura(usuario.getAltura());
        usuarioSalvo.setCpf(usuario.getCpf());
        usuarioSalvo.setEndereco(usuario.getEndereco());
        usuarioSalvo.setIdade(usuario.getIdade());
        usuarioSalvo.setNome(usuario.getNome());
        usuarioSalvo.setSexo(usuario.getSexo());
        usuarioSalvo.setPeso(usuario.getPeso());
        usuarioSalvo.setDataNascimento(usuario.getDataNascimento());
        repository.save(usuarioSalvo);
        return usuarioSalvo;

    }
}
