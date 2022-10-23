package com.practica.practicauno.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
public class Employee {

    @Id
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
