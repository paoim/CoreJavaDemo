package com.pao.challenge.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * 
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * 
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * 
 * Input: prices = [7,6,4,3,2,6,1,4]
 * output: 4
 */
public class StockTradeMaxProfit {

	private static int getMaxProfit1(int[] prices) {//not a good solution
		if (null == prices || 0 == prices.length)
			return 0;

		int minPrice = prices[0], minIndex = 0, maxPrice = prices[0], maxIndex = 0, secondMaxPrice = 0,
				secondMaxIndex = 0;
		for (int i = 1; i < prices.length; i++) {
			if (maxPrice < prices[i] && maxIndex > minIndex) {
				maxPrice = prices[i];
				maxIndex = i;
			}
			if (minPrice > prices[i]) {
				minPrice = prices[i];
				minIndex = i;
			}
			if (secondMaxPrice <= prices[i] && secondMaxPrice < maxPrice) {
				secondMaxPrice = prices[i];
				secondMaxIndex = i;
			}
		}

		int maxProfit = 0;
		if (maxIndex > minIndex) {
			maxProfit = maxPrice - minPrice;
		} else {
			if (secondMaxIndex > minIndex) {
				maxProfit = secondMaxPrice - minPrice;
			}
		}
		return maxProfit;

	}

	private static int getMaxProfit(int prices[], int size) {//not a good solution
		if (null == prices || 0 == prices.length)
			return 0;

		List<Integer> maxProfits = new ArrayList<>();

		// The loop starts from 1 as its comparing with the previous
		for (int i = 1; i < size; i++) {
			if (prices[i] > prices[i - 1]) {
				int maxProfit = prices[i] - prices[i - 1];
				maxProfits.add(maxProfit);
			}
		}
		return maxProfits.isEmpty() ? 0 : Collections.max(maxProfits);
	}

	private static int getMaxProfix(int prices[]) {//Good solution
		if (null == prices || prices.length <= 1) return 0;

		int profit = 0;
		int min = prices[0];

		// The loop starts from 1 as its comparing with the previous price
		for (int i = 1; i < prices.length; i++) {
			profit = Math.max(profit, prices[i] - min);
			min = Math.min(min, prices[i]);
		}
		return profit;
	}

	private static int calculateMaxProfix(int prices[]) {//Good solution
		if (null == prices || prices.length <= 1) return 0;

		int result = 0;
		int min = prices[0];

		// The loop starts from 1 as its comparing with the previous price
		for (int i = 1; i < prices.length; i++) {
			int profit = prices[i] - min;
			if (profit > result) {
				result = profit;
			}
			if (prices[i] < min) {
				min = prices[i];
			}
		}
		return result;
	}

	private static void print(int value) {
		System.out.println(value);
	}

	private static void testWithNullInput() {
		int prices[] = null;
		print(getMaxProfix(prices));//should be 0
		print(calculateMaxProfix(prices));
	}

	private static void testWithEmptyInput() {
		int prices[] = {};
		print(getMaxProfix(prices));//should be 0
		print(calculateMaxProfix(prices));
	}

	private static void testWithOneInput() {
		int prices[] = {7};
		print(getMaxProfix(prices));//should be 0
		print(calculateMaxProfix(prices));
	}

	private static void testWithFirstCaseInput() {
		int prices[] = { 7, 1, 5, 3, 6, 4 };
		print(getMaxProfix(prices));//should be 5 because you sell it at 6 and bought at 1, then 6 - 1 = 5
		print(calculateMaxProfix(prices));
	}

	private static void testWithSeondCaseInput() {
		int prices[] = { 7, 5, 4, 3, 2, 1 };
		print(getMaxProfix(prices));//should be 0 because no profit if sell in the future from day 1 to 6
		print(calculateMaxProfix(prices));
	}

	private static void testWithThirdCaseInput() {
		int prices[] = { 7, 6, 4, 3, 2, 6, 1, 4 };
		print(getMaxProfix(prices));//should be 4 because at day five, bought at 2 and sell it at day six at price is 6. 6 - 2 = 4
		print(calculateMaxProfix(prices));
	}

	public static void main(String[] args) {
		testWithNullInput();
		testWithEmptyInput();
		testWithOneInput();
		testWithFirstCaseInput();
		testWithSeondCaseInput();
		testWithThirdCaseInput();

		System.out.println("Other Solution...");
		int prices[] = { 7, 6, 4, 3, 2, 6, 1, 4 };
		int maxProfit = getMaxProfit1(prices);
		print(maxProfit);

		int maxProfit1 = getMaxProfit(prices, prices.length);
		print(maxProfit1);
	}
}
