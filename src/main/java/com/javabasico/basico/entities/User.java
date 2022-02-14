package com.javabasico.basico.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Faz com que essa classe seja monitorada pela JPA
@Table(name = "tb_user")
public class User {
    
    @Id //indica que esse atributo é uma primarykey
    @GeneratedValue(strategy = GenerationType.IDENTITY) //fala que é autoincremental
    private Long id;
    private String name;
    private String password;

    public User() {}

    public User(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
