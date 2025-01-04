package com.wjbos.gatesystem.features.token.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class TokenDoesNotExistsException extends RuntimeException {
    public TokenDoesNotExistsException(String cellnumber) {
        super(String.format("Token does not exist for cellnumber: %s", cellnumber));
    }
}
