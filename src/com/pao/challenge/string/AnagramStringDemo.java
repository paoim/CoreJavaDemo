package com.pao.challenge.string;

import java.util.Arrays;

/*
 * This was the problem:
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise. An Anagram is a word or phrase formed by
 * 
 * rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class AnagramStringDemo {

	private static boolean isEmpty(String s1, String s2) {
		return (null == s1 || null == s2 || 0 == s1.length() || 0 == s2.length());
	}

	private static boolean isAnagram(String line1, String line2) {
		if (isEmpty(line1, line2))
			return false;

		// removes white spaces from string 1
		String s1 = line1.replaceAll("\\s", "");

		// removes white spaces from string 2
		String s2 = line2.replaceAll("\\s", "");

		if (isEmpty(s1, s2))
			return false;

		// checks the length of both the strings are equal or not
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] arrayS1 = s1.toLowerCase().toCharArray();
			char[] arrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			return Arrays.equals(arrayS1, arrayS2);
		}
	}

	private static void printAnagram(String line1, String line2) {
		if (isAnagram(line1, line2)) {
			System.out.println(line1 + " and " + line2 + " are anagrams");
		} else {
			System.out.println(line1 + " and " + line2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {
		printAnagram(null, null);
		printAnagram("", "");
		printAnagram("HEART", "EARTH");
		printAnagram("TRIANGLE", "INTEGRAL");
		printAnagram("TABLE", "APPLE");
	}
}
