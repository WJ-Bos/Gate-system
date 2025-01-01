package com.wjbos.gatesystem.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Token {

    @Id
    @Column(name = "token_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tokenId;
    @Column(name = "token_value")
    private String tokenValue;
    @Column(name = "time_issued")
    private LocalDateTime timeIssued;
    @Column(name = "sender_cell_number")
    private String senderCellNumber;
    private String recipientCellNumber;
    @Column(name = "has_entered")
    private boolean hasEntered;
    private boolean hasExited;
}
