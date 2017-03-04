package com.sk.wechat.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sk.wechat.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
	List<Customer> findByName(String name);
}
