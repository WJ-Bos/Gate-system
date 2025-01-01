package com.wjbos.gatesystem.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ResponseDto {
    private String message;
    private String statusCode;
}
