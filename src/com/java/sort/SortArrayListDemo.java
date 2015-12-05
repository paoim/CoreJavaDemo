package com.java.sort;

import java.util.Collections;
import java.util.List;

import com.java.sort.comparision.ProductAscendingComparator;
import com.java.sort.model.Product;
import com.java.sort.repository.ProductRepository;
import com.java.sort.repository.ProductRepositoryImpl;
import com.java.sort.service.ProductService;
import com.java.sort.service.ProductServiceImpl;

public class SortArrayListDemo {

	public static void main(String args[]) {
		// Create 40 products
		int numberOfProduct = 40;
		ProductRepository productRepository = new ProductRepositoryImpl();
		ProductService productService = new ProductServiceImpl(numberOfProduct, productRepository);
		List<Product> productsList = productService.getProductsZaList();

		// Before Sort
		productService.printProducts(productsList, "Before Sort");

		// Sort products by 1 to N
		Collections.sort(productsList, new ProductAscendingComparator());

		// After Sort
		productService.printProducts(productsList, "After Sort");
	}
}
