package com.grupparbete.Controllers;

import com.grupparbete.entities.User;
import com.grupparbete.requests.AddUserRequest;
import com.grupparbete.requests.UpdateUserRequest;
import com.grupparbete.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/user/login")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public Collection<User> getAll() {
        return userService.getAll();

    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping("/")
    public User addNewUser(@RequestBody AddUserRequest request) {

        return userService.addUser(request);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id,
                           @RequestBody UpdateUserRequest request) {

        return userService.updateUser(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);

    }
}