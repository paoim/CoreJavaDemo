package com.pao.coredemo.lambda.methodreference;

public class MyMethodReference {

	public static void saySomething(String message) {
		System.out.println("Using normal");
		System.out.println(message);
	}
	
	public static void saySomething(String ...strings) {
		System.out.println("Using vararg...");
		for (String message : strings) {
			System.out.println(message);
		}
	}
	
	public static void saySomething(String message, String ...strings) {
		System.out.println("Using normal and vararg...");
		System.out.println(message);
	}
}
