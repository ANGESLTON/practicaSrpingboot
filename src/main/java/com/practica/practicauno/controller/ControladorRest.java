package com.practica.practicauno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping ("/")
    public String saludar(){
        return "hola mundo estoy en Spring boot";
    }
    @GetMapping ("/about")
    public String presentar(){
        return "Hola, mi nombre es Ange Pineda";
    }
}
