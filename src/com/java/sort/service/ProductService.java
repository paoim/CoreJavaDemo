package com.java.sort.service;

import java.util.List;

import com.java.sort.model.Product;

public interface ProductService {

	List<Product> getProductsAzList();

	List<Product> getProductsZaList();

	void printProducts(List<Product> productsList, String message);
}