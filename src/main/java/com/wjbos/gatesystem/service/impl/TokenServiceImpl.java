package com.wjbos.gatesystem.service.impl;

import com.wjbos.gatesystem.entity.Token;
import com.wjbos.gatesystem.service.TokenService;

import java.util.Random;

public class TokenServiceImpl implements TokenService {

    @Override
    public void createToken( String recipientCellNumber) {
        Token token = new Token();
        Random rnd = new Random();
        int code = rnd.nextInt(999999);

        token.setTokenValue(String.format("%06d", code));
    }
}
