package com.senaiFit.senaiFit.controller;

import com.senaiFit.senaiFit.Dto.CheckInDto;
import com.senaiFit.senaiFit.Service.CheckInService;
import com.senaiFit.senaiFit.entidade.CheckIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/checkin")

public class CheckInController {

    @Autowired
    CheckInService service;

    @PostMapping
    public ResponseEntity<String> criaCheckIn(@RequestBody CheckInDto checkInDto){
        String checkRetorno = service.criaCheckIn(checkInDto);
        return ResponseEntity.ok(checkRetorno);
    }

}
