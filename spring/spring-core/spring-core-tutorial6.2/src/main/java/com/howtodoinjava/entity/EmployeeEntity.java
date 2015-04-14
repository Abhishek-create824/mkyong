package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.cams7.jpa.domain.BaseEntity;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity extends BaseEntity<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;

	@Column(name = "FIRSTNAME")
	private String firstname;

	@Column(name = "LASTNAME")
	private String lastname;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "TELEPHONE")
	private String telephone;

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(Integer id) {
		super(id);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [id = " + getId()
				+ ", firstname = " + getFirstname() + ", lastname = "
				+ getLastname() + ", email = " + getEmail() + ", telephone = "
				+ getTelephone() + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}