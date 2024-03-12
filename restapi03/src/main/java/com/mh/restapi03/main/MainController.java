package com.mh.restapi03.main;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080/users")
public class MainController {


    @GetMapping("/")
    public String hello(){

        return "hello";
    }

    @PostMapping("greet")
    public String greet(String param){

        return "greet  "+param ;
    }
}
