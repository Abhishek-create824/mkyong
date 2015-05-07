package com.mkyong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.cams7.jpa.domain.BaseEntity;

@Entity
@Table(name = "product_qoh")
public class ProductQoh extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QOH_ID")
	private Long id;

	@Column(name = "QTY", nullable = false)
	private Integer qty;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
	private Product product;

	public ProductQoh() {
		super();
	}

	public ProductQoh(Long id) {
		this();
		setId(id);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [id = " + getId() + ", qty = "
				+ getQty() + ", product = " + getProduct() + "]";
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
