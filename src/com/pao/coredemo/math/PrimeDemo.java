package com.pao.coredemo.math;

import java.util.Calendar;

public class PrimeDemo {
	
	private static PrimeDemo instance;
	
	private PrimeDemo() {
		// private constructor
	}
	
	public static PrimeDemo getInstance() {
		if (null == instance) {
			instance = new PrimeDemo();
		}
		return instance;
	}
	
	/**
	 * Naive solution
	 * A naive solution is to iterate through all numbers from 2 to n-1 and for every number check if it divides n. If we find any number that divides, we return false.
	 * @param n
	 * @return true/false
	 */
	private boolean isPrime(int n) {
		if (1 >= n) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (0 == n % i) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkPrime(int n) {
		if (1 >= n) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (0 == n % i) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeDemo instance = PrimeDemo.getInstance();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("From year 1 to year " + year + ", here are:");
		for (int i = 1; i <= year; i++) {
			String primeNumber = instance.isPrime(i) ? "" : " not";
			System.out.println("Year " + i + " is" + primeNumber + " Prime Number.");
		}
		System.out.println("The number 6 is Prime number: " + instance.checkPrime(6));
	}
}
