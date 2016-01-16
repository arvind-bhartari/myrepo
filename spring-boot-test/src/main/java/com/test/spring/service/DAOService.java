package com.test.spring.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.test.spring.model.Employee;

public interface DAOService {

	public void saveUser(Employee user);
	
	public Employee find(long id);
	
	public Page<Employee> userListing(Pageable pageable);
}
