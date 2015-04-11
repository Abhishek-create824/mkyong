package com.mkyong.stock.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STOCK_ID")
	private Long stockId;

	@Column(name = "STOCK_CODE", length = 10, nullable = false)
	private String stockCode;

	@Column(name = "STOCK_NAME", length = 20, nullable = false)
	private String stockName;

	public Stock() {
		super();
	}

	public Stock(Long stockId) {
		this();
		this.stockId = stockId;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [id = " + getStockId()
				+ ", code = " + getStockCode() + ", name = " + getStockName()
				+ "]";
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}