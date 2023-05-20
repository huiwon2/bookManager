package com.fascampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest extends Object{
    @Test
    void test(){
        User user = new User();
        user.setName("huiwon");
        user.setEmail("snowman4453@gmail.com");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(1, "sunghyun", "park@naver.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("joon", "ticoland@naver.com");
        User user3 = User.builder().name("martin").email("martin@fastcampus.com").build();
        System.out.println(">>>" + user.toString());
    }
}