package com.mkyong.common;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
	private String name;
	private String address;
	private int age;

	private Person person;

	private List<Person> lists;
	private Set<Person> sets;
	private Map<String, Person> maps;
	private Properties pros;

	private List<?> genericList;
	private Set<?> genericSet;
	private Map<?, ?> genericMap;

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

	public List<Person> getLists() {
		return lists;
	}

	public void setLists(List<Person> lists) {
		this.lists = lists;
	}

	public Set<Person> getSets() {
		return sets;
	}

	public void setSets(Set<Person> sets) {
		this.sets = sets;
	}

	public Map<String, Person> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Person> maps) {
		this.maps = maps;
	}

	public Properties getPros() {
		return pros;
	}

	public void setPros(Properties pros) {
		this.pros = pros;
	}

	public List<?> getGenericList() {
		return genericList;
	}

	public void setGenericList(List<?> genericList) {
		this.genericList = genericList;
	}

	public Set<?> getGenericSet() {
		return genericSet;
	}

	public void setGenericSet(Set<?> genericSet) {
		this.genericSet = genericSet;
	}

	public Map<?, ?> getGenericMap() {
		return genericMap;
	}

	public void setGenericMap(Map<?, ?> genericMap) {
		this.genericMap = genericMap;
	}

}