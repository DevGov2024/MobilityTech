package br.com.fiap.Mobility.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trajeto")
public class trajeto {

   @GetMapping
    public String getTrajeto() {
        return "Melhores maneiras de um trajeto seguro";
    }
}
