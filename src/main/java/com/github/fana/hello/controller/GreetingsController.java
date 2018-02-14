package com.github.fana.hello.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greet", produces = MediaType.APPLICATION_JSON_VALUE)
public class GreetingsController {

    @GetMapping
    public String greetStranger(){
        return greetWithName("Stranger");
    }

    @GetMapping("/{name}")
    public String greetKnownPerson(@PathVariable("name") String name){
        return greetWithName(name);
    }

    private String greetWithName(String name){
        return "Eita, " + name + "!";
    }
}
