package com.balazsholczer.udemy;

class Runner1 extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<10;++i){
			System.out.println("Runner1: "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Runner2 extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<100;++i){
			System.out.println("Runner2: "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App {

	public static void main(String[] args) {
		
//		Thread t1 = new Thread(new Runner1());
//		Thread t2 = new Thread(new Runner2());
		
		Runner1 t1 = new Runner1();
		Runner2 t2 = new Runner2();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			//t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished the tasks...");
	}
}
