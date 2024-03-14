package com.mh.restapi03.users;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @NotBlank
    private String username;

    private String email;

    private String password;

    private Gender gender;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")

    private LocalDateTime wdate;


}
