package com.paoim.coredemo.math;

public class FibonacciSeriesDemo {
	
	private static int doFibonacci(int n) {
		if (0 == n) {
			return 0;
		} else if (1 == n) {
			return 1;
		} else {
			return (doFibonacci(n-1) + doFibonacci(n - 2));
		}
	}
	
	private static void printFibonacciNumber(int n) {
		System.out.println("============First Solution===================");
		for (int i = 0; i < n; i++) {
			int result = doFibonacci(i);
			System.out.print(result + " ");
		}
		System.out.println();
	}
	
	private static void doSecondSolution(int n) {
		System.out.println("============Second Solution===================");
		int i = 0, firstNumber = 0, secondNumber = 1;
		while (i < n) {
			System.out.print(firstNumber + " ");
			int thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			i++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printFibonacciNumber(10);
		doSecondSolution(10);
	}
}
