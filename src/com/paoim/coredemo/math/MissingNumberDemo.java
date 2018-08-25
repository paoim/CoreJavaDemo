package com.paoim.coredemo.math;

public class MissingNumberDemo {
	
	private static void printMissingNumber(int a[]) {
		if (0 == a.length) {
			System.out.println("Nothing to print...");
			return;
		}
		int n = a.length + 1;
		int s = (n * (n + 1)) / 2;
		for (int i = 0; i < a.length; i++) {
			s = s - a[i];
		}
		System.out.println("Missing Number is " + s);
	}

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 8, 9};
		printMissingNumber(a);
	}
}
