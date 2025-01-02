package com.wjbos.gatesystem.contoller;

import com.wjbos.gatesystem.dto.ResponseDto;
import com.wjbos.gatesystem.dto.TokenDto;
import com.wjbos.gatesystem.service.impl.TokenServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class TokenController {

    TokenServiceImpl tokenService;

    @PostMapping
    public ResponseEntity<TokenDto> createAndSendEntryToken(String cellNumber){
        tokenService.createToken(cellNumber);
        tokenService.sendCodeViaSMS();
    }
}
