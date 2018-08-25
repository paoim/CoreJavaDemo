package com.paoim.coredemo.string;

public class ReverseStringDemo {
	
	private static void firstSolution(int x) {
		String test = "" + x;
		System.out.println("==============First Solution============");
		char [] chs = test.toCharArray();
		for (int i = chs.length -1; i >= 0; i--) {
			System.out.print(chs[i]);
		}
		System.out.println();
	}
	
	private static void secondSolution(int x) {
		System.out.println("==============Second Solution============");
		StringBuilder sb = new StringBuilder("" + x);
		System.out.println(sb.reverse().toString());
	}
	
	private static void thirdSolution(int x) {
		System.out.println("==============Third Solution============");
		int rev = 0;
		while (x > 0) {
			int re = x % 10;
			rev = rev * 10 + re;
			x = x / 10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		int x = 234;
		firstSolution(x);
		secondSolution(x);
		thirdSolution(x);
	}
}
