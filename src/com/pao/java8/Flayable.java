package com.pao.java8;

@FunctionalInterface
public interface Flayable {

	void fly(String msg);

	default void check(String msg) {
		if ("Cat".equalsIgnoreCase(msg) || "Dog".equalsIgnoreCase(msg)) {
			print(msg + " cannot fly!");
		} else {
			print(msg + " can fly!");
		}
	}

	static void print(String msg) {
		System.out.println(msg);
	}
}
