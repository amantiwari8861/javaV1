/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;
import java.util.*;

public class PrimeNumbers {

 public static boolean isPrime(int num)
 {
			boolean prime = true;
			for (int i = 2; i <= num / 2; i++)
			{
				if (num % i == 0)
				{
					prime = false;
					break;
				}
			}
			return (prime);
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 

			int count = 0;

			System.out.println("The first 10 prime numbers are:\n");
			for (int num = 2; count < 10; num++)
			{
				if (isPrime(num))
				{
					System.out.println(num);
					count++;
				}

			}
			System.out.println("\nPress Enter to return.");
			new Scanner(System.in).nextLine();
		
    }
    
}
