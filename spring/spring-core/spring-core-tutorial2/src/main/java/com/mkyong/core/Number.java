package com.mkyong.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("numberBean")
public class Number {

	@Value("999")
	private int no;

	public Number() {
		super();
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [no = " + getNo() + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}