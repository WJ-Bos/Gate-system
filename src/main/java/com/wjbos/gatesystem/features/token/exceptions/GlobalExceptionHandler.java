package com.wjbos.gatesystem.features.token.exceptions;

import com.wjbos.gatesystem.features.token.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleGlobalException(Exception exception, WebRequest request){

        ErrorResponseDto responseDto = new ErrorResponseDto(
                request.getDescription(false),
                HttpStatus.INTERNAL_SERVER_ERROR,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(responseDto,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(TokenDoesNotExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleTokenDoesNotExistException(Exception exception, WebRequest request){
        ErrorResponseDto responseDto = new ErrorResponseDto(
                request.getDescription(false),
                HttpStatus.BAD_REQUEST,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(responseDto,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(TokenDoesNotExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleTokenValueDoesNotExistException(Exception exception, WebRequest request){
        ErrorResponseDto responseDto = new ErrorResponseDto(
                request.getDescription(false),
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(responseDto,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserDoesNotExistException.class)
    public ResponseEntity<ErrorResponseDto> handleUserDoesNotExistException(Exception exception, WebRequest request){
        ErrorResponseDto responseDto = new ErrorResponseDto(
                request.getDescription(false),
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(responseDto,HttpStatus.NOT_FOUND);
    }
}
