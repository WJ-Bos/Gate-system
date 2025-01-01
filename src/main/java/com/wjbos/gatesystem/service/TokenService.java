package com.wjbos.gatesystem.service;

public interface TokenService {

    void createToken(String senderCellNumber, String recipientCellNumber);
}
