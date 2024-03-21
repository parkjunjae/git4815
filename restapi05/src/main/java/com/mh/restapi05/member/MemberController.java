package com.mh.restapi05.member;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("")
    public String member() {
        return "member";
    }

    @PostMapping("")
    public String member(@Valid @RequestBody MemberDto memberDto) {
        System.out.println("memberDto "+memberDto);
        ModelMapper modelMapper = new ModelMapper();
        Member member = modelMapper.map(memberDto,Member.class);
//        BeanUtils.copyProperties(memberDto,member); // modelMapper 든 BeanUtils 든 setter 가 있어야 복사가 가능하다.
//        System.out.println("member "+member);
        memberService.save(member);
        return "member";
    }
}
