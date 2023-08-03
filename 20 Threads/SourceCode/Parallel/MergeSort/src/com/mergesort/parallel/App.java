package com.mergesort.parallel;

import java.util.Random;

public class App {

	public static Random random = new Random();
	
	public static void main(String[] args) throws Throwable {
		int numOfThreads  = Runtime.getRuntime().availableProcessors();
		
		//int[] nums = {4,2,6,5,44,78,-4,0,1};
		
		

		System.out.println("Number of threads/cores: " + numOfThreads);
		System.out.println("");

		
			int[] numbers = createRandomArray();
			MergeSort mergeSort = new MergeSort(numbers);

			// System.out.println("Array("+LENGTH+") elements before sort: ");
			// Print first 10 elements
			// printIntArray(a);

			// run the algorithm and time how long it takes
			long startTime1 = System.currentTimeMillis();
			mergeSort.parallelMergeSort(0, numbers.length-1, numOfThreads);
			mergeSort.showResult();
			long endTime1 = System.currentTimeMillis();

			
			// System.out.println("Array("+LENGTH+") elements after sort: ");
			// Print first 10 elements
			// printIntArray(a);


			System.out.printf("Time taken for 100 000 000 elements parallel =>  %6d ms \n", endTime1 - startTime1);
			System.out.println("");
			
			startTime1 = System.currentTimeMillis();
			mergeSort.mergeSort(0,numbers.length-1);
			endTime1 = System.currentTimeMillis();

			
			// System.out.println("Array("+LENGTH+") elements after sort: ");
			// Print first 10 elements
			// printIntArray(a);


			System.out.printf("Time taken for 100 000 000 elements sequential =>  %6d ms \n", endTime1 - startTime1);
			System.out.println("");
		
		//MergeSort mergeSort = new MergeSort(nums);
		
		//mergeSort.parallelMergeSort(0, nums.length-1, numOfThreads);
		//mergeSort.showResult();
		
		
	}
	
	public static int[] createRandomArray() {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = random.nextInt(10000);			
		}
		return a;
	}
}
