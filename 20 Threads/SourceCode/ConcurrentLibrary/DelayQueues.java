package com.balazsholczer.udemy;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * This is an unbounded BlockingQueue of objects that implement the Delayed
 * interface
 * 
 * - DelayQueue keeps the elements internally until a certain delay has expired
 * 
 * - an object can only be taken from the queue when its delay has expired !!! -
 * 
 * We cannot place null items in the queue - The queue is sorted so that the
 * object at the head has a delay that has expired for the longest time.
 * 
 * If no delay has expired, then there is no head element and poll( ) will
 * return null
 * 
 * size() return the count of both expired and unexpired items !!!
 *
 */

public class App {

	public static void main(String[] args) {

		BlockingQueue<DelayedWorker> blockingQueue = new DelayQueue<DelayedWorker>();

		try {
			blockingQueue.put(new DelayedWorker(1000, "This is message #1"));
			blockingQueue.put(new DelayedWorker(10000, "This is message #2"));
			blockingQueue.put(new DelayedWorker(4000, "This is message #3"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (!blockingQueue.isEmpty()) {
			try {
				System.out.println(blockingQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class DelayedWorker implements Delayed {

	private long duration;
	private String message;

	public DelayedWorker(long duration, String message) {
		this.duration = System.currentTimeMillis() + duration;
		this.message = message;
	}

	@Override
	public int compareTo(Delayed otherDelayed) {
		if (this.duration < ((DelayedWorker) otherDelayed).getDuration()) {
			return -1;
		}
		
		if (this.duration > ((DelayedWorker) otherDelayed).getDuration()) {
			return 1;
		}
		
		return 0;
	}

	@Override
	public long getDelay(TimeUnit timeUnit) {
		return timeUnit.convert(duration - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return this.message;
	}
}
