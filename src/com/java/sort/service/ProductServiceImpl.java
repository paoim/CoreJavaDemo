package com.java.sort.service;

import java.util.List;

import com.java.sort.model.Product;
import com.java.sort.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	private int numberOfProduct;
	private ProductRepository productRepository;

	public ProductServiceImpl(int numberOfProduct,
			ProductRepository productRepository) {
		this.numberOfProduct = numberOfProduct;
		this.productRepository = productRepository;
	}

	public List<Product> getProductsZaList() {

		return productRepository.getProductsZaList(numberOfProduct);
	}

	public List<Product> getProductsAzList() {

		return productRepository.getProductsAzList(numberOfProduct);
	}

	public void printProducts(List<Product> productsList, String message) {

		productRepository.printProducts(productsList, message);
	}
}
