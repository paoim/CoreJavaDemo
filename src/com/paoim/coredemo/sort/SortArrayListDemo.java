package com.paoim.coredemo.sort;

import java.util.Collections;
import java.util.List;

import com.paoim.coredemo.sort.comparision.ProductAscendingComparator;
import com.paoim.coredemo.sort.model.Product;
import com.paoim.coredemo.sort.repository.ProductRepository;
import com.paoim.coredemo.sort.repository.ProductRepositoryImpl;
import com.paoim.coredemo.sort.service.ProductService;
import com.paoim.coredemo.sort.service.ProductServiceImpl;

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
