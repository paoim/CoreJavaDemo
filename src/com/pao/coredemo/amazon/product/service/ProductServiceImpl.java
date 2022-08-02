package com.pao.coredemo.amazon.product.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.pao.coredemo.amazon.product.model.Friend;
import com.pao.coredemo.amazon.product.model.Product;
import com.pao.coredemo.amazon.product.model.User;
import com.pao.coredemo.amazon.product.util.ProductsMapComparator;

public class ProductServiceImpl implements ProductService {

	public List<Product> getRecommendedProductsListForUser(User user) {
		// Get all user's friends
		List<Friend> friendsList = getFriendsListForUser(user);

		// Get all products list from all user's friends
		List<Product> allProductsList = new ArrayList<Product>();
		for (Friend friend : friendsList) {
			allProductsList.addAll(getPurchasesForUser(friend));
		}

		// Count products by ID
		Map<Product, Integer> productsMap = new HashMap<Product, Integer>();
		for (Product product : allProductsList) {
			Integer count = productsMap.get(product);
			productsMap.put(product, ((count == null) ? 1 : (count + 1)));
		}

		// Sort products from high to low rank
		Map<Product, Integer> sortProductsMap = new TreeMap<Product, Integer>(
				new ProductsMapComparator(productsMap));
		sortProductsMap.putAll(productsMap);

		// Get all recommendation products list
		List<Product> recommendationsList = new ArrayList<Product>();
		for (Map.Entry<Product, Integer> entry : sortProductsMap.entrySet()) {
			Product product = entry.getKey();
			product.setRecommendationNo(entry.getValue());

			recommendationsList.add(product);
		}

		return recommendationsList;
	}

	public List<Friend> getFriendsListForUser(User user) {

		return user.getFriendsList();
	}

	public List<Product> getPurchasesForUser(Friend friend) {

		return friend.getProductsList();
	}

	public void printProductsList(List<Product> productsList, String message) {
		System.out.println("============ " + message + " ============");
		for (Product product : productsList) {
			System.out.println("Product's ID[" + product.getId() + "] = "
					+ product.getRecommendationNo());
		}
	}
}
