package com.wjbos.gatesystem.service.impl;

import com.wjbos.gatesystem.dto.UserDto;
import com.wjbos.gatesystem.entity.User;
import com.wjbos.gatesystem.repo.UserRepository;
import com.wjbos.gatesystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public void createUser(UserDto user) {
        User newUser = new User();
        newUser.setUserName(user.getUserName());

        //@TODO: Add hashing using spring Sec
        newUser.setPassword(user.getPassword());
        newUser.setCellNumber(String.valueOf(user.getCellNumber()));
        userRepository.save(newUser);
    }
}
