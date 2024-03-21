package com.mh.restapi05.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {


    //select * from member where email = ?
    // 해당하는 이메일이 있는지 검사
    Optional<Member> findByEmail(String email);


    Member findByEmailAndPassword(String email, String password);
}
