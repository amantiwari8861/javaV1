package delhi;
import java.util.Scanner;
public class SabjiMandiLite {
	public static void main(String[] args) {

		Fruits basket[]=new Fruits[5];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < basket.length; i++) {
			basket[i]=new Fruits();
			System.out.println("enter the Fruit Name : ");
			basket[i].setName(sc.nextLine());
			System.out.println("enter the Fruit price : ");
			basket[i].setPrice(sc.nextInt());
			System.out.println("enter the Fruit Energy : ");
			basket[i].setEnergy(sc.nextDouble());
			sc.nextLine(); //if this will skip
		}
		for (int i = 0; i < basket.length; i++) {
			System.out.println("--------------------------------------------------------");
			System.out.println( "Name : "+basket[i].getName()+" Price(kg) :"+basket[i].getPrice()+" Energy(cal) : "+basket[i].getEnergy());
		}
	}

}
