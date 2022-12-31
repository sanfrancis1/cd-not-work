package com.concretedetailer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concretedetailer.model.Login;

public interface LoginRepo extends JpaRepository<Login, Long> {
	
	/* @Query("SELECT username  FROM login_info u WHERE u.email = ?1") */
	Login findByUserName(String name);
	
}
