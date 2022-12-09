// package com.pack1;

class NewThread1 extends Thread {
	NewThread1() {
		super("demo thread");
		System.out.println("child thread :" + this);
		start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("child thread:" + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("child thread intruppted");
		}
		System.out.println("existing child thread");
	}
}

class ExtendThread1 {
	public static void main(String args[]) {
		new NewThread1();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main thread :" + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread intruppted.");
		}
		System.out.println("main thread exiting");
	}
}