package com.test.spring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.test.spring.model.Employee;

public interface UserRepository extends CrudRepository<Employee,String>{
	
	public Employee findById(long id);
	
	public Page<Employee> findAll(Pageable pageable);

}
