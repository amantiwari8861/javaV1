package in.iamandroid;

import in.iamandroid.creational.singelton.Singelton;

/*
 * 
 * This Project is having the implementations of all design patterns
 * 1.creational design pattern
 * 2.structural design pattern
 * 3.behavioural design pattern
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//1.Creational
    	//	a.Singleton
    	Singelton s1=Singelton.getInstance();
    	System.out.println(s1.hashCode());
    	
    	Singelton s2=Singelton.getInstance();
    	System.out.println(s2.hashCode());
    	
    }
}