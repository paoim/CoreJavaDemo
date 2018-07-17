package com.paoim.coredemo.sort.service;

import java.util.ArrayList;
import java.util.List;

public class QuickSortImpl implements QuickSort {

	public void quickSortArray(int array[], int low, int n) {
		int lo = low;
		int hi = n;
		
		if (lo >= n) {
			return;
		}

		int mid = array[(lo + hi) / 2];
		while (lo < hi) {
			while (lo < hi && array[lo] < mid) {
				lo++;
			}
			while (lo < hi && array[hi] > mid) {
				hi--;
			}

			if (lo < hi) {
				int T = array[lo];
				array[lo] = array[hi];
				array[hi] = T;
			}
		}

		if (hi < lo) {
			int T = hi;
			hi = lo;
			lo = T;
		}

		quickSortArray(array, low, lo);
		quickSortArray(array, lo == low ? lo + 1 : lo, n);
	}

	public List<Integer> getQuickSort(List<Integer> list, boolean isAsc) {
		int size = list.size();

		if (size <= 1) {
			return list;
		}

		int middle = (int) Math.ceil((double) size / 2);
		int pivot = list.get(middle);

		List<Integer> less = new ArrayList<Integer>();
		List<Integer> greater = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			boolean sortByAsc = (isAsc ? (list.get(i) <= pivot) : (list.get(i) >= pivot));
			if (sortByAsc) {
				if (i == middle) {
					continue;
				}

				less.add(list.get(i));
			} else {
				greater.add(list.get(i));
			}
		}

		getQuickSort(less, isAsc);
		getQuickSort(greater, isAsc);

		list.clear();
		list.addAll(less);
		list.add(pivot);
		list.addAll(greater);

		return list;
	}

	public static void main(String args[]) {
		QuickSort quickSort = new QuickSortImpl();

		int arrays[] = { 12, 9, 4, 99, 120, 1, 3, 10, 13 };
		System.out.println("Values Before the sort");
		for (int i = 0; i < arrays.length; i++)
			System.out.print(arrays[i] + "  ");
		System.out.println();

		quickSort.quickSortArray(arrays, 0, arrays.length - 1);
		System.out.println("Values After the sort");
		for (int i = 0; i < arrays.length; i++)
			System.out.print(arrays[i] + "  ");
		System.out.println();
	}
}
