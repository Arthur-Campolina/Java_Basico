package com.javabasico.basico.dto;

import com.javabasico.basico.entities.User;

public class UserDTO {
    
    private Long id;
    private String name;

    public UserDTO() {
    }

    public UserDTO(Long id, String name) {
        this.id = id; //pra falar que é a pripriedade da classe usa o this
        this.name = name;
    }

    public UserDTO(User user) { //Pra facilitar a conversão de entidades para DTO
        id = user.getId();
        name = user.getName();
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
}