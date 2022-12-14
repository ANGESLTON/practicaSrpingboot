package com.practica.practicauno.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ControladorGeneral {

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> saludar(){
        return new ResponseEntity<>("hola estoy usando la anotacion @controller", HttpStatus.OK);
    }
}
