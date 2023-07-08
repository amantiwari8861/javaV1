/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchstring;
import java.util.*;

public class SearchString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] str = new char[50]; //The string in which substrin is to be searched
	char[] substr = new char[50]; //The substring to be searched
	System.out.print("\nEnter the string in which substring is to be searched: ");
	str = new Scanner(System.in).nextLine().toCharArray();
	System.out.print("\nEnter the substring to be searched: ");
	substr = new Scanner(System.in).nextLine().toCharArray();

			int i = 0;
			int len1 = str.length;
			int len2 = substr.length;
			boolean match = false;

			while (i < len1)
			{
				while ((i < len1) && (str[i] != substr[0]))
				{
					i++;
				}

				if (i + len2 > len1)
				{
					break;
				}
				else
				{
					int j = i;
					int k = 0;
					while ((j < len1) && (k < len2) && (str[j] == substr[k]))
					{
						j++;
						k++;
					}

					if (k == len2)
					{
						match = true;
						break;
					}
				}
				i++;
			}

			if (match)
			{
				System.out.println("\nSubstring found at position " + (i + 1) + " in the string.");
			}
			else
			{
				System.out.println("\nSubstring not found in the string.");
			}

			new Scanner(System.in).nextLine();
    }
    
}
