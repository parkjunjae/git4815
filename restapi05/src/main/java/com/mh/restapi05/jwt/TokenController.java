package com.mh.restapi05.jwt;


import com.mh.restapi05.member.Member;
import com.mh.restapi05.member.MemberDto;
import com.mh.restapi05.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TokenController {

    private final TokenManager tokenManager;
    private final MemberRepository memberRepository;


    @GetMapping("/token")
    public String token(@RequestBody TokenDto tokenDto){
        System.out.println("email = " + tokenDto.getEmail());
        System.out.println("password = " + tokenDto.getPassword());

        Member dbmember = memberRepository.findByEmailAndPassword(tokenDto.getEmail(), tokenDto.getPassword());
        return tokenManager.generateToken(dbmember);
    }
}
