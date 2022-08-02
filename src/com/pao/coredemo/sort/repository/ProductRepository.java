package com.pao.coredemo.sort.repository;

import java.util.List;

import com.pao.coredemo.sort.model.Product;

public interface ProductRepository {

	List<Product> getProductsAzList(int numberOfProduct);

	List<Product> getProductsZaList(int numberOfProduct);

	void printProducts(List<Product> productsList, String message);
}