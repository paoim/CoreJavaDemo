package com.paoim.coredemo.math;

public class ReverseNumberDemo {
	
	private static String reverseNumber1(int n) {
		String result = "";
		while (n > 0) {
			int remainingNumber = n % 10;
			//System.out.println("remainingNumber: " + remainingNumber);
			result = result + remainingNumber;
			//System.out.println("result: " + result);
			n = n / 10;
		}
		return result;
	}
	
	private static int reverseNumber(int n) {
		int result = 0;
		//System.out.println("=================Start=========");
		while (n > 0) {
			int remainingNumber = n % 10;
			//System.out.println("remainingNumber: " + remainingNumber);
			result = (result * 10) + remainingNumber;
			//System.out.println("result: " + result);
			n = n / 10;
		}
		//System.out.println("=================End=========");
		return result;
	}

	public static void main(String[] args) {
		System.out.println(reverseNumber(205));
		System.out.println(reverseNumber(123));
		System.out.println(reverseNumber(200));
		System.out.println(reverseNumber(201));
		System.out.println(reverseNumber(1000));
		System.out.println(reverseNumber(1001));
	}

}
