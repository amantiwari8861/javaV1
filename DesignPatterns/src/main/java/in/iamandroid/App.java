package in.iamandroid;

import java.util.Scanner;

import in.iamandroid.creational.abstractfactory.AbstractIceCreamFactory;
import in.iamandroid.creational.abstractfactory.FactoryCreator;
import in.iamandroid.creational.abstractfactory.IceCream;
import in.iamandroid.creational.builder.Student;
import in.iamandroid.creational.factory.Factory;
import in.iamandroid.creational.factory.Food;
import in.iamandroid.creational.prototype.Employee;
import in.iamandroid.creational.prototype.Virus;
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
    public static void main( String[] args ) throws InterruptedException
    {
    	Scanner sc=new Scanner(System.in);
//    	1.Creational
//    		a.Singleton
//    	Singelton s1=Singelton.getInstance();
//    	System.out.println(s1.hashCode());
//    	
//    	Singelton s2=Singelton.getInstance();
//    	System.out.println(s2.hashCode());
    	
//    		b.factory method
//    	Food f=Factory.getFood("burger");
//    	Food f2=Factory.getFood("pizza");
    	
//    		c.Abstract Factory
//    	System.out.println("which product u want");
//    	System.out.println("1.ice-cream");
//    	System.out.println("2.milkshake");
//    	String product=sc.next();
//    	System.out.println("which flovour u want");
//    	System.out.println("1.strawberry");
//    	System.out.println("2.chocolate");
//    	String flavour=sc.next();
//    	System.out.println("which brand's product u want");
//    	System.out.println("1.vadilal");
//    	System.out.println("2.magnum");
//    	String brand=sc.next();
//    	
//    	AbstractIceCreamFactory factory=FactoryCreator.getFactory(brand);
//    	
//    	if(product.equalsIgnoreCase("ice-cream"))
//    	{
//    		IceCream iceCream=factory.createIceCream(flavour);
//    		System.out.println(iceCream);
//    	}
//    	else
//    	{
//    		System.out.println("other order");
//    	}
    	
//    		d.prototype
//    	System.out.print("how many virus u wanna make ? ");
//    	int quantity=sc.nextInt();
//    	
//    	for (int i = 0; i < quantity; i++) 
//    	{
//			new Virus().createVirus();
//		}
//    	Employee emp1=new Employee();
//    	emp1.enhanceSkill();
    	
//    	Thread.sleep(5000);
//    	Employee emp2 = emp1.getEmpObj();
//    	Employee emp3 = emp1.getEmpObj();
//    	Employee emp4 = emp1.getEmpObj();
//    	System.out.println(emp1);
//    	System.out.println(emp2);
//    	System.out.println(emp3);
//    	System.out.println(emp4);
    	
//    		e.builder
    	Student student=new Student.StudentBuilder(1, "Aman", 1200.5,12).setGender('M').setMarried(false).build();    	
    	System.out.println(student);
    	
    	
    	sc.close();
    }
}