package com.mh.restapi05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebMvcConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 시큐리티 스프링부트 부트 3버전 람다문법을 써야지만 에러가 안난다.
    // jwt 를 사용하면 이부분은 필요가 없어 진다.

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // 스프링 부트 2버전
        // Post 방식 , Put 방식, delete 방식을 사용할때 csrf 토큰을 사용하지 않겠다.
        // 이것을 허용하겟다.
//        http.csrf( csrf -> csrf.disable());
        http.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable());

        http
                .authorizeRequests(
                        req -> req.anyRequest().permitAll()
//                        req -> req.requestMatchers("/member","/test").permitAll() // 이것만 허용한다.
//                                .anyRequest().authenticated()
////                        autoorizeRequests
//                                .requestMatchers("/member").permitAll()
//                                .anyRequest().authenticated()
                );
        // 스프링 시쿠리티에서 필터를 다는 방법.
//                http.addFilter(filter);
        // 인터셉터 다는 방법..

        return http.build();
    }
    //    @Bean
//    public UserDetailsService userDetailsService(){
//        //유저관리하는 매니저 클래스
//        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
//        // 로그인 할수 있는 유저 생성
//        UserDetails userDetails = User.withUsername("user")
//                .password(passwordEncoder().encode("1234"))
//                .roles("USER")
//                .build();
//        //유저관리 하는 매니저 클래스 유저등록
//        userDetailsManager.createUser(userDetails);
//
//        // 유저관리 하는 매니저 IOC 컨네이터에 등록 -> securityConfig에서 사용
//        return userDetailsManager;
//    }
}

