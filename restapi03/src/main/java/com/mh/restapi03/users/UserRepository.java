package com.mh.restapi03.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    // select * from user where email =?;  자동으로 만들어 준다
    public User findByEmail(String email);


    //select * from user where username like '%길동%' or email like '%aaa'
    public List<User> findByUsernameContainingOrEmailContaining(String username,String email);

    //JPA Queydsl
    @Query(value = "select m from User m where m.email = :email")
    public User findByCustom(String email);





}
