package com.pao.coredemo.iterator.foobar;

import java.util.ArrayList;

public class FooBarDemo {

	public static void main(String[] args) {
		ArrayList<String> fooBarList = new ArrayList();
		fooBarList.add("My Foo");
		fooBarList.add("My Bar");
		fooBarList.add("Foo and Bar");
		FooBar fooBar = new FooBar(fooBarList);
		for (String data : fooBar) {
			System.out.println(data);
		}
	}
}
