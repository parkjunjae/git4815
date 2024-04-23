package org.example.Conf;

import org.example.component.AABBService;
import org.example.member.MemberDao;
import org.example.member.MemberService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan({"org.example.member"})
public class MyConf {

//    @Bean
//    @Qualifier("memberservice1")
//    public org.example.user.MemberService memberService1(){
//        return new org.example.user.MemberService();
//    }


//    @Bean
//    public MemberDao memberDao() {
//        return new MemberDao();
//    }

//    @Bean
//    @Qualifier("memberservice2")
//    public org.example.member.MemberService memberService2() {
//        return new MemberService();
//    }

    @Bean
    public AABBService aabbService() {
        return new AABBService();
    }
}
