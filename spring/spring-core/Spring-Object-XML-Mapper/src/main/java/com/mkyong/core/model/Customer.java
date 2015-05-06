package com.mkyong.core.model;

public class Customer {

	private String name;
	private int age;
	private boolean flag;
	private String address;

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [name = " + getName() + ", age = "
				+ getAge() + ", flag = " + isFlag() + ", address = "
				+ getAddress() + "]";
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

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}