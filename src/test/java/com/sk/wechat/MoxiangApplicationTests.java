package com.sk.wechat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sk.wechat.entity.Customer;
import com.sk.wechat.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoxiangApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testSaveCustomer() {
		Customer customer = new Customer();
		customer.setUserId("1");
		customer.setName("Tiger");
		customer.setAge(20);
		this.customerRepository.save(customer);
	}
	
	@Test
	public void testGetCustomer() {
		Customer customer = this.customerRepository.findOne("1");
		System.out.println(customer);
	}
	
	@Test
	public void testGetCustomerByName() {
		List<Customer> customers = this.customerRepository.findByName("Tiger");
		System.out.println(customers);
	}
}
