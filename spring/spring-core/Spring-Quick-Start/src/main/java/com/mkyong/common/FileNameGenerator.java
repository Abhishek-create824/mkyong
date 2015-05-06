package com.mkyong.common;

public class FileNameGenerator {
	private String name;
	private String type;

	public FileNameGenerator() {
		super();
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [name = " + getName()
				+ ", type = " + getType() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}