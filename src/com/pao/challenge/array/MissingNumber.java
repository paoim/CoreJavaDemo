package com.pao.challenge.array;

/**
 * Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
 * Input:
 * N = 5
 * A[] = {1,2,3,5}
 * Output: 4
 * 
 * Input:
 * N = 10
 * A[] = {6,1,2,8,3,4,7,10,5}
 * Output: 9
 */
public class MissingNumber {

	private static boolean isEmpty(int arr[]) {
		return (null == arr || 0 == arr.length);
	}

	private static int getMissingNumber(int arr[], int n) {
		if (isEmpty(arr)) return 0;
		int sum = (n * (n + 1))/2;
		for (int i = 0; i < n - 1; i++) {
			sum -= arr[i];
		}
		return sum;
	}

	private static void testFirstCase() {
		int arr[] = {1,2,3,5};
		int m = getMissingNumber(arr, 5);
		System.out.println((4 == m) ? "Correct" : "Wrong");
	}

	private static void testSecondCase() {
		int arr[] = {6,1,2,8,3,4,7,10,5};
		int m = getMissingNumber(arr, 10);
		System.out.println((9 == m) ? "Correct" : "Wrong");
	}	

	public static void main(String[] args) {
		testFirstCase();
		testSecondCase();
	}
}
