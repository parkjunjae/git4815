package com.mh.restapi03.main;

import com.mh.restapi03.users.User;
import com.mh.restapi03.users.UserDto;
import com.mh.restapi03.users.UserRepository;
import com.mh.restapi03.users.UserService;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.time.LocalDateTime;
import java.util.List;

@RestController

public class MainController {

    @Value("${jasypt.encryptor.password}")
    String password;

    @GetMapping("/")
    public String hello(){
        return "hello";

    }

    @PostMapping("greet")
    public String greet(String param){
        return "greet"+param;
    }

    @GetMapping("/password")
    public String password(){
        return password();
    }

}



