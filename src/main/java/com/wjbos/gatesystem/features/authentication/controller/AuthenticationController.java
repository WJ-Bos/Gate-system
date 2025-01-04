package com.wjbos.gatesystem.features.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/authentication")
public class AuthenticationController {

    @GetMapping("user")
    public String getUser(){
        return "Hello User";
    }
}
