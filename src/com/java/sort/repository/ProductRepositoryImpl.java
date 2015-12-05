package com.java.sort.repository;

import java.util.ArrayList;
import java.util.List;

import com.java.sort.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	public List<Product> getProductsAzList(int numberOfProduct) {
		int count = numberOfProduct;
		List<Product> productsList = new ArrayList<Product>();

		for (int i = 0; i < numberOfProduct; i++) {
			Product product = new Product(i, "Product-" + count);
			productsList.add(product);
			count--;
		}

		return productsList;
	}

	public List<Product> getProductsZaList(int numberOfProduct) {
		int count = numberOfProduct;
		List<Product> productsList = new ArrayList<Product>();

		for (int i = 0; i < numberOfProduct; i++) {
			Product product = new Product(count, "Product-" + i);
			productsList.add(product);
			count--;
		}

		return productsList;
	}

	public void printProducts(List<Product> productsList, String message) {
		System.out.println("============= " + message + " =============");
		for (Product product : productsList) {
			System.out.println("ID[" + product.getId() + "] is "
					+ product.getProductName());
		}
	}
}
