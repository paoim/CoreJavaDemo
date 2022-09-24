package com.pao.challenge.array;

import java.util.Arrays;

/**
 * Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. 
 * Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
 * 1. Each student gets exactly one packet.
 * 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
 * 
 * Example 1:
 * 
 * Input:
 * N = 8, M = 5
 * A = {3, 4, 1, 9, 56, 7, 9, 12}
 * Output: 6
 * Explanation: The minimum difference between 
 * maximum chocolates and minimum chocolates 
 * is 9 - 3 = 6 by choosing following M packets :
 * {3, 4, 9, 7, 9}.
 * 
 * Example 2:
 * 
 * Input:
 * N = 7, M = 3
 * A = {7, 3, 2, 4, 9, 12, 56}
 * Output: 2
 * Explanation: The minimum difference between
 * maximum chocolates and minimum chocolates
 * is 4 - 2 = 2 by choosing following M packets :
 * {3, 2, 4}.
 * 
 * Your Task:
 * You don't need to take any input or print anything.
 * Your task is to complete the function findMinDiff() which takes array A[ ], N and M as input parameters and
 * returns the minimum possible difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student.
 */
public class ChocolateDistributionProblem {

	private static int findMinDiff(int arrs[], int m) {
		if (null == arrs || 0 == arrs.length || 0 == m || m > arrs.length) return 0;

		Arrays.sort(arrs);//need to sort before loop to compare between min and max

		int min = Integer.MAX_VALUE;//just give max value

		for (int i = 0; i + m - 1 < arrs.length; i++) {
			int diff = arrs[i + m - 1] - arrs[i];
			if (diff < min) {
				min = diff;
			}
		}
		return min;
	}

	private static void print(int value) {
		System.out.println(value);
	}

	private static void testWithNullInput() {
		int arrs[] = null;
		print(findMinDiff(arrs, 0));//should be 0
	}

	private static void testWithEmptyInput() {
		int arrs[] = {};
		print(findMinDiff(arrs, 0));//should be 0
	}

	private static void testWithBothInvalidInput() {
		int arrs[] = {5};
		print(findMinDiff(arrs, 2));//should be 0
	}

	private static void testWithFirstCaseInput() {
		int arrs[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
		print(findMinDiff(arrs, 5));//should be 6
	}

	private static void testWithSeondCaseInput() {
		int arrs[] = { 7, 3, 2, 4, 9, 12, 56 };
		print(findMinDiff(arrs, 3));//should be 2
	}

	public static void main(String[] args) {
		testWithNullInput();
		testWithEmptyInput();
		testWithBothInvalidInput();
		testWithFirstCaseInput();
		testWithSeondCaseInput();
	}
}
