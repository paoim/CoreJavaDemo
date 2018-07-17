package com.paoim.coredemo.sort.service;

import java.util.List;

import com.paoim.coredemo.sort.model.Product;

public interface ProductService {

	List<Product> getProductsAzList();

	List<Product> getProductsZaList();

	void printProducts(List<Product> productsList, String message);
}