package com.mkyong.model;

public class Report {

	private int id;
	private String impressions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImpressions() {
		return impressions;
	}

	public void setImpressions(String impressions) {
		this.impressions = impressions;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", impressions=" + impressions + "]";
	}

}