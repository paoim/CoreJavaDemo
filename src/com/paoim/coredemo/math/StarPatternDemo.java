package com.paoim.coredemo.math;

public class StarPatternDemo {

	public static void main(String[] args) {
		// 15 stars
		System.out.println("========================15 stars pattern=========================");
		for (int i = 15; i > 0; i = i - 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("========================8 numbers pattern=========================");
		for (int i = 8; i > 0; i = i - 1) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("========================9 stars pattern=========================");
		for (int i = 0; i < 9; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("========================9 numbers pattern=========================");
		for (int i = 0; i < 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
