package br.com.fiap.Mobility.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {

   @GetMapping
    public String sayHello() {
        return "Hello World";
    }
    @GetMapping("/hello2")
    public String sayHello2() {
        return "Hello World";
    }
    @PostMapping
    public String enviarDados(){
       System.out.println("Enviando dados");
        return "Hello World";
    }
}
