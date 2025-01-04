package com.wjbos.gatesystem.features.authentication.service.impl;

import com.wjbos.gatesystem.features.authentication.entity.AuthenticationUser;
import com.wjbos.gatesystem.features.authentication.repository.AuthenticationUserRepository;
import com.wjbos.gatesystem.features.authentication.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private AuthenticationUserRepository authenticationUserRepository;

    public AuthenticationUser getUser(String email){
        return authenticationUserRepository.findByEmail(email).orElseThrow(
                () -> new IllegalArgumentException("User not found")
        );


    }
}

