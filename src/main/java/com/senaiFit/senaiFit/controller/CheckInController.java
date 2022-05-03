package com.senaiFit.senaiFit.controller;

import com.senaiFit.senaiFit.entidade.Checkin;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/checkin")

public class CheckInController {
    @PostMapping
    public ResponseEntity<String> criaCheckIn(Checkin checkin){
        return ResponseEntity.ok("teste");
    }
}
