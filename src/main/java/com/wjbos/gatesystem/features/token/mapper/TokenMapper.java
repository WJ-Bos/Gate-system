package com.wjbos.gatesystem.features.token.mapper;

import com.wjbos.gatesystem.features.token.dto.TokenDto;
import com.wjbos.gatesystem.features.token.entity.Token;

public class TokenMapper {

    public static TokenDto mapToTokenDto(Token token) {
        TokenDto tokenDto = new TokenDto();
        tokenDto.setRecipientCellNumber(token.getRecipientCellNumber());
        tokenDto.setTokenValue(token.getTokenValue());
        tokenDto.setTokenId(token.getTokenId());
        tokenDto.setTimeIssued(token.getTimeIssued());
        tokenDto.setHasEntered(token.isHasEntered());
        token.setHasExited(token.isHasExited());
        return tokenDto;
    }
}
