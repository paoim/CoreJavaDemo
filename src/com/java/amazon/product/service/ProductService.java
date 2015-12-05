package com.java.amazon.product.service;

import java.util.List;

import com.java.amazon.product.model.Friend;
import com.java.amazon.product.model.Product;
import com.java.amazon.product.model.User;

public interface ProductService {

	List<Product> getRecommendedProductsListForUser(User user);
	
	List<Friend> getFriendsListForUser(User user);

	List<Product> getPurchasesForUser(Friend friend);

	void printProductsList(List<Product> productsList, String message);

}