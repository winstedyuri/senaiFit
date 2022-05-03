package com.senaiFit.senaiFit.controller;

import com.senaiFit.senaiFit.Service.AtividadeService;
import com.senaiFit.senaiFit.Service.UsuarioService;
import com.senaiFit.senaiFit.entidade.Atividade;
import com.senaiFit.senaiFit.entidade.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/atividade")
public class AtividadeController {

    @Autowired
    AtividadeService service;

    @PostMapping(value = "/novo")
    public ResponseEntity<Atividade> novaAtividade(@RequestBody Atividade atividade){
        Atividade atividadeRetorno = service.criaAtividade(atividade);
        return ResponseEntity.ok(atividadeRetorno);
    }

}
