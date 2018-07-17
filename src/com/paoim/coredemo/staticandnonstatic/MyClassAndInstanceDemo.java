package com.paoim.coredemo.staticandnonstatic;

public class MyClassAndInstanceDemo {

	public static void main(String[] args) {
		MyClassAndInstancePojo.printFirstClassMethod();
		System.out.println("==============Create Instance================");
		MyClassAndInstancePojo myPojo = new MyClassAndInstancePojo();
		myPojo.printFirstInstanceMethod();
	}
}
