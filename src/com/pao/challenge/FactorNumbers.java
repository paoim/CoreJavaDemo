package com.pao.challenge;

/**
 * Find Factor of the input numbers
 * If the input provided is negative, ignore the sign and provide the output. 
 * If the input is zero the output should be "No Factors".
 * 
 * Sample Input 1 :
 * 54
 * 
 * Sample Output 1 :
 * 1, 2, 3, 6, 9, 18, 27, 54
 * 
 * Sample Input 2 :
 * -1869
 * 
 * Sample Output 2 :
 * 1, 3, 7, 21, 89, 267, 623, 1869
 *
 */
public class FactorNumbers {

	private static void printFactor(int n) {
		for (int i = 1; i < n; i++) {
			if (0 == n % i) {
				System.out.print(i + ", ");
			}
		}
		System.out.println(n);
	}

	private static void findFactor(int n) {
		if (0 == n) {
			System.out.println("No Factors");
		} else if (n > 0) {
			printFactor(n);
		} else if (n < 0) {
			printFactor(n * -1);
		}
	}

	public static void main(String[] args) {
		findFactor(0);
		findFactor(54);
		findFactor(-1869);
	}
}
