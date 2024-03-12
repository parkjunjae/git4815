package com.mh.restapi03.users;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")  // table 이름을 바꾸는 어노테이션
@Schema(description = "User Table 에 대한 내용입니다.")
public class User {

    // SEQUENCE 테이블을 생성해서 기본키
    //IDENTITY AUTO_INCREMENT 자동증가키

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키
    @Schema(title = "사용자 ID",defaultValue = "table에서 자동으로 생성되는 컬럼입니다.")
    private Long id;

    @Column(length = 50)
    @Schema(title = "사용자 username",description = "사용자 이름을 넣어주면 됩니다.")
    private String username;
    @Column(length = 50, unique = true ) // 중복나게 되면 insert 실패
    @Schema(title = "사용자 email",description = "사용자 이메일을 넣어주면 됩니다.")   // 이름을 지정할 수 있다.
    private String email;

    @JsonIgnore //프론트에 보여지고 싶지 않을 때
    private String password;

    // male ,female 값을 넣을 수 있다.
    @Enumerated(EnumType.STRING)
//    @Enumerated(EnumType.ORDINAL)  -> male = 1 번 , female 은 2번 순서 가 들어가게 된다.
    private Gender gender;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime wdate;





}
