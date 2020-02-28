package com.nobelit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nobelit.demo.model.Job;
import com.nobelit.demo.services.JobService;

@org.springframework.web.bind.annotation.RestController
public class JobController {

	@Autowired
	private JobService jService;
	
	
	@GetMapping("/jobs")
	public List<Job> getAllJobs() {
		return jService.getAllJobs();
	}
	
	@GetMapping("/jobs/{jid}")
	public Job getJobById(@PathVariable(name="jid") int jid) {
		return jService.getJobById(jid);
	}
	
	@DeleteMapping("/jobs/{jid}")
	public void deleteUserById(@PathVariable(name="jid") int jid) {
		jService.deleteJobById(jid);
	}
	
	@PostMapping("/jobs")
	public Job saveUser(@RequestBody Job job) {
		return jService.saveOrUpdate(job);
	}
	@PutMapping("/jobs")
	public Job updateJob(@RequestBody Job job) {
		return jService.saveOrUpdate(job);
	}
}
