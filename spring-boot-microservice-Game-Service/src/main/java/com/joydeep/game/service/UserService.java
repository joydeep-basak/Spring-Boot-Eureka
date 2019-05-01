package com.joydeep.game.service;

import java.util.List;

import com.joydeep.game.model.User;
import com.joydeep.game.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
