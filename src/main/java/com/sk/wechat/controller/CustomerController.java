package com.sk.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.wechat.entity.Customer;
import com.sk.wechat.repository.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	@RequestMapping(value="saveCustomer")
	public Customer saveCustomer(Customer customer){
		return this.customerRepository.save(customer);
	}
	
	@RequestMapping(value="getCustomer/{userId}")
	public Customer getCustomer(@PathVariable("userId")String userId){
		return this.customerRepository.findOne(userId);
	}
}
