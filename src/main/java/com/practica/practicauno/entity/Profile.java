package com.practica.practicauno.entity;

import javax.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
