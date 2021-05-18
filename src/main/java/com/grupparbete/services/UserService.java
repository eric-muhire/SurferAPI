package com.grupparbete.services;
import com.grupparbete.entities.User;
import com.grupparbete.repositories.BeachSqlRepository;
import com.grupparbete.repositories.PostSqlRepository;
import com.grupparbete.repositories.UserSqlRepository;
import com.grupparbete.requests.AddUserRequest;
import com.grupparbete.requests.UpdateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserSqlRepository userRepository;
    private final PostSqlRepository repository;
    private final BeachSqlRepository beachSqlRepository;


    public Collection<User>getAll(){
        return userRepository.findAll();
    }
    public User getById(Long id) {
        return userRepository.findById(id).get();

    }
    public User addUser(AddUserRequest request) {
        var user = new User();
        user.setId(request.getId());
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());
        user = userRepository.save(user);
        return user;
    }


    public User updateUser(Long id, UpdateUserRequest request) {
        var user = userRepository.findById(id).get();
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());
        user = userRepository.save(user);
            return user;
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
