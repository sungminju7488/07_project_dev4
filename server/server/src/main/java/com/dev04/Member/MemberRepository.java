package com.dev04.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member, Long>{
	
	@Query("select m from Member m where email = :email and password = :password")
	Member findMember(String email, String password);
	
}