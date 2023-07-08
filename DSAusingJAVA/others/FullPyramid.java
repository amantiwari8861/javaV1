/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullpyramid;
import java.util.*;

public class FullPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 int n;
	while (true)
	{
	System.out.print("\nEnter the number of lines in the pyramid:");
	n = Integer.parseInt(new Scanner(System.in).nextLine());
	if ((n < 1) || (n > 9))
	{
	System.out.println("\nNumber should be between 1 to 9.");
	}
	else
	{
			break;
	}
	}
	for (int i = 1; i <= n; i++)
		{
		for (int j = 1; j <= n - i; j++)
		{
			System.out.print("  ");
		}
		for (int j = 1; j <= i; j++)
		{
			System.out.print(j + " ");
		}
		for (int j = i - 1; j > 0; j--)
		{
			System.out.print(j + " ");
		}
	System.out.println();
	}
			new Scanner(System.in).nextLine();
    }
    }
    

