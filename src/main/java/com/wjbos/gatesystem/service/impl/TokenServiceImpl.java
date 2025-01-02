package com.wjbos.gatesystem.service.impl;

import com.wjbos.gatesystem.dto.TokenDto;
import com.wjbos.gatesystem.entity.Token;
import com.wjbos.gatesystem.exceptions.TokenDoesNotExistsException;
import com.wjbos.gatesystem.exceptions.TokenValueDoesNotExistsException;
import com.wjbos.gatesystem.mapper.TokenMapper;
import com.wjbos.gatesystem.repo.TokenRepository;
import com.wjbos.gatesystem.service.TokenService;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService {

    TokenRepository tokenRepository;

    @Override
    public TokenDto createToken(String recipientCellNumber) {
        Token token = new Token();
        Random rnd = new Random();
        int code = rnd.nextInt(999999);

        token.setTokenValue(String.format("%06d", code));
        token.setRecipientCellNumber(recipientCellNumber);
        token.setTimeIssued(LocalDateTime.now());
        token.setHasEntered(false);
        token.setHasExited(false);

        tokenRepository.save(token);
        return TokenMapper.mapToTokenDto(token);
    }

    public void sendTokenViaSMS(String cellNumber) {
        Token userToken = tokenRepository.findByRecipientCellNumber(cellNumber).orElseThrow(
                () -> new TokenDoesNotExistsException(cellNumber));

        if (userToken != null) {
           //TODO: Add the sending a SMS using userToken.getTokenValue as argument
        }
    }

    public void updateEnteredValue(String tokenValue){
        Token token = tokenRepository.findByTokenValue(tokenValue).orElseThrow(
                () -> new TokenValueDoesNotExistsException(tokenValue)
        );
        token.setHasEntered(true);
        tokenRepository.save(token);
    }

    public void updateExitedValue(String tokenValue){
        Token token = tokenRepository.findByTokenValue(tokenValue).orElseThrow(
                () -> new TokenValueDoesNotExistsException(tokenValue)
        );
        tokenRepository.delete(token);
    }
}
