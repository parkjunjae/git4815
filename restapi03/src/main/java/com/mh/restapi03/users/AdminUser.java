package com.mh.restapi03.users;


import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@JsonFilter("AdminUser")
public class AdminUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String username;
    @Column(length = 50,unique = true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Gender gender;


    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")

    private LocalDateTime wdate;

}
