/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly_input;
/**
 *
 * @author Ashish.Srivastav
 */
import java.util.*;

public class DoubleLinkedList
{
	private Node START;
	public DoubleLinkedList()
	{
		START = null;
	}

	public Node Search(int rollNo, Node previous, Node current) // Checks wheteher the specified node is present
	{
		for (previous = current = START; current!= null && rollNo != current.rollNumber; previous = current, current= current.next)
		{
		}
/* The preceding for loop traverses the list. If the specified node is found then the function returns true, otherwise false.*/
		return current;
	}
	public void traverse() // Traverses the list
	{

		if (listEmpty())
		{
			System.out.println("\nList is empty");
		}
		else
		{
			System.out.println("\nRecords in the ascending order of roll numbers are:\n");
			Node currentNode;
			for (currentNode = START; currentNode != null; currentNode = currentNode.next)
			{
				System.out.print(currentNode.rollNumber + "   " + currentNode.name + "\n");
			}
		}
	}
public void revtraverse() // Traverses the list in the reverse direction
{
		if (listEmpty())
		{
			System.out.println("\nList is empty");
		}
		else
		{
			System.out.println("\nRecords in the descending order of roll numbers are:\n");
			Node currentNode;
			for (currentNode = START; currentNode.next != null; currentNode = currentNode.next)
			{
			}
			while (currentNode != null)
			{
				System.out.print(currentNode.rollNumber + "   " + currentNode.name + "\n");
				currentNode = currentNode.prev;
			}
		}
}
	public  boolean listEmpty()
	{
		if (START == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		DoubleLinkedList obj = new DoubleLinkedList();
		while (true)
		{
			try
			{
				System.out.println("\nMenu");
				System.out.println("1. View all records in the ascending order of roll numbers");
				System.out.println("2. View all records in the descending order of roll numbers");
				System.out.println("3. Search for a record in the list");
				System.out.println("4. Exit\n");
				System.out.print("Enter your choice (1-4): ");
				char ch = new Scanner(System.in).nextLine().charAt(0);
				switch (ch)
				{
					case '1':
					{
							obj.traverse();
					}
						break;
					case '2':
					{
							obj.revtraverse();
					}
						break;
					case '3':
					{
							if (obj.listEmpty() == true)
							{
								System.out.println("\nList is empty");
								break;
							}
							Node prev, curr;
							prev = curr = null;
							System.out.print("\nEnter the roll number of the student whose record you want to search: ");
							int num = Integer.parseInt(new Scanner(System.in).nextLine());
							Node temp = obj.Search(num, prev, curr);
							if(temp==null)
							{
							System.out.println("\nRecord not found");
							}
							else
							{
							System.out.println("\nRecord found");
							System.out.println("\nRoll number: " + curr.rollNumber);
							System.out.println("\nName: " + curr.name);
							}
					}
						break;
					case '4':
						return;
					default:
					{
							System.out.println("\nInvalid option");
					}
						break;
				}
			}
			catch (RuntimeException e)
			{
				System.out.println("Check for the values entered.");
			}
		}
	}
}