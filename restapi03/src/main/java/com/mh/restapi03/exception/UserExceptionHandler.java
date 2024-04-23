package com.mh.restapi03.exception;

import com.mh.restapi03.exception.ErrorResponse;
import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.LoginException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;


@ControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(LoginException.class)
    public final ResponseEntity<ErrorResponse> LoginException(LoginException e){
        ErrorCode errorCode = e.getErrorCode();

        ErrorResponse errorResponse = ErrorResponse.builder()
                .errorCode(e.getErrorCode().getErrorCode())
                .errorMessage(e.getErrorCode().getMessage())
                .wdate(LocalDateTime.now())
                .build();
        return ResponseEntity.status(e.getErrorCode().getHttpStatus()).body(errorResponse);

    }
    @ExceptionHandler(UserException.class)
    public final ResponseEntity<ErrorResponse> UserException(UserException e){
        ErrorCode errorCode = e.getErrorCode();

        ErrorResponse errorResponse = ErrorResponse.builder()
                .errorCode(e.getErrorCode().getErrorCode())
                .errorMessage(e.getErrorCode().getMessage())
                .wdate(LocalDateTime.now())
                .build();

        return ResponseEntity.status(e.getErrorCode().getHttpStatus()).body(errorResponse);

    }
}
