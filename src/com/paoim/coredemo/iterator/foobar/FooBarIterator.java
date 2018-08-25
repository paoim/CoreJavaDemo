package com.paoim.coredemo.iterator.foobar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FooBarIterator<String> implements Iterator<String> {

	private int position;
	private ArrayList<String> fooBarList;
	
	public FooBarIterator(FooBar foo) {
		this.fooBarList = (ArrayList<String>) foo.getFooBarList();
	}

	@Override
	public boolean hasNext() {
		return position < fooBarList.size();
	}

	@Override
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		String data = fooBarList.get(position);
		position++;
		return data;
	}
}
