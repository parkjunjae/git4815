package org.example.member;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Component
@Repository
public class MemberDao {

    private Map<String,Member> map = new HashMap<>();

    public static Long id =0L;



    public void insert(Member member){
        member.setId(++id);
        map.put(member.getEmail(), member);
    }
    public Collection<Member> select(){
        return map.values();
    }

}

