package com.pao.challenge;

/**
 * 
 * Must be 4 characters in length.
 * Must contain only digits 0-9.
 * Digit cannot be used three or more times in succession.
 * 4441 is invalid
 * 4404 is valid
 * PINs cannot be uniformly increasing or decreasing by 1
 * 1234 is invalid
 * 9876 is invalid
 * 1357 is valid
 * 1232 is valid
 *
 */
public class PinSecondDemo {

	private static int getInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return -1;
		}
	}

	private static boolean isSuccessionOrIncreasingOrDecreasingPin(String str) {
		int countIncreasing = 1;
		int countDecreasing = 1;
		int total = str.length();
		int countSuccessionPin = 1;
		for (int i = 0; i < total; i++) {
			if ((i + 1) < total) {
				int v = getInt("" + str.charAt(i));
				int nextV = getInt("" + str.charAt(i + 1));

				if (v == nextV) {
					countSuccessionPin++;
				}
				if (nextV == (v + 1)) {
					countIncreasing++;
				}
				if (nextV == (v - 1)) {
					countDecreasing++;
				}
			}
		}
		return (countSuccessionPin >= 3 || total == countDecreasing || total == countIncreasing);
	}

	private static boolean isValidPin(String str) {
		// Check the input
		if (null == str || 0 == str.length()) return false;

		// Check for only 4 characters length
		if (!(4 == str.length())) return false;

		// Check the input is only for digits 0-9
		int pin = getInt(str);
		if (!(pin >= 0)) return false;

		// Check the three or more times in succession
		// Check the uniformly increasing or decreasing by 1
		if (isSuccessionOrIncreasingOrDecreasingPin(str)) return false;

		return true;
	}

	private static void printPin(String str) {
		if (isValidPin(str)) {
			System.out.println(str + " is valid");
		} else {
			System.out.println(str + " is invalid");
		}
	}

	public static void main(String[] args) {
		printPin("-111");
		printPin("4441");
		printPin("4404");
		printPin("1234");
		printPin("9876");
		printPin("1357");
		printPin("1232");
		printPin("9998");
		printPin("9909");
	}
}
