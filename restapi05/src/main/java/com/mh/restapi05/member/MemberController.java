package com.mh.restapi05.member;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @PostMapping("")
    public ResponseEntity<String> member(@Valid @RequestBody MemberDto memberDto) {
        System.out.println("memberDto "+memberDto);
        ModelMapper modelMapper = new ModelMapper();
        Member member = modelMapper.map(memberDto,Member.class);
//        BeanUtils.copyProperties(memberDto,member); // modelMapper 든 BeanUtils 든 setter 가 있어야 복사가 가능하다.
//        System.out.println("member "+member);
        memberService.save(member);
        return ResponseEntity.status(HttpStatus.OK).body("회원가입 성공");
    }

    @GetMapping("")
    public ResponseEntity<List<Member>> member(){
        List<Member> allmember = memberService.getAllMember();
        return ResponseEntity.status(HttpStatus.OK).body(allmember);
    }
}
