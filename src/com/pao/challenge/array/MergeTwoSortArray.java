package com.pao.challenge.array;

import java.util.Arrays;

/**
 * Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order.
 * Merge them in sorted order without using any extra space.
 * Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.
 * 
 * Input: 
 * n = 4, arr1[] = [1 3 5 7] 
 * m = 5, arr2[] = [0 2 6 8 9]
 * Output: 
 * arr1[] = [0 1 2 3]
 * arr2[] = [5 6 7 8 9]
 * Explanation:
 * After merging the two non-decreasing arrays, we get, 
 * 0 1 2 3 5 6 7 8 9.
 * 
 * Input: 
 * n = 2, arr1[] = [10 12] 
 * m = 3, arr2[] = [5 18 20]
 * Output: 
 * arr1[] = [5 10]
 * arr2[] = [12 18 20]
 * Explanation:
 * After merging two sorted arrays we get 5 10 12 18 20.
 */
public class MergeTwoSortArray {

	private static boolean isEmpty(int arr[]) {
		return (null == arr || 0 == arr.length);
	}

	private static String get(int arr[]) {
		StringBuilder sb = new StringBuilder();
		if (!isEmpty(arr)) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i] + " ");
			}
		}
		return sb.toString();
	}

	private static void merge(int arr1[], int arr2[]) {
		if (isEmpty(arr1) || isEmpty(arr2)) return;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int j = 0;
		int i = arr1.length - 1;

		while ( i >= 0 && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				int tmp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = tmp;
			}
			i--;
			j++;
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

	private static void testFirstCase() {
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {0, 2, 6, 8, 9};

		System.out.println("Input:");
		System.out.println(get(arr1));
		System.out.println(get(arr2));

		merge(arr1, arr2);

		System.out.println("Output:");
		String result1 = get(arr1);
		if ("0 1 2 3 ".equals(result1)) {
			System.out.println(result1);
		}
		String result2 = get(arr2);
		if ("5 6 7 8 9 ".equals(result2)) {
			System.out.println(result2);
		}
	}

	private static void testSecondCase() {
		int arr1[] = {10, 12};
		int arr2[] = {5, 18, 20};

		System.out.println("Input:");
		System.out.println(get(arr1));
		System.out.println(get(arr2));

		merge(arr1, arr2);

		System.out.println("Output:");
		String result1 = get(arr1);
		if ("5 10 ".equals(result1)) {
			System.out.println(result1);
		}
		String result2 = get(arr2);
		if ("12 18 20 ".equals(result2)) {
			System.out.println(result2);
		}
	}

	public static void main(String[] args) {
		testFirstCase();
		testSecondCase();
	}
}
