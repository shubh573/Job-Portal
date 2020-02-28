package com.nobelit.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nobelit.demo.model.Job;
import com.nobelit.demo.repository.JobRepo;

@Service
public class JobService {

	@Autowired
	private JobRepo jRepo;

	public List<Job> getAllJobs() {
		return jRepo.findAll();
	}

	public Job getJobById(int jid) {
		Optional<Job> findById = jRepo.findById(jid);
		return findById.get();
	}

	public Job saveOrUpdate(Job job) {
		return jRepo.save(job);
	}

	public void deleteJobById(int jid) {
		jRepo.deleteById(jid);
	}

}
