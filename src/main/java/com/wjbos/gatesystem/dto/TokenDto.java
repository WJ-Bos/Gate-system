package com.wjbos.gatesystem.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Validated
@NoArgsConstructor
public class TokenDto {
    private String tokenId;
    @NotEmpty(message = "Cell Number value cannot be empty")
    @Pattern(regexp = "^\\+27\\s?[6-8]\\d{8}$\n", message = "Not a Valid cell Number")
    private String recipientCellNumber;
    private String tokenValue;
    private LocalDateTime timeIssued;
    private boolean hasEntered;
    private boolean hasExited;
}
