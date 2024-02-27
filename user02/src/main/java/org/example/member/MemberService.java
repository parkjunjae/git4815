package org.example.member;


import lombok.ToString;
import org.example.component.AABBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;

@Component
@Service
public class MemberService {


    @Autowired
    MemberDao memberDao;

    @Autowired
    @Qualifier("AABBService")
    AABBService aabbService;


    // member 객체 등록
    public void regist(Member member){
    memberDao.insert(member);
    }

    //member 객체 출력
    public void list(){
       Collection<Member> collection = memberDao.select();
       collection.stream().forEach(System.out::println);
    }


}
