package com.pao.coredemo.amazon.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.pao.coredemo.amazon.product.model.Friend;
import com.pao.coredemo.amazon.product.model.Product;
import com.pao.coredemo.amazon.product.model.User;
import com.pao.coredemo.amazon.product.service.ProductService;
import com.pao.coredemo.amazon.product.service.ProductServiceImpl;
import com.pao.coredemo.amazon.product.util.ProductIdComparator;
import com.pao.coredemo.amazon.product.util.ProductReNoComparator;

public class ProductTestDemo {

	public static void main(String[] args) {

		testCase();
	}

	public static void testCase() {
		ProductService service = new ProductServiceImpl();

		// Suppose there are 15 products
		List<Product> productsList = new ArrayList<Product>();
		for (int i = 1; i <= 15; i++) {
			Product product = new Product();
			product.setId(i);
			product.setName("Product " + i);

			productsList.add(product);
		}

		// Suppose there are 3 friends
		List<Friend> friendsList = new ArrayList<Friend>();
		for (int i = 1; i <= 3; i++) {
			Friend friend = new Friend();
			friend.setId(i);
			friend.setName("Friend " + i);
			friendsList.add(friend);
		}

		// Suppose first friend bought 15 products
		friendsList.get(0).setProductsList(productsList);

		// Suppose second friend bought 10 products
		for (int i = 5; i < 15; i++) {
			friendsList.get(1).getProductsList().add(productsList.get(i));
		}

		// Suppose third friend bought 5 products
		for (int i = 8; i <= 12; i++) {
			friendsList.get(2).getProductsList().add(productsList.get(i));
		}

		// Suppose there is an user
		User user = new User();
		user.setId(1);
		user.setName("User A");
		user.setFriendsList(friendsList);

		// Test
		List<Product> recommendedProductsList = service
				.getRecommendedProductsListForUser(user);

		// Sort all products by ID
		Collections.sort(recommendedProductsList, new ProductIdComparator());

		// Sort all products by Recommendation Number
		Collections.sort(recommendedProductsList, new ProductReNoComparator());

		// Display recommendation products list
		service.printProductsList(recommendedProductsList,
				"Recommendation Products List");
	}

}