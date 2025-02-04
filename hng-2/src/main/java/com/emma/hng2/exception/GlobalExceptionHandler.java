package com.emma.hng2.exception;


import com.emma.hng2.dto.ErrorDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorDto> handleResourceNotFoundException(MethodArgumentTypeMismatchException ex, HttpServletRequest request) {

        return new ResponseEntity<>(new ErrorDto(ex.getValue().toString(), Boolean.TRUE.toString()), HttpStatus.BAD_REQUEST);
    }
}
