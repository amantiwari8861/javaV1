package com.balazsholczer.udemy;

public class App {

	private static int count1 = 0;
	private static int count2 = 0;
	
	public synchronized static void add() {
		count1++;
	}
	
	public synchronized static void addAgain() {
		count2++;
	}

	public static void compute() {
		for(int i=0;i<100;++i) {
			add();
			addAgain();
		}
	}
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				compute();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				compute();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count1="+count1+" - Count2="+count2);
	}
}
