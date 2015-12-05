package com.java.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.java.sort.comparision.ProductsMapComparator;
import com.java.sort.model.Product;
import com.java.sort.repository.ProductRepository;
import com.java.sort.repository.ProductRepositoryImpl;
import com.java.sort.service.ProductService;
import com.java.sort.service.ProductServiceImpl;

public class SortHasMapDemo {

	public static void main(String[] args) {
		// Create 40 products
		int numberOfProduct = 40;
		ProductRepository productRepository = new ProductRepositoryImpl();
		ProductService productService = new ProductServiceImpl(numberOfProduct, productRepository);
		List<Product> productsList = productService.getProductsAzList();
		
		//Before sort
		productService.printProducts(productsList, "Before Sort");
		
		//Count Products by ID
		Map<Product, Integer> productsMap = new HashMap<Product, Integer>();
		for(Product product: productsList){
			Integer count = productsMap.get(product);
			productsMap.put(product, ((count == null) ? 1 : (count + 1)));
		}
		
		//Sort Products by get Map Value
		ProductsMapComparator productsMapComparator = new ProductsMapComparator(productsMap);
		Map<Product, Integer> sortProductsMap = new TreeMap<Product, Integer>(productsMapComparator);
		sortProductsMap.putAll(productsMap);
		
		//Display Products
		productsList = new ArrayList<Product>();
		for (Map.Entry<Product, Integer> entry : sortProductsMap.entrySet()) {
			Product product = entry.getKey();
			productsList.add(product);
		}
		productService.printProducts(productsList, "After Sort");
	}

}
