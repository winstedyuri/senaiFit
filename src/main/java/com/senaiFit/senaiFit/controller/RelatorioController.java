package com.senaiFit.senaiFit.controller;

import com.senaiFit.senaiFit.entidade.Relatorio;
import com.senaiFit.senaiFit.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping(value = "/relatorio")
public class RelatorioController {
    @Autowired
    RelatorioService relatorioService;

    @GetMapping(value = "/checkin-mes-usuario/{idUsuario}/{dataInicio}/{dataFim}")
    public ResponseEntity<String> buscaCheckinMes(@PathVariable(value = "dataInicio") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataInicio,
                                                   @PathVariable(value = "dataFim") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataFim,
                                                   @PathVariable(value = "idUsuario") Long idUsuario) {
        return ResponseEntity.ok(relatorioService.buscaCheckinMes(dataInicio, dataFim, idUsuario));
    }

    @GetMapping(value = "/checkin-mes-parceiros/{idParceiros}/{dataInicio}/{dataFim}")
    public ResponseEntity<String> buscaCheckinMesParceiros (@PathVariable(value = "dataInicio") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataInicio,
                                                            @PathVariable(value = "dataFim") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataFim,
                                                            @PathVariable(value = "idParceiros") Long idParceiros) {
        return ResponseEntity.ok(relatorioService.buscaCheckinMesParceiros(dataInicio, dataFim, idParceiros));
    }

    @GetMapping(value = "/usuarios-superam-limite/{dataInicio}/{dataFim}")
    public ResponseEntity<String> buscaUsuariosQueSuperaramLimite (@PathVariable(value = "dataInicio") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataInicio,
                                                            @PathVariable(value = "dataFim") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataFim){
        return ResponseEntity.ok(relatorioService.buscaUsuariosQueSuperaramLimite(dataInicio, dataFim));
    }
}
