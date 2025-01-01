package com.wjbos.gatesystem.service.impl;

import com.wjbos.gatesystem.entity.Token;
import com.wjbos.gatesystem.service.TokenService;

import java.util.Random;

public class TokenServiceImpl implements TokenService {

    @Override
    public void createToken(String senderCellNumber, String recipientCellNumber) {
        Token token = new Token();
        Random random = new Random();

        //TODO: Add 6 digit random token value
        token.setTokenValue();
    }
}
