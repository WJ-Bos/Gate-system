package com.wjbos.gatesystem.service;

import com.wjbos.gatesystem.dto.UserDto;

public interface UserService {
    void createUser(UserDto user);

    UserDto signIn(String userName, String password);
}
