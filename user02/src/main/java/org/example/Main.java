package org.example;

import org.example.Conf.MyConf;
import org.example.member.Member;
import org.example.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.member.Member;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);

//        String str[] = context.getBeanDefinitionNames();
//        Arrays.stream(str).forEach(s -> System.out.println(s));


        //builder 을 쓰지않고 사용
        Member member1 = new Member(0,
                "aaa@naver.com",
                "홍길동",
                "1234",
                LocalDate.now()
                );

        Member member2 = Member.builder()
                .email("bbb@naver.com")
                .name("박길동")
                .password("5678")
                .localDate(LocalDate.now())
                .build();


        MemberService ms = context.getBean(MemberService.class);
        ms.regist(member1);
        ms.regist(member2);

        ms.list();









        context.close();



    }
}