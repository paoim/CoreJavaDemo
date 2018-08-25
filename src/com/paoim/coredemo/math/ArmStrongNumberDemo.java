package com.paoim.coredemo.math;

import java.util.Calendar;

public class ArmStrongNumberDemo {
	
	private static boolean isArmStrong(int n) {
		int sum = 0;
		int tmp = n;
		while (tmp != 0) {
			int remainingNumber = tmp % 10;
			sum = sum + (remainingNumber * remainingNumber * remainingNumber);
			tmp = tmp / 10;
		}
		return ( n == sum );
	}

	public static void main(String[] args) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("From year 1 to year " + year + ", here are:");
		for (int i = 1; i <= year; i++) {
			if (isArmStrong(i)) {
				System.out.println(i + " is an Armstrong Number");
			}
		}
	}
}
