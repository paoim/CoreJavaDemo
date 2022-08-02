package com.pao.coredemo.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlternatingIterable<E> implements Iterable<E> {
	
	private Iterator<E> []iterators;

	public AlternatingIterable(List<E>... list) {
		List<Iterator<E>> outerList = new ArrayList<>();
		for (List<E> l : list) {
			outerList.add(l.iterator());
		}
		iterators = (Iterator<E>[]) outerList.toArray();
	}

	@Override
	public Iterator<E> iterator() {
		return new AlternatingIterator<E>(iterators);
	}

}
