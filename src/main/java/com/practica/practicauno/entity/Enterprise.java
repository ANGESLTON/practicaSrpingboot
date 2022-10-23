package com.practica.practicauno.entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Enterprise {
    @Id
    private Long id;
    @OneToMany
    private  Employee employee;


}
