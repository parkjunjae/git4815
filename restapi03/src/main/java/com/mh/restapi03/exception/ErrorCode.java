package com.mh.restapi03.exception;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;


@Getter
@ToString
public enum ErrorCode {
    DUPLICATE(HttpStatus.BAD_REQUEST,"DUPLICATE","중복된 이메일이 있습니다."),
    NOTFOUND(HttpStatus.NOT_FOUND,"NOTFOUND","해당되는 이메일이 없습니다.."),
    TEST(HttpStatus.BAD_GATEWAY,"c001","TEST입니다."),
    NOTUPDATEEMAIL(HttpStatus.NOT_FOUND,"NOTUPDATE","수정할 이메일이 없습니다."),
    NOTDELETE(HttpStatus.NOT_FOUND,"NOTDELETE","삭제할 id가 없습니다"),
    NOTEMAIL(HttpStatus.BAD_REQUEST,"NOTEMAIL","이메일 크기가 작습니다.")
    ;


    private HttpStatus httpStatus;

    private String errorCode;

    private String message;

    ErrorCode(HttpStatus httpStatus, String errorCode, String message) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }
}
