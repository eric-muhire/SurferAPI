package com.grupparbete.services;

import com.grupparbete.entities.Post;
import com.grupparbete.entities.User;
import com.grupparbete.repositories.UserInMemoryRepository;
import com.grupparbete.requests.AddUserRequest;
import com.grupparbete.requests.UpdateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    private UserInMemoryRepository userRepository;
    public Collection<User>getAll(){
        return userRepository.getAll();
    }
    public User getById(int userId){
        return userRepository.getById(userId);
    }
    public User addUser(AddUserRequest request){
        var user=new User();
        user.setUserId(request.getUserId());
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());

        return userRepository.addUser(user);

    }
    public User updateUser(int userId, UpdateUserRequest request) {
        var user = userRepository.getById(userId);
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());
        return userRepository.updateUser(userId, user);
    }
    public void deleteUser(int userId){
        userRepository.deleteUser(userId);
    }

}
