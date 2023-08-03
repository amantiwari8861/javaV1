package com.mergesort.parallel;

import java.util.Arrays;

public class MergeSort {

	private int[] nums;
	private int[] tempArray;

	public MergeSort(int[] nums) {
		this.nums = nums;
		tempArray = new int[nums.length];
	}

	public void parallelMergeSort(int low, int high, int numOfThreads) {

		if (numOfThreads <= 1) {
			mergeSort(low, high);
			return;
		}

		int middleIndex = (low + high) / 2;

		Thread leftSorter = mergeSortThread(low, middleIndex, numOfThreads);
		Thread rightSorter = mergeSortThread(middleIndex+1, high, numOfThreads);

		leftSorter.start();
		rightSorter.start();

		try {
			leftSorter.join();
			rightSorter.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		merge(low, middleIndex, high);
	}

	private Thread mergeSortThread(int low, int high, int numOfThreads) {

		return new Thread() {
			@Override
			public void run() {
				parallelMergeSort(low, high, numOfThreads / 2);
			}
		};
	}

	public void mergeSort(int low, int high) {

		if (low >= high) {
			return;
		}

		int middle = (low + high) / 2;

		mergeSort(low, middle);
		mergeSort(middle + 1, high);
		merge(low, middle, high);
	}

	public void showResult() {
		for (int i = 0; i < nums.length; ++i) {
			System.out.print(nums[i] + " ");
		}
	}

	private void merge(int low, int middle, int high) {

		// Copy nums[i] -> temp[i]
		for (int i = low; i <= high; i++) {
			tempArray[i] = nums[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;

		// Copy the smallest values from either the left or the right side back
		// to the original array
		while ((i <= middle) && (j <= high)) {
			if (tempArray[i] <= tempArray[j]) {
				nums[k] = tempArray[i];
				i++;
			} else {
				nums[k] = tempArray[j];
				j++;
			}

			k++;
		}

		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			nums[k] = tempArray[i];
			k++;
			i++;
		}
	}
}
