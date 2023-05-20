package com.fascampus.jpa.bookmanager.repository;

import com.fascampus.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository repository;
    @Test
    void crud(){
        repository.save(new User());

        System.out.println(">>>" + repository.findAll());
    }
}