package com.mkyong.common.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
//import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Customer {

	//@NotEmpty
	@Size(min = 3, max = 30)
	private String name;

	@NotNull
	@Range(min = 1, max = 100)
	private Byte age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getAge() {
		return age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

}