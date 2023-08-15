package net.loginoauth.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.loginoauth.dto.UserRegisteredDTO;
import net.loginoauth.model.User;


public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);




	
}
