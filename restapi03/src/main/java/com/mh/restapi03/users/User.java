package com.mh.restapi03.users;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.lang.annotation.Around;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Schema(defaultValue = "user에 대한 내용입니다.")
public class User {

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
