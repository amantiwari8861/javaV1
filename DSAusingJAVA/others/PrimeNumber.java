/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;
import java.util.*;

public class PrimeNumber {

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
        int num;
		char ch = 'y';

		while (ch == 'y')
		{
		System.out.print("\nEnter a number :");
		num = Integer.parseInt(new Scanner(System.in).nextLine());
		if (isPrime(num))
		{
			System.out.println("\nEntered number is a prime number.");
		}
		else
		{
			System.out.println("\nEntered number is not a prime number.");
		}
		System.out.print("\nContinue? (y/n): ");
		ch = (char)new Scanner(System.in).nextLine().charAt(0);
    }
    }    
}
