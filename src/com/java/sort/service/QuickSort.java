package com.java.sort.service;

import java.util.List;

public interface QuickSort {

	void quickSortArray(int array[], int low, int n);

	List<Integer> getQuickSort(List<Integer> list, boolean isAsc);

}