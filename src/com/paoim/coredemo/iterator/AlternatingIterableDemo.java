package com.paoim.coredemo.iterator;

import java.util.Arrays;
import java.util.List;

public class AlternatingIterableDemo {

	public static void main(String[] args) {
		List<String> listA = Arrays.asList("a", "b", "c");
		AlternatingIterable<String> alternatingIterable = new AlternatingIterable<String>(listA);
	}
}
