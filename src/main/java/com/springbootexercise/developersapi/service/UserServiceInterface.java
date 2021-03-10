package com.springbootexercise.developersapi.service;

import com.springbootexercise.developersapi.domain.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUsers();

    User getUser(Long userId);

    void addUser(User user);

    void updateUser(Long userId, User user);

    void deleteUser(Long userId);
}
