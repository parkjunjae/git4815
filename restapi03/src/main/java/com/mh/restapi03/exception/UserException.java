package com.mh.restapi03.exception;

import lombok.Getter;

@Getter
public class UserException extends RuntimeException {

    private ErrorCode errorCode;

    public UserException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
