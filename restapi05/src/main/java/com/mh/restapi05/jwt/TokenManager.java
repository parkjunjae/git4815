package com.mh.restapi05.jwt;

import com.mh.restapi05.member.Member;
import io.jsonwebtoken.Jwts;
import jakarta.validation.Valid;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

import static io.jsonwebtoken.security.Keys.hmacShaKeyFor;

@Component
public class TokenManager {

    @Value("${mh.jwt.secret}")
    private String mykey;

    public String generateToken(Member member){

        return Jwts.builder()
                .subject("mhToken")
                .claim("id",member.getId())
                .claim("username",member.getUsername())
                .claim("email",member.getEmail())
                .claim("role",member.getRole())
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 15))
                .signWith(hmacShaKeyFor(mykey.getBytes()))
                .compact();
    }


}
