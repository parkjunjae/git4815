package com.mh.restapi03.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class LoginException extends RuntimeException {

    private ErrorCode errorCode;

    public LoginException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
