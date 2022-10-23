package com.practica.practicauno.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name="main", unique = true)
    private String email;

    @ManyToOne
   private Enterprise enterprise;

    private Date updateAt;
    private Date createAt;

    public Employee(){

    }

    public Employee(Long id, String email, Enterprise enterprise, Date updateAt, Date createAt) {
        this.id = id;
        this.email = email;
        this.enterprise = enterprise;
        this.updateAt = updateAt;
        this.createAt = createAt;
    }
}
