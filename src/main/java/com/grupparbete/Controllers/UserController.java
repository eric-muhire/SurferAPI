package com.grupparbete.Controllers;

import com.grupparbete.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

Map<Long, User> users=new HashMap<Long,User>();
        @GetMapping("/")
        public Collection<User> getAll() {
            return users.values();
            
    }
    @GetMapping ("/{userId}")
    public User getByUserId (@PathVariable long UserId) {
            return users.get(UserId);
    }
    @PostMapping("/")
    public User addNewUser(@RequestBody User user){
            users.put((long) user.getUserId(),user);
            return user;
    }
    @PutMapping ("/{userId}")
    public User updateUser(@PathVariable long UserId,
                           @RequestBody User updatedUser){
            User user = users.get(UserId);
            user.setUserId(updatedUser.getUserId());
            user.setUserName(updatedUser.getUserName());
            user.setUserEmail(updatedUser.getUserEmail());
            return user;
    }
    @DeleteMapping ("/{UserId}")
    public void deleteUser (@PathVariable long UserId) {
            users.remove(UserId);
    }

}
