package com.devsuper.hrpayroll.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuper.hrpayroll.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
