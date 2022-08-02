package com.pao.coredemo.amazon.product.service;

import java.util.List;

import com.pao.coredemo.amazon.product.model.Friend;
import com.pao.coredemo.amazon.product.model.Product;
import com.pao.coredemo.amazon.product.model.User;

public interface ProductService {

	List<Product> getRecommendedProductsListForUser(User user);
	
	List<Friend> getFriendsListForUser(User user);

	List<Product> getPurchasesForUser(Friend friend);

	void printProductsList(List<Product> productsList, String message);

}