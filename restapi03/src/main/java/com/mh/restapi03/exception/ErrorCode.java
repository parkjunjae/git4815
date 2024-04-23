package com.mh.restapi03.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.springframework.http.HttpStatus;



@Getter
public enum ErrorCode {
    DUPLICATE(HttpStatus.BAD_REQUEST,"A001","중복된 내용이 있습니다."),
    NOTFOUND(HttpStatus.NOT_FOUND,"NOTFOUND","내용이 없습니다."),
    TEST(HttpStatus.BAD_GATEWAY,"C001","TEST입니다."),
    NOTUPDATEUSER(HttpStatus.NOT_FOUND,"C001","수정할 이메일이 없습니다."),
    NOTDELETE(HttpStatus.BAD_REQUEST,"NOTDELETE","삭제할 아이디가 없습니다.")
    ;

    private HttpStatus httpStatus;

    private String errorCode;

    private String message;

    ErrorCode(HttpStatus httpStatus, String errorCode, String message){
        this.httpStatus = httpStatus;
        this.errorCode  = errorCode;
        this.message = message;

    }
}
