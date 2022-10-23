package com.practica.practicauno.entity;

import javax.persistence.*;

@Entity
@Table(name = "enterprise")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany
    private  Employee employee;


}
