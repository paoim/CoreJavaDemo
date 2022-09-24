package com.pao.challenge;

public class PrintIntWithoutNumberDemo {

	private static void printOneToHunred(int low, int high) {
		for (int i = low; i <= high; i++) {
			System.out.println(i);
		}
	}

	private static void doFirstSolution() {
		int one = 'a'/'a';
		int ten = "**********".length();
		printOneToHunred(one, (ten * ten));
	}

	private static void doSecondSolution() {
		int one = 'a'/'a';
		printOneToHunred(one, 'd');
	}

	public static void main(String[] args) {
		doFirstSolution();
		System.out.println("=====================");
		doSecondSolution();
	}
}
