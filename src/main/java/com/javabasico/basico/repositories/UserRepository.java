package com.javabasico.basico.repositories;

import com.javabasico.basico.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
