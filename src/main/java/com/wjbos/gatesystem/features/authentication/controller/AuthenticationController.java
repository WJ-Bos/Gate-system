package com.wjbos.gatesystem.features.authentication.controller;

import com.wjbos.gatesystem.features.authentication.entity.AuthenticationUser;
import com.wjbos.gatesystem.features.authentication.service.impl.AuthenticationServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/authentication")
public class AuthenticationController {

    AuthenticationServiceImpl authService;

    @GetMapping("user")
    public AuthenticationUser getUser(){
        return authService.getUser("user@example.com");
    }
}
