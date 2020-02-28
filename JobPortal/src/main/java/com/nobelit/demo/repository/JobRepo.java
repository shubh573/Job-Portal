package com.nobelit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nobelit.demo.model.Job;

public interface JobRepo extends JpaRepository<Job, Integer>{

	
}
