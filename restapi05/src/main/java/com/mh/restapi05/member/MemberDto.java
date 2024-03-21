package com.mh.restapi05.member;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MemberDto {
    // 유효성 검사하는 클래스
    private Long id;

    @Size(min = 3, max = 50)
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;

    private Role role;

}
