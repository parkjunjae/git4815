package com.mh.restapi03.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    //findall, save, deleteBYID, findById

    // select * from user where email =?;  자동으로 만들어 준다
    public User findByEmail(String email);



}
