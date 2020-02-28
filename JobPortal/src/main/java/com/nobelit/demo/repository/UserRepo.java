package com.nobelit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nobelit.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
