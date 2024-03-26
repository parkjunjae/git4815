package com.mh.restapi05.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    // 유효성 검사 하기위한
    private Long id;

    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
//    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[])")
    private String password;
    private String role;
    private String imagePath;
}
