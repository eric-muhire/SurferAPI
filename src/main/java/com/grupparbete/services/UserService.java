package com.grupparbete.services;

import com.grupparbete.entities.User;
import com.grupparbete.repositories.UserInMemoryRepository;
import com.grupparbete.repositories.UserSqlRepository;
import com.grupparbete.requests.AddUserRequest;
import com.grupparbete.requests.UpdateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    private UserSqlRepository userRepository;
    public Collection<User>getAll(){
        return userRepository.findAll();
    }
    public User getById(int id){
        return userRepository.findById(id).get();
    }
    public User addUser(AddUserRequest request){
        var user=new User();
        user.setId(request.getId());
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());

        return userRepository.save(user);

    }
    public User updateUser(int id, UpdateUserRequest request) {
        var user = userRepository.getById(id);
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());
        return userRepository.save(user);
    }
    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

}
