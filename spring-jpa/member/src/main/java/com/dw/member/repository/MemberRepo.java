package com.dw.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.member.model.Member;

//JAP를 상속밥는다
//@Mapper를 사용하지 않는다
public interface MemberRepo extends JpaRepository<Member, Long> { //repository == mapper
	
    //SELECT * FROM dw_member WHERE user_id = "dw"; 
    Member findByuserId(String userId);
    //SELECT * FROM dw_member WHERE user_id = "dw" AND user_password = '123';
    Member findByuserIdAndUserPassword(String userId, String userPassword);
    //SELECT * FROM dw_member WHERE name = "홍길동"; 
   Member findByname(String name);
}
