package com.wjbos.gatesystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

    private String tokenValue;
    private LocalDateTime timeIssued;
    private boolean hasEntered;
    private boolean hasExited;
}
