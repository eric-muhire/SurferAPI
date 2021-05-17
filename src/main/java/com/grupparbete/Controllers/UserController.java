package com.grupparbete.Controllers;
import com.grupparbete.entities.User;
import com.grupparbete.requests.AddUserRequest;
import com.grupparbete.requests.UpdateUserRequest;
import com.grupparbete.school.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user/login")
public class UserController {
        

    private final UserService userService;

    @GetMapping("/")
    @ApiOperation(value ="Get all Users" ,
            notes="Fetches all Users from the API",
            response = User.class,
            responseContainer = "list")

    public Collection<User> getAll() {
        return userService.getAll();

    }

    @GetMapping("/{userId}")
    @ApiOperation(
            value = "Get Surfer by userId",
            notes = "Get Surfer with a specific userId",
            response=User.class)
    public User getById(@ApiParam(value ="userId of the surfer",required = true )
                        @PathVariable long userId) {
        return userService.getById(userId);
    }

    @PostMapping("/")
    @ApiOperation(
            value = "Add a new user",
            notes = "Create a new user",
            response=User.class)
    public User addNewUser(@RequestBody AddUserRequest request) {
        return userService.addUser(request);
    }

    @PutMapping("/{userId}")
    @ApiOperation(
            value = "Update user by userId",
            notes = "Only user name will be updated",
            response=User.class)
    public User updateUser(@ApiParam(value ="userId of the surfer",required = true )
                           @PathVariable long userId,
                           @RequestBody UpdateUserRequest request) {

        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    @ApiOperation(
            value = "Delete user by userId",
            notes = "Delete User with a specific userId ",
            response=User.class)
    public void deleteUser(@ApiParam(value ="userId of the surfer",required = true )
                           @PathVariable long userId) {
        userService.deleteUser(userId);
    }
}