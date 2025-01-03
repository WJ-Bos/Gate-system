package com.wjbos.gatesystem.contoller;


import com.wjbos.gatesystem.dto.ResponseDto;
import com.wjbos.gatesystem.dto.UserDto;
import com.wjbos.gatesystem.entity.User;
import com.wjbos.gatesystem.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users/")
public class UserController {

    UserServiceImpl userService;

    @PostMapping("/sign-up")
    public ResponseEntity<ResponseDto> signUp(@RequestBody UserDto user){
        userService.createUser(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto("Token Created and Sent", "201"));
    }
}
