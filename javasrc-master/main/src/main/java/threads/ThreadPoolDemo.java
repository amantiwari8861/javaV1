package threads;

import java.util.*;
import java.util.concurrent.*;

/**
 * Simple demo of the Java ThreadPools; run multiple threads.
 */
public class ThreadPoolDemo {

	private static final int HOWMANY = 5;
	private static boolean done = false;

	public static void main(String[] args) throws Exception {
		// tag::main[]
		final ExecutorService pool = Executors.newFixedThreadPool(HOWMANY);
		List<Future<Integer>> futures = new ArrayList<>(HOWMANY);
		for (int i = 0; i < HOWMANY; i++) {
			Future<Integer> f = pool.submit(new DemoRunnable(i));
			System.out.println("Got 'Future' of type " + f.getClass());
			futures.add(f);
		}
		Thread.sleep(3 * 1000);
		done = true;
		for (Future<Integer> f : futures) {
			System.out.println("Result " + f.get());
		}
		pool.shutdown();
		// end::main[]
	}

	static class DemoRunnable implements Callable<Integer> {
		int time, numRuns;
		DemoRunnable(int t) { time = t; }

		// @Override
		public Integer call() {
			while (!done) {
				System.out.println("Running " + Thread.currentThread());
				++numRuns;
			}
			System.out.println("Stopping " + this);
			return numRuns;
		}
	}
}
