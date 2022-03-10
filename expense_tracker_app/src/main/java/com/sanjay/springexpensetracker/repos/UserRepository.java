package com.sanjay.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.springexpensetracker.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findFirstByUsername(String username);
}
