package com.balazsholczer.udemy;

class Worker implements Runnable {

	private boolean isTerminated = false;
	
	@Override
	public void run() {
		
		while(!isTerminated) {
			
			System.out.println("Hello from worker class...");
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean isTerminated() {
		return isTerminated;
	}

	public void setTerminated(boolean isTerminated) {
		this.isTerminated = isTerminated;
	}
}

public class App {

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		Thread t1 = new Thread(worker);
		t1.start();
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		worker.setTerminated(true);
		System.out.println("Finished...");
	}
}
