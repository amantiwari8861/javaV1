package com.balazsholczer.udemy;

class Runner1 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<10;++i)
			System.out.println("Runner1: "+i);
	}
}

class Runner2 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<10;++i)
			System.out.println("Runner2: "+i);
	}
}

public class App {

	public static void main(String[] args) {
		
		//Thread t1 = new Thread(new Runner1());
		//Thread t2 = new Thread(new Runner2());
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<1000;++i)
					System.out.println("Runner1: "+i);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<1000;++i)
					System.out.println("Runner2: "+i);
			}
		});
		
		t1.start();
		t2.start();
	}
}
