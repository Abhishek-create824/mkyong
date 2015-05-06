package com.mkyong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.cams7.jpa.domain.BaseEntity;

@Entity
@Table(name = "product", catalog = "mkyong")
public class Product extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	private Long id;

	@Column(name = "PRODUCT_CODE", length = 20, nullable = false)
	private String code;

	@Column(name = "PRODUCT_DESC", length = 255, nullable = false)
	private String desc;

	public Product() {
		super();
	}

	public Product(Long id) {
		this();
		setId(id);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [id = " + getId() + ", code = "
				+ getCode() + ", desc = " + getDesc() + "]";
	}

	@Override
	public Long getId() {
		return id;
	}

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
