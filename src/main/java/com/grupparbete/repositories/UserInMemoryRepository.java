package com.grupparbete.repositories;

import com.grupparbete.entities.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Service
public class UserInMemoryRepository {
    Map<Integer, User> users = new HashMap<Integer, User>();

    public Collection<User> getAll() {
        return users.values();
    }

    public User getById(int userId) {
        return users.get(userId);
        }
        public User addUser (User user){
            users.put(user.getUserId(), user);
            return users.get(user.getUserId());

        }
        public User updateUser ( int userId, User user){
            users.put(userId, user);
            return users.get(userId);

        }
        public void deleteUser (int userId){
            users.remove(userId);
        }
    }


