package com.wjbos.gatesystem.features.token.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ResponseDto {
    private String message;
    private String statusCode;
}
