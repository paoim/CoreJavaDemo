package com.pao.challenge.array;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Given an unordered list of numbers of varying size, write a program that will report the first pair of duplicate numbers in the list.
 *
 *Example:
 *Input: 4 22 2 200 5005 8 15 16 23 6 21 200 303 1 10101
 *Result: 200
 */
public class FirstPairDuplicateNumbers {
	
	private static int findFirstPair(int[] array) {
		if (null == array || array.length <= 1) return 0;
		HashSet<Integer> values = new LinkedHashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (values.contains(array[i])) {
				return array[i];
			}
			values.add(array[i]);
		}
		return 0;
	}

	private static void print(String value) {
		System.out.println(value);
	}

	private static void testWithNullInput() {
		int[] array = null;
		int result =  findFirstPair(array);
		if (0 == result) {
			print("No First Pair for null as input");
		}
	}

	private static void testWithEmptyInput() {
		int[] array = {};
		int result =  findFirstPair(array);
		if (0 == result) {
			print("No First Pair for empty as input");
		}
	}

	private static void testWithOneElementInput() {
		int[] array = {4};
		int result =  findFirstPair(array);
		if (0 == result) {
			print("No First Pair for " + array[0]);
		}
	}

	private static void testWithValidInput() {
		int[] array = {4, 22, 2, 200, 5005, 8, 15, 16, 23, 6, 21, 200, 303, 1, 10101};
		int result =  findFirstPair(array);
		if (0 == result) {
			print("No First Pair for " + array);
		}
		print("First Pair is " + result);
	}

	private static void testWithOneMoreValidInput() {
		int[] array = {4, 22, 2, 200, 5005, 8, 15, 16, 23, 6, 22, 21, 200, 303, 1, 10101};
		int result =  findFirstPair(array);
		if (0 == result) {
			print("No First Pair for " + array);
		}
		print("First Pair is " + result);
	}

	public static void main(String[] args) {
		testWithNullInput();
		testWithEmptyInput();
		testWithOneElementInput();
		testWithValidInput();
		testWithOneMoreValidInput();
	}
}
