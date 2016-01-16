package com.test.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.spring.model.Employee;
import com.test.spring.service.DAOService;

@RestController
public class RequestController {
	
	@Autowired
	public DAOService daoService;

	// test comment
	@RequestMapping("/")
	public ModelAndView fetchRequest(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		model.addObject("msg", "Hello,");
		model.setViewName("request");
		return model;
	}
	
	@RequestMapping("/listing")
	public Map<String,Object> userListing(@RequestParam("offset") int offset, @RequestParam("limit") int limit){
		Page<Employee> userList =  daoService.userListing(new PageRequest(offset,limit));
//		int recSize = userList.getSize();
		int recordSize = userList.getTotalPages();
		Map<String,Object> responseMap = new HashMap<String,Object>();
		List<Employee> user = new ArrayList<Employee>();
		Iterator<Employee> iterator = userList.iterator();
		while(iterator.hasNext()){
			user.add(iterator.next());
		}
		responseMap.put("userList", user);
		responseMap.put("size",recordSize);
		return responseMap;
	}
	
	@RequestMapping("/save")
	public void saveUser(){
		Employee user = new Employee();
		user.setFirstName("Arvind");
		user.setLastName("singh");
		user.setEmail("abc@gmail.com");
		daoService.saveUser(user);
//		daoService.findAll();
	}
	
	@RequestMapping("/find/{id}")
	public void find(@PathVariable("id") long id){
		daoService.find(id);
	}
	
	@RequestMapping("/find")
	public void findBy(@RequestParam("id") long id){
		daoService.find(id);
	}
}
