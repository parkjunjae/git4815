package org.example.member;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Member {

    private long id;
    private String email;
    private String name;
    private String password;
    private LocalDate localDate;

}
