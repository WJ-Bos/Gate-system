package com.wjbos.gatesystem.exceptions;

public class UserDoesNotExistException extends RuntimeException {
    public UserDoesNotExistException(String username) {
        super(String.format("User with username: %s does not exist"));
    }
}
