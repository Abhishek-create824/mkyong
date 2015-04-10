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
	private Integer age;

	private String username;
	private String password;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date createdDate;

	public User() {
		super();
	}

	public User(String id) {
		this();
		this.id = id;
	}

	public User(String username, String password) {
		this();

		setUsername(username);
		setPassword(password);
	}

	public User(String ic, String name, Integer age) {
		this();

		setIc(ic);
		setName(name);
		setAge(age);
	}

	public User(String ic, String name, Integer age, Date createdDate) {
		this();

		setIc(ic);
		setName(name);
		setAge(age);
		setCreatedDate(createdDate);
	}

	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat(
				"dd/MM/yyyy'T'HH:mm:ss.SSSz", new Locale("pt", "BR"));
		return this.getClass().getName()
				+ " [id = "
				+ getId()
				+ ", ic = "
				+ getIc()
				+ ", name = "
				+ getName()
				+ ", age = "
				+ getAge()
				+ ", username = "
				+ getUsername()
				+ ", password = "
				+ getPassword()
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}