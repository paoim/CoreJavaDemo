package com.paoim.coredemo.amazon.product.util;

import java.util.Comparator;

import com.paoim.coredemo.amazon.product.model.Product;

public class ProductReNoComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		return ((o1.getRecommendationNo() >= o2.getRecommendationNo()) ? -1 : 1);
	}

}
