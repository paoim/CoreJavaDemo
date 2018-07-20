package com.paoim.coredemo.lambda.inline;

import com.paoim.coredemo.lambda.Sayable;

public class InlineCodeDemo {

	public static void run() {
		Sayable sayable = message -> {
			System.out.println(message);
		};
		sayable.say("This is inline code of Lambda Express.");
	}
}
