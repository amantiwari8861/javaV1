package runnables;

public class Printer2 implements Runnable
{
    int num;
    public Printer2(int num)
    {
        this.num=num;
    }
	@Override
	public void run() 
    {
        System.out.println("Num="+num+" Printed by "+Thread.currentThread().getName());
	}   
}
