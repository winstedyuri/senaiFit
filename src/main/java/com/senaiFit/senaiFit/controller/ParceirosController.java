package com.senaiFit.senaiFit.controller;

import com.senaiFit.senaiFit.entidade.Parceiros;
import com.senaiFit.senaiFit.service.ParceirosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/parceiros")
public class ParceirosController {

    @Autowired
    ParceirosService service;

    @PostMapping(value = "/novo")
    public ResponseEntity<Parceiros> novaAcademia(@RequestBody Parceiros parceiros){
        Parceiros academiaRetorno = service.criaParceiros(parceiros);
        return ResponseEntity.ok(academiaRetorno);
    }
}
