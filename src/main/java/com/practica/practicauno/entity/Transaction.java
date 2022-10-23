package com.practica.practicauno.entity;

import javax.persistence.*;

@Table(name = "transaction")
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
