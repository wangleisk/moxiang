package com.sk.wechat.entity;

import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	private String userId;
	private String name;
	private int age;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", age=" + age
				+ "]";
	}
}
