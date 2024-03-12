package com.mh.restapi03.exception;

import lombok.Getter;

@Getter
public class BadException extends RuntimeException {

    private ErrorCode errorCode ;

    public BadException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
