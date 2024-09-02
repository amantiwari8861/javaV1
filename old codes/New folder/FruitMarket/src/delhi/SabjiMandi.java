package delhi;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Iterator;

public class SabjiMandi {

	public static void main(String[] args) {

//		Fruits f1=new Fruits(200,"anar",5.9);
//		Fruits f2=new Fruits(250,"apple",0.3);
//		Fruits f3=new Fruits(60,"banana",2.1);
//		Fruits f4=new Fruits(400,"dragon fruit",6.5);
//		Fruits f5=new Fruits(40,"chiku",2);
		
		//class is also a user defined data type
		Collection<Fruits> basket=new ArrayList<Fruits>();
//		basket.add(f1);
//		basket.add(f2);
//		basket.add(f3);
//		basket.add(f4);
//		basket.add(f5);
		//type 2nd
		basket.add(new Fruits(200,"anar",5.9));
		basket.add(new Fruits(201,"anar",5.9));
		basket.add(new Fruits(202,"anar",5.9));
		basket.add(new Fruits(203,"anar",5.9));
		basket.add(new Fruits(204,"anar",5.9));
//		basket.forEach(fruit->{
//			System.out.println("--------------------------------------------------------");
//			System.out.println( "Name : "+fruit.getName()+" Price(kg) :"+fruit.getPrice()+" Energy(cal) : "+fruit.getEnergy());
//		});
		//type 2
//		for (Iterator iterator = basket.iterator(); iterator.hasNext();) {
//			Fruits fruit = (Fruits) iterator.next();
//			System.out.println("--------------------------------------------------------");
//			System.out.println( "Name : "+fruit.getName()+" Price(kg) :"+fruit.getPrice()+" Energy(cal) : "+fruit.getEnergy());
//		}
		//type 3
		for(Fruits fruit:basket)
		{
			System.out.println("--------------------------------------------------------");
			System.out.println( "Name : "+fruit.getName()+" Price(kg) :"+fruit.getPrice()+" Energy(cal) : "+fruit.getEnergy());
		}
	}

}
