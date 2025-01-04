package com.wjbos.gatesystem.features.token.exceptions;

public class TokenValueDoesNotExistsException extends RuntimeException {
    public TokenValueDoesNotExistsException(String tokenValue) {
        super(String.format("Token does not exist for token Value: %s", tokenValue));
    }
}
