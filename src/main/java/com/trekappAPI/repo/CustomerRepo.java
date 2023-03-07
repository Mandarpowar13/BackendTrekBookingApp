package com.trekappAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trekappAPI.entity.Customer;
import com.trekappAPI.user.User;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

	Customer findByEmail(String email);



}
