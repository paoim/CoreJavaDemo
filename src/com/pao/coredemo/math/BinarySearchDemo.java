package com.pao.coredemo.math;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearchDemo {
	
	private static BinarySearchDemo instance;
	
	private BinarySearchDemo() {
		// private constructor
	}
	
	// Thread Safe Singleton
	synchronized public static BinarySearchDemo getInstance() {
		if (instance == null) {
			// if instance is null, initialize
			instance = new BinarySearchDemo();
		}
		return instance;
	}

	public static void main(String[] args) {
		int a[] = {200, -100, 100, 10, 300, 6, 19, 2018, 1900};
		BinarySearchDemo instance = BinarySearchDemo.getInstance();
		
		// 1. Search by using Binary Search Iteratively (doBinarySearchIteratively)
		int index = instance.searchByRecursiveVsIterative(a, 1900, false);
		instance.displayResult(index, 1900, "BinarySearchIterative");
		
		// 2. Search by using Recursive (recursiveBinarySearch)
		index = instance.searchByRecursiveVsIterative(a, 19, true);
		instance.displayResult(index, 1, "recursiveBinarySearch");
		
		// 3. Search by using Arrays.binarySearch
		index = Arrays.binarySearch(a, 10);
		instance.displayResult(index, 10, "Arrays.binarySearch");
		
		// 4. Search by using Collections.binarySearch
		List<Integer> itemList = Arrays.stream(a).boxed().collect(Collectors.toList());
		index = Collections.binarySearch(itemList, 200);
		instance.displayResult(index, 200, "Collections.binarySearch");
	}
	
	private void displayResult(int index, int key, String method) {
		String filter = (-1 != index) ? "" : "not ";
		System.out.println("The search result " + filter + "found for " + key + " by using " + method);
	}
	
	private int searchByRecursiveVsIterative(int a[], int key, boolean isRecursive) {
		Arrays.sort(a);
		int low = 0;
		int high = a.length - 1;
		int index = isRecursive ? recursiveBinarySearch(a, low, high, key) : doBinarySearchIteratively(a, low, high, key);
		return index;
	}

	/**
	 * Binary Search/Half Interval Search/Logarithmic
	 * Requirement:
	 * 1. Need to save items in sorted order
	 * 2. Search items by using binary search
	 * 3. Will achieve time complexity is O(log n)
	 * @param sortedArry
	 * @param key
	 * @return int as index
	 */
	private int doBinarySearchIteratively(int[] sortedArry, int low, int high, int key) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (sortedArry[mid] == key) {
				return mid;
			} else if (sortedArry[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	/**
	 * Binary Search/Half Interval Search/Logarithmic
	 * Requirement:
	 * 1. Need to save items in sorted order
	 * 2. Search items by using binary search
	 * 3. Will achieve time complexity is O(log n)
	 * @param sortedArry
	 * @param low
	 * @param high
	 * @param key
	 * @return int as index
	 */
	private int recursiveBinarySearch(int sortedArry[], int low, int high, int key) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if (sortedArry[mid] == key) {
				return mid;
			}
			if (sortedArry[mid] > key) {
				return recursiveBinarySearch(sortedArry, low, mid - 1, key);
			}
			return recursiveBinarySearch(sortedArry, mid + 1, high, key);
		}
		return -1;
	}
}
