package com.mkyong.hosting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hosting")
public class Hosting {

	@Id
	private long id;

	private String name;

	public Hosting() {
		super();
	}

	public Hosting(long id) {
		this();
		setId(id);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [id = " + getId() + ", name = "
				+ getName() + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
