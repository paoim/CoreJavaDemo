package com.pao.coredemo.math;

public class MaxAndSmallOfArrayDemo {

	private static void printMaxAndSmallValue(int a[]) {
		if (0 == a.length) {
			System.out.println("There is no Value to find max and small!");
			return;
		}
		int maxValue = a[0];
		int smallValue = a[0];
		for (int i = 1; i < a.length; i++) {
			if (maxValue < a[i]) {
				maxValue = a[i];
			} else if (smallValue > a[i]) {
				smallValue = a[i];
			}
		}
		System.out.println("Small value is " + smallValue + ", and Max value is " + maxValue);
	}
	
	public static void main(String[] args) {
		int a[] = {-2, 0, 4, 4, 3, -1, 10, 5, 20, 10, -100};
		printMaxAndSmallValue(a);
	}
}
