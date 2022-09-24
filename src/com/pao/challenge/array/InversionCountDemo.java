package com.pao.challenge.array;

/**
 * Input: N = 5, arr[] = {2, 4, 1, 3, 5}
 * Output: 3
 * Explanation: The sequence 2, 4, 1, 3, 5 
 * has three inversions (2, 1), (4, 1), (4, 3).
 *
 * Input: N = 5
 * arr[] = {2, 3, 4, 5, 6}
 * Output: 0
 * Explanation: As the sequence is already 
 * sorted so there is no inversion count.
 * 
 * Input: N = 3, arr[] = {10, 10, 10}
 * Output: 0
 * Explanation: As all the elements of array 
 * are same, so there is no inversion count.
 */
public class InversionCountDemo {

	private static boolean isEmpty(int arr[]) {
		return (null == arr || 0 == arr.length);
	}

	private static int count(int arr[]) {
		if (isEmpty(arr)) return 0;

		int c = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					c++;
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
				}
			}
		}
		return c;
	}

	private static void testFirstCase() {
		int arr[] = {2, 4, 1, 3, 5};
		System.out.println(count(arr));
	}

	private static void testSecondCase() {
		int arr[] = {2, 3, 4, 5, 6};
		System.out.println(count(arr));
	}

	private static void testThirdCase() {
		int arr[] = {10, 10, 10};
		System.out.println(count(arr));
	}

	public static void main(String[] args) {
		testFirstCase();
		testSecondCase();
		testThirdCase();
	}
}

//Browse from: https://www.geeksforgeeks.org/must-do-coding-questions-for-companies-like-amazon-microsoft-adobe/
