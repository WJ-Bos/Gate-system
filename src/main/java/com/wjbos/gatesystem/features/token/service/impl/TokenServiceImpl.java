package com.wjbos.gatesystem.features.token.service.impl;

import com.wjbos.gatesystem.features.token.entity.Token;
import com.wjbos.gatesystem.features.token.exceptions.TokenDoesNotExistsException;
import com.wjbos.gatesystem.features.token.exceptions.TokenValueDoesNotExistsException;
import com.wjbos.gatesystem.features.token.repo.TokenRepository;
import com.wjbos.gatesystem.features.token.service.TokenService;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@AllArgsConstructor
@Service
public class TokenServiceImpl implements TokenService {

    TokenRepository tokenRepository;

    @Override
    public void createToken(@Pattern(regexp = "^\\+27\\s?[6-8]\\d{8}$\n", message = "Not a Valid cell Number")
                                   String recipientCellNumber){
        Token token = new Token();
        Random rnd = new Random();
        int code = rnd.nextInt(999999);

        token.setTokenValue(String.format("%06d", code));
        token.setRecipientCellNumber(recipientCellNumber);
        token.setTimeIssued(LocalDateTime.now());
        token.setHasEntered(false);
        token.setHasExited(false);

        tokenRepository.save(token);
    }

    public boolean sendTokenViaSMS(String cellNumber) {
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
