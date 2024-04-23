package com.mh.restapi05.member;


import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

// MemberService 는 UserDetailsService 이다
// 그러므로
@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    public Member save(Member member){

        Optional<Member> optionalMember = memberRepository.findByEmail(member.getEmail());
        // 안에 내용이 있으면(같은 이메일이 있으면)
        if (optionalMember.isPresent()){
            throw new IllegalStateException("이미존재하는 회원입니다");
        }

        return memberRepository.save(member);

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("일로오나");
        return null;
    }
}
