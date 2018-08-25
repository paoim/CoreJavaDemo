package com.paoim.coredemo.oop.abstractdemo;

public abstract class Animal {
	
	public String getName() {
		System.out.println("I am in Parent Class");
		return "";
	}
	
	public void setName(String newName) {
		System.out.println("I am in setName of Parent Class");
	}
}
