package com.nobelit.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nobelit.demo.model.Employer;
import com.nobelit.demo.repository.EmployerRepo;

@Service
public class EmployerService {

	@Autowired
	private EmployerRepo eRepo;

	public List<Employer> getAllEmployers() {
		return eRepo.findAll();
	}

	public Employer getEmployerById(int compid) {
		Optional<Employer> findById = eRepo.findById(compid);
		return findById.get();
	}

	public Employer saveOrUpdate(Employer employer) {
		return eRepo.save(employer);
	}

	public void deleteEmployerById(int compid) {
		eRepo.deleteById(compid);
	}

}
