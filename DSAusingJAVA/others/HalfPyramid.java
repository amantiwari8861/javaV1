/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halfpyramid;
import java.util.*;

public class HalfPyramid {
public final void display(int num)
{
			for (int i = 1; i <= num; i++)
			{
				for (int j = i; j >= 1; j--)
				{
					System.out.print(j + "    ");
				}
				System.out.println("\n");
			}
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		int num;
                        HalfPyramid obj=new HalfPyramid();
			do
			{
				System.out.print("\nEnter a number between 1 and 9: ");
				num = Integer.parseInt(new Scanner(System.in).nextLine());
				if ((num < 1) || (num > 9))
				{
					System.out.println("\nNumber should be between 1 and 9.");
				}
			} while ((num < 1) || (num > 9));

			System.out.println();
			obj.display(num);
			new Scanner(System.in).nextLine();

    }
    
}
