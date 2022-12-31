package com.concretedetailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.concretedetailer.model.Login;
import com.concretedetailer.repo.LoginRepo;

public class CustomUserDetailsService implements UserDetailsService {

	
	
	@Autowired
	private LoginRepo loginrepo;

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Login login = loginrepo.findByUserName(username);
		System.out.println(login.getUsername());
		
		if (login == null) {
		    return null;
		}
		return login;
	}

	
	
}
