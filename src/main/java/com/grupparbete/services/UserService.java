package com.grupparbete.services;

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
    public User getById(int id){
        return userRepository.getById(id);
    }
    public User addUser(AddUserRequest request){
        var user=new User();
        user.setId(request.getId());
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());

        return userRepository.addUser(user);

    }
    public User updateUser(int id, UpdateUserRequest request) {
        var user = userRepository.getById(id);
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());
        return userRepository.updateUser(id, user);
    }
    public void deleteUser(int id){
        userRepository.deleteUser(id);
    }
}
