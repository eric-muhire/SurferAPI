package com.grupparbete.services;

import com.grupparbete.repositories.UserSqlRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class UserServiceTest {

    @Mock
    private UserSqlRepository userSqlRepository;
    AutoCloseable autoCloseable;
    private UserService underTest;

    @BeforeEach
    void setUp() {
     AutoCloseable autoCloseable=MockitoAnnotations.openMocks(this);
        underTest=new UserService(userSqlRepository);
    }
    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }


    @Test
    void getAll() {
        //when
        underTest.getAll();
        //then
        verify(userSqlRepository).findAll();
    }
/*
    @Test
    void getById() {
    }

    @Test
    void addUser() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }*/
}