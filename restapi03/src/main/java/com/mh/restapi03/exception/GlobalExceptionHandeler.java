package com.mh.restapi03.exception;

import com.mh.restapi03.users.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

// 모든 예외는 여기서 진행 할 수 있도록 만든다.
@ControllerAdvice // aop 기술
public class GlobalExceptionHandeler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(LoginException.class)
    public final ResponseEntity<ErrorResponse> hanleLoginException(LoginException e){
        ErrorCode errorCode = e.getErrorCode();
        ErrorResponse errorResponse = ErrorResponse.builder()
                .errorCode(e.getErrorCode().getErrorCode())
                .errorMessage(e.getErrorCode().getMessage())
                .wdate(LocalDateTime.now())

                .build();
        return ResponseEntity.status(e.getErrorCode().getHttpStatus()).body(errorResponse);
    }
    @ExceptionHandler(UserException.class)
    public final ResponseEntity<ErrorResponse> handleException(UserException e){
//        UserException exception = (Exception)e;
        ErrorResponse errorResponse
                = ErrorResponse.builder()
                .errorMessage(e.getErrorCode().getMessage())
                .errorCode(e.getErrorCode().getErrorCode())
                .wdate(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
//    @ExceptionHandler(BindException.class) 둘다 똑같다
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatusCode status,
                                                                  WebRequest request)
    {

        System.out.println("유효성 실패 "+ex.getMessage());
        System.out.println("유효성 실패 "+ex.getBindingResult());

        ErrorResponse errorResponse = ErrorResponse.builder()
                .errorCode(HttpStatus.BAD_REQUEST.toString())
                .errorMessage(ex.getBindingResult().toString())
                .wdate(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);

    }

//    @ExceptionHandler(BadException.class)
//    public final ResponseEntity<ErrorResponse> handleException(BadException e){
//        ErrorCode errorCode = e.getErrorCode();
//
//        ErrorResponse errorResponse = ErrorResponse.builder()
//                .errorCode(e.getErrorCode().getErrorCode())
//                .errorMessage(e.getErrorCode().getMessage())
//                .wdate(LocalDateTime.now())
//                .build();
//        return ResponseEntity.status(e.getErrorCode().getHttpStatus()).body(errorResponse);
//    }


}
