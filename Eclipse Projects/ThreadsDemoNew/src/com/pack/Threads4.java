// package com.pack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNum implements Runnable
{  
    int num;
    PrintNum(int num)
    {
        this.num=num;
    }
    @Override
    public void run()
    {
        System.out.println(num+" by "+Thread.currentThread().getName());
    }
}
public class Threads4 {

    public static void main(String[] args) {
    	ExecutorService executorService=null;
        for (int i = 1; i <= 100; i++) {
            // Thread t=new Thread(new PrintNum(i));
            // t.start();
//            executorService = Executors.newCachedThreadPool();
       	executorService=Executors.newFixedThreadPool(4);
        	// executorService=Executors.newSingleThreadExecutor();
            executorService.execute(new PrintNum(i));
        }
        
        executorService.shutdown();
    }
}