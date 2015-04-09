package com.mkyong.seq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")
public class SequenceId {

	@Id
	private String id;

	private long seq;

	public SequenceId() {
		super();
	}

	public SequenceId(String id) {
		this();
		setId(id);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [id = " + getId() + ", seq = "
				+ getSeq() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

}