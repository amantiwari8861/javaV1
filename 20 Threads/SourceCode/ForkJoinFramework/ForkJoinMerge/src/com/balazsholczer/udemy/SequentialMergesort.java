package com.balazsholczer.udemy;

import java.util.Arrays;

public class SequentialMergesort {

	private int[] nums;
	
	public SequentialMergesort(int[] nums) {
		this.nums = nums;
	}
	
public void mergeSort(int[] nums) {
		
		if (nums.length <= 1)
			return;

		int middleIndex = nums.length / 2;

		int[] left = Arrays.copyOfRange(nums, 0, middleIndex);
		int[] right = Arrays.copyOfRange(nums, middleIndex, nums.length);

		mergeSort(left);
		mergeSort(right);

		merge(left, right, nums);
	}

	private void merge(int[] leftSubarray, int[] rightSubarray, int[] originalArray) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < leftSubarray.length && j < rightSubarray.length) {
			if (leftSubarray[i] < rightSubarray[j])
				originalArray[k++] = leftSubarray[i++];
			else
				originalArray[k++] = rightSubarray[j++];
		}

		while (i < leftSubarray.length)
			originalArray[k++] = leftSubarray[i++];

		while (j < rightSubarray.length)
			originalArray[k++] = rightSubarray[j++];
	}
}
