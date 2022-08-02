package com.pao.coredemo.oop.abstractdemo;

public class Dog extends Animal {
	
	private String name;

	@Override
	public String getName() {
		System.out.println("I am in Child Class");
		return name;
	}

	@Override
	public void setName(String newName) {
		System.out.println("I am in setName of Child Class");
		name = newName;
	}
}
