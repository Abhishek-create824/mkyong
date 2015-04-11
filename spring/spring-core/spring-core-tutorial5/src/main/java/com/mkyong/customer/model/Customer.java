package com.mkyong.customer.model;

public class Customer {

	private int custId;
	private String name;
	private int age;

	public Customer() {
		super();
	}

	public Customer(int custId, String name, int age) {
		this();

		setCustId(custId);
		setName(name);
		setAge(age);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [id = " + getCustId()
				+ ", name = " + getName() + ", age = " + getAge() + "]";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
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

}