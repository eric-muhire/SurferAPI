package com.grupparbete.repositories;

import com.grupparbete.entities.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Service
public class UserInMemoryRepository {
    Map<Long, User> users = new HashMap<>();

    public Collection<User> getAll() {
        return users.values();
    }

    public User getById(long id) {
        return users.get(id);

        }

    public User addUser (User user){
        users.put(user.getId(), user);
        return users.get(user.getId());

        }
        public User updateUser (Long id, User user){
            users.put(id, user);
            return users.get(id);
        }
        public void deleteUser (int id){
            users.remove(id);
        }
    }


