package com.springbootexercise.developersapi.service;

import com.springbootexercise.developersapi.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface {

    List<User> userList= new ArrayList<>( Arrays.asList(
            new User(1L,"kenneth","Java "),
            new User(2L,"Eric","Database "),
            new User(3L,"Thomas","Angular")));

    @Override
    public List<User>getAllUsers()
    {
        return userList;
    }

    @Override
    public User getUser(Long userId)
    {
        User user1 = userList.stream().filter(user -> user.getId().equals(userId)).findFirst().get();
        return  user1;
    }

    @Override
    public void addUser(User user) {
        userList.add(user);

    }

    @Override
    public void updateUser(Long userId, User user) {
        for (User user1 : userList) {
            if(user1.getId().equals(userId))
            {
                userList.set(1,user);
            }

        }
    }
    @Override
    public void deleteUser(Long userId)
    {
        userList.removeIf(user -> user.getId().equals(userId));

    }
}
