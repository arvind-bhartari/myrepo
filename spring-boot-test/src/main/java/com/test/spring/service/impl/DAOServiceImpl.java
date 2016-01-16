package com.test.spring.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.test.spring.model.Employee;
import com.test.spring.repository.UserRepository;
import com.test.spring.service.DAOService;

@Service
@Transactional
public class DAOServiceImpl implements DAOService{

//***************	JPA Implementation **************//

	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;
	
	public void saveUser(Employee user){
		entityManager.persist(user);
	}

//*************** Crud Repository Implementation **************//
	
	@Autowired
	public UserRepository userRepository;
	
	public Employee find(long id){
		return userRepository.findById(id);
	}
	
	public Page<Employee> userListing(Pageable pageable){
		return userRepository.findAll(pageable);
	}

//***************	Hibernate Implementation **************//
	
	// public SessionFactory sessionFactory;
	//
	// @Autowired
	// public DAOService(SessionFactory sessionFactory){
	// this.sessionFactory = sessionFactory;
	// }
	//
	// public void saveUser(User user){
	// sessionFactory.getCurrentSession().save(user);
	// }
	//
	// @SuppressWarnings({ "unchecked", "rawtypes" })
	// public List findAll(){
	// Query query =
	// sessionFactory.getCurrentSession().createSQLQuery("select * from user");
	// List<User> user = (List<User>)query.list();
	// return user;
	// }
}
