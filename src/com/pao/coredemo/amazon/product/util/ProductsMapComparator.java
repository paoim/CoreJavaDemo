package com.pao.coredemo.amazon.product.util;

import java.util.Comparator;
import java.util.Map;

import com.pao.coredemo.amazon.product.model.Product;

public class ProductsMapComparator implements Comparator<Product> {
	Map<Product, Integer> productsMap;

	public ProductsMapComparator(Map<Product, Integer> productsMap) {
		this.productsMap = productsMap;
	}

	@Override
	public int compare(Product o1, Product o2) {

		return ((productsMap.get(o1) >= productsMap.get(o2)) ? -1 : 1);
	}

}
