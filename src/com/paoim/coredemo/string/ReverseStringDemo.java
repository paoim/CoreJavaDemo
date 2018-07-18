package com.paoim.coredemo.string;

public class ReverseStringDemo {

	public static void main(String[] args) {
		int x = 234;
		String test = "" + x;
		System.out.println("==============First Solution============");
		char [] chs = test.toCharArray();
		for (int i = chs.length -1; i >= 0; i--) {
			System.out.print(chs[i]);
		}
		System.out.println("");
		System.out.println("==============Second Solution============");
		StringBuilder sb = new StringBuilder(test);
		System.out.println(sb.reverse().toString());
	}
}
