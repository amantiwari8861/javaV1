package Exercise06;

import java.util.*;

public class List
{
	// Array of integers to hold values
	private int[] arr = new int[20];
	private int cmp_count; // Number of comparisons
	private int mov_count; // Number of data movements
	// Number of elements in array
	private int n;
	public List()
	{
		cmp_count = 0;
		mov_count = 0;
	}
	private void read()
	{
		while (true)
		{
			System.out.print("Enter the number of integers in the array: ");
			String s = new Scanner(System.in).nextLine();
			n = Integer.parseInt(s);
			if (n > 0 && n <= 20)
			{
				break;
			}
			else if (n > 20)
			{
				System.out.println("\nArray can have maximum 20 integers.\n");
			}
			else if (n < 0)
			{
				System.out.println("\nEnter positive number.\n");
			}

		}
		System.out.println("\n-----------------------");
		System.out.println(" Enter integers  ");
		System.out.println("-----------------------");

		// Get array elements
		for (int i = 0; i < n; i++)
		{
			System.out.print("<" + (i + 1) + "> ");
			String s1 = new Scanner(System.in).nextLine();
			arr[i] = Integer.parseInt(s1);
		}
	}

	private void swap(int x, int y) /* Swaps the element at index x with
 the element at index y */
	{
		int temp;

		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public final void q_sort(int low, int high)
	{
		int pivot, i, j;

		if (low > high)
		{
			return;
		}

		/* Partition the list into two parts:
		 One containing elements less than or equal to pivot
		 Other containing elements greater than pivot */

		i = low + 1;
		j = high;

		pivot = arr[low];

		while (i <= j)
		{
			// Search for an element greater than pivot
			while ((arr[i] <= pivot) && (i <= high))
			{
				i++;
				cmp_count++;
			}
			cmp_count++;

			// Search for an element less than or equal to pivot
			while ((arr[j] > pivot) && (j >= low))
			{
				j--;
				cmp_count++;
			}
			cmp_count++;

			if (i < j) //If the greater element is on the  left of the smaller element
			{

				mov_count++;
			}
		}

		/* j now contains the index of the last element in the 
   sorted list. */

		if (low < j)
		{
			swap(low, j); /* Move the pivot to its correct
    position in the list */
			mov_count++;
		}

		//Sort the list on the left of pivot using quick sort
		q_sort(high, j + 1);

		//Sort the list on the right of pivot using quick sort
		q_sort(j + 1, high);
	}

	private void display()
	{
		System.out.println("\n-----------------------");
		System.out.println(" Sorted array ");
		System.out.println("-----------------------");


		for (int j = 0; j < n; j++)
		{
			System.out.println(arr[j]);
		}

		System.out.println("\nNumber of comparisons: " + cmp_count);
		System.out.println("\nNumber of data movements: " + mov_count);
	}

	private int getSize()
	{
		return (n);
	}

	public static void main(String[] args)
	{
		// Declaring the object of the class
		List myList = new List();
		// Accept array elements
		myList.read();
		// Calling the sorting function
		myList.q_sort(0, myList.getSize() - 1); /* First call to
  Quick Sort 
  Algorithm */
		// Display sorted array
		myList.display();
		// To exit from the console
		System.exit(0);
	}
}