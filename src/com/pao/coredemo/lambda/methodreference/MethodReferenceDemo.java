package com.pao.coredemo.lambda.methodreference;

import com.pao.coredemo.lambda.Sayable;

public class MethodReferenceDemo {

	public static void run() {
		Sayable sayable = MyMethodReference::saySomething;
		sayable.say("This is method reference in Lambda Express");
	}
}
