package com.javabasico.basico.services;

import com.javabasico.basico.dto.UserDTO;
import com.javabasico.basico.entities.User;
import com.javabasico.basico.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public UserDTO findById(Long id) {
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }
}
