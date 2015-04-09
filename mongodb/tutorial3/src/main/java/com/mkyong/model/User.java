package com.mkyong.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection = "users")
public class User {

	@Id
	private String id;

	@Indexed
	private String ic;

	private String name;

	private int age;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date createdDate;

	public User() {
		super();
	}

	public User(String id) {
		this();
		this.id = id;
	}

	public User(String ic, String name, int age, Date createdDate) {
		this();

		setIc(ic);
		setName(name);
		setAge(age);
		setCreatedDate(createdDate);
	}

	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss.SSSz", new Locale("pt", "BR"));
		return this.getClass().getName()
				+ " [id = "
				+ getId()
				+ ", ic = "
				+ getIc()
				+ ", name = "
				+ getName()
				+ ", age = "
				+ getAge()
				+ ", createdDate = "
				+ (getCreatedDate() != null ? df.format(getCreatedDate())
						: null) + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIc() {
		return ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}