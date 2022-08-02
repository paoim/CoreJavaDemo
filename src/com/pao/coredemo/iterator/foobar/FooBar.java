package com.pao.coredemo.iterator.foobar;

import java.util.ArrayList;
import java.util.Iterator;

public class FooBar implements Iterable<String> {

	private ArrayList<String> fooBarList = new ArrayList<>();
	
	public FooBar(ArrayList<String> fooBarList) {
		this.fooBarList = fooBarList;
	}

	public ArrayList<String> getFooBarList() {
		return fooBarList;
	}

	@Override
	public Iterator<String> iterator() {
		return new FooBarIterator<String>(this);
	}

}
