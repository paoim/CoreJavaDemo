package com.paoim.coredemo.math;

public class FirstAndLastIndexOfDuplicateArray {

	private static FirstAndLastIndexOfDuplicateArray instance;

	private FirstAndLastIndexOfDuplicateArray() {
		// private constructor
	}

	// Lazy initialization with Double check locking
	public static FirstAndLastIndexOfDuplicateArray getInstance() {
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (FirstAndLastIndexOfDuplicateArray.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new FirstAndLastIndexOfDuplicateArray();
				}
			}
		}
		return instance;
	}
	
	private void displayFirstAndLastIndex(int a[], int key) {
		if (0 == a.length) {
			System.out.println("Nothing to display");
			return;
		}
		int lastIndex = -1;
		int firstIndex = -1;
		for (int i = 0; i < a.length; i++) {
			if (key == a[i] && -1 == firstIndex) {
				firstIndex = i;
			} else if (key == a[i] && -1 != firstIndex) {
				lastIndex = i;
			}
		}
		System.out.println("First Index is " + firstIndex + ", and last index is " + lastIndex + " for " + key);
	}

	public static void main(String[] args) {
		int a[] = {1, -2, 20, -100, 100, -2, 800, -25, 100};
		FirstAndLastIndexOfDuplicateArray instance = getInstance();
		instance.displayFirstAndLastIndex(a, -2);
		instance.displayFirstAndLastIndex(a, 100);
	}
}
