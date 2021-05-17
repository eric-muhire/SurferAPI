package com.grupparbete.services;

import com.grupparbete.entities.User;
import com.grupparbete.repositories.BeachSqlRepository;
import com.grupparbete.repositories.PostSqlRepository;
import com.grupparbete.repositories.UserSqlRepository;
import com.grupparbete.requests.UpdateUserRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

class UserServiceTest {

    private UserService sut;

    private UserSqlRepository userSqlRepository;
    private PostSqlRepository repository;
    private BeachSqlRepository beachSqlRepository;


    @BeforeEach

    void initTests(){

        this.userSqlRepository= Mockito.mock(UserSqlRepository.class);
        this.repository= Mockito.mock(PostSqlRepository.class);
        this.beachSqlRepository=Mockito.mock(BeachSqlRepository.class);


        this.sut=new UserService(this.userSqlRepository,this.repository,this.beachSqlRepository);

    }

    @Test
    public void UserService_updateUser_Success(){

        //ARRANGE
        var user=new User();
        user.setId(1L);
        user.setUserName("test");
        user.setUserEmail("test");
        Optional<User> userMock;
        userMock = Optional.of((User) user);

        when(userSqlRepository.findById(anyLong())).thenReturn(userMock);
        when(userSqlRepository.save(any(User.class))).thenReturn(user);

        var updateUserRequest=new UpdateUserRequest();
        updateUserRequest.setUserName("mike");
        updateUserRequest.setUserEmail("mike@gmail.com");


        //ACT
        var result=sut.updateUser(1L, updateUserRequest);
        //ASSERT
        assertEquals(updateUserRequest.getUserName(),result.getUserName());
        assertEquals(updateUserRequest.getUserEmail(),result.getUserEmail());


    }

}