//difference between next() and nextLine()

import java.util.Scanner;
class Str1
{
    public static void main(String[] args) {
        
        // to take user input in java we use some functions 
        // 8 data type and one String class

        Scanner scobj=new Scanner(System.in); //pre-defined 

        System.out.println("enter the name ");
        // String name1=scobj.next();

        char ch=scobj.next().charAt(0);

        // String name1=scobj.nextLine();
        // System.out.println("the name is "+name1);
        System.out.println("the name is "+ch);

    }
}