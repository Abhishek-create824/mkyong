package com.mkyong.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
public class Item {

	@Value("itemA")
	// inject String directly
	private String name;

	@Value("99")
	// inject interger directly
	private int qty;

	public Item() {
		super();
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [name = " + getName() + ", qty = "
				+ getQty() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}