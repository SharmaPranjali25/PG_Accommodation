package com.codewithpranjali.Paying_Guest_Accomdation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithpranjali.Paying_Guest_Accomdation.entites.User;

import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long> {
static Optional<User> findByEmail(String email) {
	// TODO Auto-generated method stub
	return null;
}
}
