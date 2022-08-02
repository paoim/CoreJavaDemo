package com.pao.coredemo.staticandnonstatic;

public class MyClassAndInstancePojo {
	private static String myFirstClassVariable;
	public static String mySecondClassVariable;
	
	private String myFirstInstanceVariable;
	public String mySecondIntanceVariable;
	
	static {
		myFirstClassVariable = "This is first value of myFirstClassVariable";
		mySecondClassVariable = "This is first value of mySecondClassVariable";
		
		//myFirstInstanceVariable = "This is first value of myFirstInstanceVariable";
		//mySecondIntanceVariable = "This is first value of mySecondIntanceVariable";
	}

	public MyClassAndInstancePojo() {
		this.myFirstClassVariable = "This is second value of myFirstClassVariable";
		this.mySecondClassVariable = "This is second value of mySecondClassVariable";
		
		this.myFirstInstanceVariable = "This is second value of myFirstInstanceVariable";
		this.mySecondIntanceVariable = "This is second value of mySecondIntanceVariable";
	}
	
	public static void printFirstClassMethod() {
		//myFirstInstanceVariable = "This is Third value of myFirstInstanceVariable";
		//mySecondIntanceVariable = "This is Third value of mySecondIntanceVariable";
		
		//myFirstClassVariable = "This is third value of myFirstClassVariable";
		//mySecondClassVariable = "This is third value of mySecondClassVariable";
		
		System.out.println(myFirstClassVariable);
		System.out.println(mySecondClassVariable);
		
		//System.out.println(myFirstInstanceVariable);
		//System.out.println(mySecondIntanceVariable);
	}
	
	public void printFirstInstanceMethod() {
		myFirstClassVariable = "This is four value of myFirstClassVariable";
		mySecondClassVariable = "This is four value of mySecondClassVariable";
		
		System.out.println(myFirstClassVariable);
		System.out.println(mySecondClassVariable);
		
		System.out.println("==============Instance Variable================");
		System.out.println(myFirstInstanceVariable);
		System.out.println(mySecondIntanceVariable);
	}
}
