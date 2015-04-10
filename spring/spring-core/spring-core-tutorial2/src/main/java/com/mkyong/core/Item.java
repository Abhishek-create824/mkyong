package com.mkyong.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
public class Item {

	@Value("itemA")
	// inject String directly
	private String name;

	@Value("10")
	// inject interger directly
	private int qtd;

	public Item() {
		super();
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [name = " + getName() + ", qtd = "
				+ getQtd() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}