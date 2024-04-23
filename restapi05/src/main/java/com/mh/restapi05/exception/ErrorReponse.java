package com.mh.restapi05.exception;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorReponse {
    private String message;
    private String reason;

}
