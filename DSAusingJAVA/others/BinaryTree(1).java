package tree_input;

import java.util.*;

public class BinaryTree
{
		public Node ROOT,parent,currentNode;
		public BinaryTree()
		{
			ROOT = null; // Initializing ROOT to null
		}
		public final void insert(String element) /* Inserts a Node in the
        Binary Search Tree */
		{
			Node tmp;
			parent = currentNode = null;
			find(element);
			if (currentNode != null) /* Checks if the node to be
            inserted is already present or not */
			{
				System.out.println("Duplicate words not allowed");
				return;
			}
			else // If the specified Node is not present
			{
				tmp = new Node(element, null, null); /* Creates a
                Node */
				if (parent == null) // If the tree is empty
				{
					ROOT = tmp;
				}
				else
				{
					if (element.compareTo(parent.info) < 0)
					{
						parent.lchild = tmp;
					}
					else
					{
						parent.rchild = tmp;
					}
				}
			}
		}
		public final void find(String element)
		{
			/* This function finds a given element in the tree and returns a variable containing the address of the corresponding node. It also returns a variable 
			containing the address of the parent of the node. */
			currentNode = ROOT;
			parent = null;
			while ((currentNode != null) && (!element.equals(currentNode.info)))
			{
				parent = currentNode;
				if (element.compareTo(currentNode.info) < 0)
				{
					currentNode = currentNode.lchild;
				}
				else
				{
					currentNode = currentNode.rchild;
				}
			}
		}
		public final void inorder(Node ptr) /* Performs the inorder
        traversal of the tree */
		{
			if (ptr != null)
			{
				inorder(ptr.lchild);
				System.out.print(ptr.info + "   ");
				inorder(ptr.rchild);
			}
		}
	  public static void main(String[] args)
	  {
			BinaryTree b = new BinaryTree();
			while (true)
			{
				System.out.println("\nMenu");
				System.out.println("1. Implement insert operation");
				System.out.println("2. Perform inorder traversal");
				System.out.println("3. Exit");
				System.out.print("\nEnter your choice (1-3): ");
				char ch = new Scanner(System.in).nextLine().charAt(0);
				System.out.println();
				switch (ch)
				{
					case '1':
							System.out.print("Enter a word: ");
							String word = new Scanner(System.in).nextLine();
							b.insert(word);
							break;
					case '2':
							if (b.ROOT == null)
							{
								System.out.println("Tree is empty");
								new Scanner(System.in).nextLine();
								return;
							}
							b.inorder(b.ROOT);
							break;
					case '3':
						return;
					default:
							System.out.println("Invalid option");
							break;
				}

			}
	  }
}