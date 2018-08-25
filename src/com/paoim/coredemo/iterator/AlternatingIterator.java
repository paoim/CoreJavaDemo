package com.paoim.coredemo.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class AlternatingIterator<E> implements Iterator {

	private E[] values;
	private int position;

	public AlternatingIterator(Iterator<E>... iterators) {
		generateValues(iterators);
	}

	@Override
	public boolean hasNext() {
		return (null != values && position < values.length);
	}

	@Override
	public E next() {
		if (!this.hasNext()) {
			throw new NoSuchElementException();
		}
		E object = values[position];
		position++;
		return object;
	}
	
	/**
	 * Helper Method to convert from Iterator to Array
	 * 
	 * @param iterator
	 * @return Array of E where E is the generic object
	 */
	private E[] convertIteratorToArray(Iterator<E> iterator) {
		List<E> list = convertIteratorToList(iterator);
		E[] array = convertListToArray(list);
		return array;
	}
	
	/**
	 * Helper Method to convert from List to Array
	 * 
	 * @param list
	 * @return Array of E
	 */
	private E[] convertListToArray(List<E> list) {
		E[] array = (E[]) list.toArray();
		return array;
	}
	
	/**
	 * Helper Method to convert from Iterator to List
	 * 
	 * @param iterator
	 * @return List of E where E is the generic object
	 */
	private List<E> convertIteratorToList(Iterator<E> iterator) {
		List<E> list = new ArrayList<>();
		iterator.forEachRemaining(list::add);
		return list;
	}
	
	/**
	 * Helper Method to produce the elements in order
	 * if input like this:
	 * [a,b,c], [1,2], and [x,y,z]
	 * Then it will display:
	 * 'a, 1, x, b, 2, y, c, z'
	 * 
	 * @param iterators
	 */
	private void generateValues(Iterator<E>... iterators) {
		if (null == iterators || 0 == iterators.length) {
			return;
		}
		if (1 < iterators.length) {
			// Multiple Arrays - need to display in order
			List<E[]> arrayList = new ArrayList<>();
			int maxInnerArraySize = Integer.MIN_VALUE;
			
			// Loop all iterators
			for (Iterator<E> iterator : iterators) {
				E[] innerArray = convertIteratorToArray(iterator);
				if (maxInnerArraySize < innerArray.length) {
					maxInnerArraySize = innerArray.length;
				}
				arrayList.add(innerArray);
			}
			
			// Merge all Arrays into one Array with the pattern of array1[0], array2[0], array3[0]..., array1[1], array2[1], array3[1],..., array1[2], array2[2], array3[2]...
			List<E> orderList = new ArrayList<>();
			E[] outerArray= (E[]) arrayList.toArray();
			for (int i = 0; i < maxInnerArraySize; i++) {
				for (int j = 0; j < outerArray.length; j++) {
					E[] innerArray = (E[]) outerArray[j];
					try {
						orderList.add(innerArray[i]);
					} catch (ArrayIndexOutOfBoundsException e) {
						// Ignore if Exception Occurs
					}
				}
			}
			values = convertListToArray(orderList);
		} else {
			// Single Array - still display as it is, just convert from Iterator to Array
			values = convertIteratorToArray(iterators[0]);
		}
	}
}
