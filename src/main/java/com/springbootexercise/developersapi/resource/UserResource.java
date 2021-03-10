package com.springbootexercise.developersapi.resource;

import com.springbootexercise.developersapi.domain.User;
import com.springbootexercise.developersapi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserResource {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/developers")
    public List<User> getAllUsers()
    {
        List<User> allUsers = userService.getAllUsers();
        return allUsers;
    }

    @RequestMapping("developer/{developerId}")
    public User getUser(@PathVariable Long userId)
    {
        User user = userService.getUser(userId);
        return user;
    }

    @PostMapping("/developer")
    public String createUser(@RequestBody User user)
    {
        userService.addUser(user);
        return "developer is created successfully";
    }
    @PutMapping("/developer/{userId}")
    public String updateUser(@PathVariable Long userId,@RequestBody User user)
    {
        userService.updateUser(userId,user);
        return  "user has been updated successfully";
    }
    @DeleteMapping("/developer/{userId}")
    public String deleteUser(@PathVariable Long userId)
    {
        userService.deleteUser(userId);
        return "user has been successfully deleted";
    }
}
