package PhilosopherProblem;

import java.util.Random;

public class Philosopher implements Runnable {

	private int id;
	private ChopStick leftChopStick;
	private ChopStick rightChopStick;
	private volatile boolean isFull = false;
	private Random random;
	private int eatingCounter;
	
	public Philosopher(int id, ChopStick leftChopStick, ChopStick rightChopStick){
		this.id = id;
		this.leftChopStick = leftChopStick;
		this.rightChopStick = rightChopStick;
		this.random = new Random();
	}
	
	@Override
	public void run() {
		
		try{
			
			while( !isFull ){
				
				think();
				
				if( leftChopStick.pickUp(this, State.LEFT) ){
					if( rightChopStick.pickUp(this, State.RIGHT)){
						eat();
						rightChopStick.putDown(this, State.RIGHT);
					}
					
					leftChopStick.putDown(this, State.LEFT);
				}	
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void think() throws InterruptedException {
		System.out.println(this+" is thinking...");
		Thread.sleep(this.random.nextInt(1000));
	}
	
	private void eat() throws InterruptedException {
		System.out.println(this+" is eating...");
		this.eatingCounter++;
		Thread.sleep(this.random.nextInt(1000));
	}
	
	public int getEatingCounter(){
		return this.eatingCounter;
	}
	
	public void setFull(boolean isFull){
		this.isFull = isFull;
	}
	
	@Override
	public String toString() {
		return "Philosopher-"+this.id;
	}
}
