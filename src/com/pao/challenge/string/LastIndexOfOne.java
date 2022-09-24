package com.pao.challenge.string;

/**
 * Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.
 *
 * Input:
 * S = 00001
 * Output:
 * 4
 * Explanation:
 * Last index of  1 in given string is 4.
 * 
 * Input:
 * 0
 * Output:
 * -1
 * Explanation:
 * Since, 1 is not present, so output is -1.
 */
public class LastIndexOfOne {

	private static int getLastIndex(String s) {
		if (null == s || 0 == s.length()) return -1;
		for (int i = s.length() - 1; i >= 0; i--) {
			if ('1' == s.charAt(i)) return i;
		}
		return -1;
	}

	private static int getIndexOfOne(String s) {
		if (null == s || 0 == s.length()) return -1;
		return s.lastIndexOf('1');
	}

	private static void print(int s) {
		System.out.println(s);
	}

	private static void testFirstCase() {
		print(getLastIndex(null));//-1
	}

	private static void testSecondCase() {
		print(getLastIndex(""));//-1
	}

	private static void testThirdCase() {
		print(getLastIndex("0"));//-1
	}

	private static void testFourCase() {
		print(getLastIndex("00001"));//4
	}

	public static void main(String[] args) {
		testFirstCase();
		testSecondCase();
		testThirdCase();
		testFourCase();

		print(getIndexOfOne("00001"));
		print(getIndexOfOne("0"));
	}
}

//Browse from: https://www.geeksforgeeks.org/must-do-coding-questions-for-companies-like-amazon-microsoft-adobe/
