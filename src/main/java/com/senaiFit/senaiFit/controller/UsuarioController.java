package com.senaiFit.senaiFit.controller;

import com.senaiFit.senaiFit.Service.UsuarioService;
import com.senaiFit.senaiFit.entidade.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @PostMapping(value = "/novo")
    public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario usuario){
        Usuario usuarioRetorno = service.criaUsuario(usuario);
        return ResponseEntity.ok(usuarioRetorno);
    }
}
