package com.paoim.coredemo.math;

public class FirstAndSecondMaxValueDemo {

	public static void main(String[] args) {
		int a[] = {0, -200, 100, 20, -100, -20};
		printFirstAndSecondMaxValue(a);
	}

	private static void printFirstAndSecondMaxValue(int a[]) {
		if (0 == a.length) {
			System.out.println("No first and second Max value!");
			return;
		}
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (firstMax < a[i]) {
				secondMax = firstMax;
				firstMax = a[i];
			} else if (secondMax < firstMax && secondMax < a[i]) {
				secondMax = a[i];
			}
		}
		System.out.println("First Max is " + firstMax + " and Second Max is " + secondMax);
	}
}
