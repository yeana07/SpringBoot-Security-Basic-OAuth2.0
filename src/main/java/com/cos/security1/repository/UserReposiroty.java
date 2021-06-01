package com.cos.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.security1.model.User;

// CRUD 함수를 JpaRepository가 가지고 있음
// @Repository라는 어노테이션이 없어도 IoC 됨 -> JpaRepo를 상속했기 때문
public interface UserReposiroty extends JpaRepository<User, Integer> {

	// findBy규칙 -> Username문법
	// select * from user where username = 1? ->  1? = username
	public User findByUsername(String username); // Jpa query methods 검색
}
