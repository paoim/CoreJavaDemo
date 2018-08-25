package com.paoim.coredemo.math;

public class FactorialDemo {
	
	private static int factorial(int n) {
		// single line to find factorial
		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
	}
	
	private static int secondSolution(int n) {
		// Factorial can also be calculated iteratively as recursion can be costly for large numbers
		int res = 1, i;
		for (i = 2; i <= n; i++)
			res *= i;
		return res;
	}
	
	private static int thirdSolution(int n) {
		// n! = n * (n-1)!
		// n! = 1 if n = 0 or n = 1 
		if (n == 0)
			return 1;
		return n * thirdSolution(n - 1);
	}

	public static void main(String[] args) {
		// Write a program to print Factorial of any number
		int n = 6;
		System.out.println("==============First Solution============");
		System.out.println("Factorial of " + n + " is " + factorial(n));
		System.out.println("==============Second Solution============");
		System.out.println("Factorial of " + n + " is " + secondSolution(n));
		System.out.println("==============Third Solution============");
		System.out.println("Factorial of " + n + " is " + thirdSolution(n));
	}

}
