package com.pao.coredemo.iterator;

import java.util.Arrays;
import java.util.List;

public class AlternatingIteratorDemo {

	private static void printResult(AlternatingIterator alternatingIterator) {
		if (null == alternatingIterator) {
			return;
		}
		String comaSpace = "";
		while (alternatingIterator.hasNext()) {
			String data = comaSpace + alternatingIterator.next();
			System.out.print(data);
			comaSpace = ", ";
		}
		System.out.println();
	}
	
	private static void displayWithDefaultConstructor() {
		System.out.println("-----------------new AlternatingIterator<>()-----------------");
		AlternatingIterator alternatingIterator = new AlternatingIterator<>();
		printResult(alternatingIterator);
	}
	
	private static void displayWithNull() {
		System.out.println("-----------------new AlternatingIterator<>(null)-----------------");
		AlternatingIterator alternatingIterator = new AlternatingIterator<>(null);
		printResult(alternatingIterator);
	}
	
	private static void displayWithOneList() {
		System.out.println("-----------------new AlternatingIterator<>(listA)-----------------");
		List<String> listA = Arrays.asList("a", "b", "c");
		AlternatingIterator alternatingIterator = new AlternatingIterator<>(listA.iterator());
		printResult(alternatingIterator);
	}
	
	private static void displayWithTwoList() {
		System.out.println("-----------------new AlternatingIterator<>(listA, listB)-----------------");
		List<String> listA = Arrays.asList("a", "b", "c");
		List<String> listB = Arrays.asList("1", "2");
		AlternatingIterator alternatingIterator = new AlternatingIterator<>(listA.iterator(), listB.iterator());
		printResult(alternatingIterator);
	}
	
	private static void displayWithThreeList() {
		System.out.println("-----------------new AlternatingIterator<>(listA, listB, listC)-----------------");
		List<String> listA = Arrays.asList("a", "b", "c");
		List<String> listB = Arrays.asList("1", "2");
		List<String> listC = Arrays.asList("x", "y", "z");
		AlternatingIterator alternatingIterator = new AlternatingIterator<>(listA.iterator(), listB.iterator(), listC.iterator());
		printResult(alternatingIterator);
	}
	
	private static void displayWithFourList() {
		System.out.println("-----------------new AlternatingIterator<>(listA, listB, listC, listD)-----------------");
		List<String> listA = Arrays.asList("a", "b", "c");
		List<String> listB = Arrays.asList("1", "2");
		List<String> listC = Arrays.asList("x", "y", "z");
		List<String> listD = Arrays.asList("A", "B", "C", "D");
		AlternatingIterator alternatingIterator = new AlternatingIterator<>(listA.iterator(), listB.iterator(), listC.iterator(), listD.iterator());
		printResult(alternatingIterator);
	}
	
	public static void main(String[] args) {
		displayWithDefaultConstructor();
		displayWithNull();
		displayWithOneList();
		displayWithTwoList();
		displayWithThreeList();
		displayWithFourList();
	}
}
