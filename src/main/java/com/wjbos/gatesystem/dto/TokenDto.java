package com.wjbos.gatesystem.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Validated
@NoArgsConstructor
public class TokenDto {
    private String tokenId;
    private String senderCellNumber;
    private String recipientCellNumber;
    @NotEmpty(message = "token value cannot be empty")
    private String tokenValue;
    private LocalDateTime timeIssued;
    private boolean hasEntered;
    private boolean hasExited;
}
