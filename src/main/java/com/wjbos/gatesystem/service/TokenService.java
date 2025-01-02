package com.wjbos.gatesystem.service;

import com.wjbos.gatesystem.dto.TokenDto;

public interface TokenService {

    TokenDto createToken(String recipientCellNumber);
}
