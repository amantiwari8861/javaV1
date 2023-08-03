package com.balazsholczer.udemy;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random random = new Random();
		SequentialSum sequentialSum = new SequentialSum();
		
		int numOfProcessors = Runtime.getRuntime().availableProcessors();

	    int[] nums = new int[100000000];

	    for (int i = 0; i < nums.length; i++) {
	        nums[i] = random.nextInt(101) + 1; // 1..100
	    }

	    long start = System.currentTimeMillis();

	    System.out.println("Sum is: " + sequentialSum.sum(nums));

	    System.out.println("Single: " + (System.currentTimeMillis() - start)+"ms"); // Single: 44

	    start = System.currentTimeMillis();

	    ParallelSum parallelSum = new ParallelSum(numOfProcessors);
	    System.out.println("Sum is: " +parallelSum.parallelSum(nums));

	    System.out.println("Parallel: " + (System.currentTimeMillis() - start)+ "ms"); // Parallel: 25
		
	}
}
