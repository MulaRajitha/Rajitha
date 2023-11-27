package com.cg.dardenrestapiwebservices.service;

import java.util.List;

import com.cg.dardenrestapiwebservices.dto.UserDto;
//import com.cg.dardenrestapiwebservices.entity.User;


public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}