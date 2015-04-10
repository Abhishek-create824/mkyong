package com.mkyong.common;

public class Customer {
	private String name;
	private String address;
	private int age;

	private Person person;

	public Customer() {
		super();
	}

	public Customer(String name, String address, int age) {
		this();

		setName(name);
		setAddress(address);
		setAge(age);
	}

	public Customer(String name, int age, String address) {
		this(name, address, age);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [name : " + getName()
				+ ", address : " + getAddress() + ", age : " + getAge()
				+ ", person : " + getPerson() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}