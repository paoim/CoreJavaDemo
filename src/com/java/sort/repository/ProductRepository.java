package com.java.sort.repository;

import java.util.List;

import com.java.sort.model.Product;

public interface ProductRepository {

	List<Product> getProductsAzList(int numberOfProduct);

	List<Product> getProductsZaList(int numberOfProduct);

	void printProducts(List<Product> productsList, String message);
}