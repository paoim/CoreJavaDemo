package com.java.amazon.product.model;

public class Product {
	private int id;
	private String name;
	private int recommendationNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRecommendationNo() {
		return recommendationNo;
	}

	public void setRecommendationNo(int recommendationNo) {
		this.recommendationNo = recommendationNo;
	}
}
