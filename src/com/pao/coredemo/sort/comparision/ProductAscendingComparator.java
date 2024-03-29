package com.pao.coredemo.sort.comparision;

import java.util.Comparator;

import com.pao.coredemo.sort.model.Product;

public class ProductAscendingComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return ((o1.getId() <= o2.getId()) ? -1 : 1);
	}

}
