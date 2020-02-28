package com.nobelit.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nobelit.demo.model.Employer;
import com.nobelit.demo.services.EmployerService;


@org.springframework.web.bind.annotation.RestController
public class EmployerController {

	@Autowired
	private EmployerService eService;
	
	
	@GetMapping("/employers")
	public List<Employer> getAllEmployers() {
		return eService.getAllEmployers();
	}
	
	@GetMapping("/employers/{compid}")
	public Employer getEmployerById(@PathVariable(name="compid") int compid) {
		return eService.getEmployerById(compid);
	}
	
	@DeleteMapping("/employer/{compid}")
	public void deleteEmployerById(@PathVariable(name="compid") int compid) {
		eService.deleteEmployerById(compid);
	}
	
	@PostMapping("/employers")
	public Employer saveEmployer(@RequestBody Employer employer) {
		return eService.saveOrUpdate(employer);
	}
	@PutMapping("/employers")
	public Employer updateJob(@RequestBody Employer employer) {
		return eService.saveOrUpdate(employer);
	}
}

