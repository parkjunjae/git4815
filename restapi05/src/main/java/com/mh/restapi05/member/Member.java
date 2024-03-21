package com.mh.restapi05.member;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String username;
    @Column(length = 50,nullable = false)
    private String password;
    @Column(length = 50,nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @CreatedDate // 작성일자를 자동으로 입력해준댜.(insert 한 시간)
    private LocalDateTime writedate;
    @LastModifiedDate // 수정일자를 자동으로 입력해준다.(select/ update 한 시간)
    private LocalDateTime modifydate;

}
