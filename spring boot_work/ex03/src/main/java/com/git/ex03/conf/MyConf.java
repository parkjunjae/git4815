package com.git.ex03.conf;

import com.git.ex03.member.MemberRepository;
import com.git.ex03.member.MemberServide;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* memberContoller
* memberService -> memberRepository
* member
* regist ->
* list ->
* */
@Configuration
public class MyConf {

    @Bean
    public MemberServide memberServide(){
        return new MemberServide();
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepository();
    }

}
