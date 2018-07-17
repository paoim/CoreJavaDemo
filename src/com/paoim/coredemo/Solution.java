package com.paoim.coredemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Solution {

	public static void main(String[] args) throws IOException {
		// Input text of block
		String line = getInput();
		char characters[] = line.toCharArray();

		int count = characters.length, vowelCount = 0;
		for (int i = 0; i < count; i++) {
			// a,e,i,o,u
			if (characters[i] == 'a' || characters[i] == 'e'
					|| characters[i] == 'i' || characters[i] == 'o'
					|| characters[i] == 'u') {
				vowelCount++;
			}

			if (characters[i] == 'y') {
				vowelCount = vowelCount - 10;
			}

			if (characters[i] == 'x') {
				vowelCount = vowelCount - 5;
			}
		}

		display(count, vowelCount);

		// Convert int to double
		double decimalVal = Double.valueOf(count);

		// In percentage
		double vowelCountPercentage = truncate((vowelCount * 100) / decimalVal,
				2);

		System.out.println("There are " + vowelCount + " vowels and " + count
				+ " characters. " + vowelCountPercentage
				+ " of the characters are vowels.");
	}

	public static String getInput() throws IOException {
		System.out.println("Please input a block of text:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().toLowerCase();

		return line;
	}

	public static double truncate(double value, int places) {
		if (places < 0) {
			throw new IllegalArgumentException();
		}

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = (long) value;
		return (double) tmp / factor;
	}

	public static void display(int allChars, int vowelCount) {
		// Convert int to double
		double chars = Double.valueOf(allChars);
		
		if(vowelCount < 0){
			vowelCount = 0;
		}

		// count vowel in percentage
		double vowelInPercentage = (vowelCount * 100) / chars;

		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println("There are " + vowelCount + " vowels and "
				+ allChars + " characters. " + df.format(vowelInPercentage)
				+ "% of the characters are vowels.");
	}

}
