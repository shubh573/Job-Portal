package com.nobelit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nobelit.demo.model.Employer;

public interface EmployerRepo extends JpaRepository<Employer, Integer>{

}
