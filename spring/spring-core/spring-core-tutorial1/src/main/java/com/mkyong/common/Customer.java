package com.mkyong.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
	private String name;
	private String address;
	private int age;

	private Date date;

	private int type;
	private String action;
	private String country;

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
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy z", new Locale(
				"pt", "BR"));

		return this.getClass().getName() + " [name = " + getName()
				+ ", address = " + getAddress() + ", age = " + getAge()
				+ ", type = " + getType() + ", action = " + getAction()
				+ ", country = " + getCountry() + ", date = "
				+ (getDate() != null ? df.format(getDate()) : null)
				+ ", person = " + getPerson() + "]";
	}

	public void initIt() {
		System.out.println("Init method after properties are set country: \""
				+ getCountry() + "\"");
	}

	public void cleanUp() {
		System.out.println("Spring Container is destroy! Customer \""
				+ getCountry() + "\" clean up");
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Person getPerson() {
		return person;
	}

	@Required
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