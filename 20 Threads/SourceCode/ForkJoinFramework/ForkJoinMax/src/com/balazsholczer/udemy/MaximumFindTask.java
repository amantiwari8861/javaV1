package com.balazsholczer.udemy;

import java.util.concurrent.RecursiveTask;

public class MaximumFindTask extends RecursiveTask<Long> {

	private long[] nums;
	private int lowIndex;
	private int highIndex;
	
	public MaximumFindTask(long[] nums, int lowIndex, int highIndex) {
		this.highIndex = highIndex;
		this.lowIndex = lowIndex;
		this.nums = nums;
	}

	@Override
	protected Long compute() {
		
		if( highIndex - lowIndex < App.THREASHOLD ) {
			return sequentialMaxFinding();
		} else {
			
			int middleIndex = (lowIndex+highIndex) / 2;
			
			MaximumFindTask leftSubtask = new MaximumFindTask(nums, lowIndex, middleIndex);
			MaximumFindTask rightSubtask = new MaximumFindTask(nums, middleIndex, highIndex);
			
			invokeAll(leftSubtask, rightSubtask);
			
			return Math.max(leftSubtask.join(), rightSubtask.join());
		}
	}
	
	private long sequentialMaxFinding() {
		
		long max = nums[0];
		
		for(int i=lowIndex; i<highIndex;++i)
			if( nums[i] > max)
				max = nums[i];
		
		return max;
	}
}
