package com.mh.restapi03.users;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


// 사용자 요청해서 유효성 검사

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "UserDto Table 에 대한 내용입니다.")
public class UserDto {
    private Long id;
    @NotBlank // 빈공백을 입력 못한다.
    private String username;

    @Size(min = 5, max = 50)
    private String email;
    private String password;
    private Gender gender;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime wdate;

//    public static User of(UserDto userDto){
//        User user = new User();
//       user.setId(userDto.getId());
//        user.setEmail(userDto.getEmail());
//        user.setUsername(userDto.getUsername());
//        user.setPassword(userDto.getPassword());
//        user.setWdate(LocalDateTime.now());
//        user.setGender(userDto.getGender());
//        return  user;
//    }
}
