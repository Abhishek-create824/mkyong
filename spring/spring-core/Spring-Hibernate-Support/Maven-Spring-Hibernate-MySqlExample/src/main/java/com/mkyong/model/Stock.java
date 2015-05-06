package com.mkyong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import br.com.cams7.jpa.domain.BaseEntity;

@Entity
@Table(name = "stock", uniqueConstraints = {
		@UniqueConstraint(columnNames = "STOCK_NAME"),
		@UniqueConstraint(columnNames = "STOCK_CODE") })
public class Stock extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STOCK_ID")
	private Long id;

	@Column(name = "STOCK_CODE", length = 10, nullable = false)
	private String code;

	@Column(name = "STOCK_NAME", length = 20, nullable = false)
	private String name;

	public Stock() {
		super();
	}

	public Stock(Long id) {
		this();
		setId(id);
	}

	public Stock(String code, String name) {
		this();

		setCode(code);
		setName(name);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [id = " + getId() + ", code = "
				+ getCode() + ", name = " + getName() + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.cams7.jpa.domain.BaseEntity#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.cams7.jpa.domain.BaseEntity#setId(java.io.Serializable)
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}