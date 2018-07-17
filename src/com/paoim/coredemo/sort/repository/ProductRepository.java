package com.paoim.coredemo.sort.repository;

import java.util.List;

import com.paoim.coredemo.sort.model.Product;

public interface ProductRepository {

	List<Product> getProductsAzList(int numberOfProduct);

	List<Product> getProductsZaList(int numberOfProduct);

	void printProducts(List<Product> productsList, String message);
}