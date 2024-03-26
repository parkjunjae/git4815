package com.mh.restapi05.user;


import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String email;

    private String password;
    private String role;
    private String imagePath;
}
