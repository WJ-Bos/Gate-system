package com.wjbos.gatesystem.features.token.contoller;

import com.wjbos.gatesystem.features.token.dto.ResponseDto;
import com.wjbos.gatesystem.features.token.service.impl.TokenServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/token")
public class TokenController {

    TokenServiceImpl tokenService;

    @PostMapping
    public ResponseEntity<ResponseDto> createAndSendEntryToken(String cellNumber) {
        tokenService.sendTokenViaSMS(cellNumber);
        tokenService.createToken(cellNumber);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto("Token Created and Sent", "201"));
    }
}
