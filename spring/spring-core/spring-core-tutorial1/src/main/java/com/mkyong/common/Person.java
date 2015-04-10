package com.mkyong.common;

public class Person {
	private String name;
	private String address;
	private int age;

	@Override
	public String toString() {
		return this.getClass().getName() + " [name = " + getName() + ", age = "
				+ getAge() + ", address = " + getAddress() + "]";
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

}