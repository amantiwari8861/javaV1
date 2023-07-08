/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypack;

import java.util.Scanner;

public class Array {

  private int[] arr = new int[10];
		public final void accept()
		{
			for (int i = 0; i < 10; i++)
			{
				while (true)
				{
					System.out.print("<" + (i + 1) + "> ");
					arr[i] = Integer.parseInt(new Scanner(System.in).nextLine());
					if ((i > 0) && (arr[i] < arr[i - 1]))
					{
						System.out.println("\nNumbers must be entered in ascending order. Try again.");
					}
					else
					{
						break;
					}
				}
			}
		}

		public final MergedArray merge(Array A)
		{
			MergedArray result = new MergedArray();
			int i, j, k;
			i = j = k = 0;
			while ((i < 10) && (j < 10))
			{
				if (arr[i] <= A.arr[j])
				{
					result.arr[k++] = arr[i++];
				}
				else
				{
					result.arr[k++] = A.arr[j++];
				}
			}

			while (i < 10)
			{
				result.arr[k++] = arr[i++];
			}

			while (j < 10)
			{
				result.arr[k++] = A.arr[j++];
			}

			return (result);
		}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
			Array A1 = new Array();
			Array A2 = new Array();
			MergedArray A3 = new MergedArray();

			System.out.println("\nEnter the first list of numbers in ascending order.\n");
			A1.accept();

			System.out.println("\nEnter the second list of numbers in ascending order.\n");
			A2.accept();
			A3 = A1.merge(A2);
			A3.display();
			new Scanner(System.in).nextLine();

    }
    
}
