import java.util.*;
class Array1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int total;
        String shirts[];
        System.out.println("enter the no of Shirts :");
        total=sc.nextInt();//5

        shirts=new String[total];// array size will be 5

        sc.nextLine();//if he skips the input then use it
        
        System.out.println("Enter shirts name:");
        for(int i=0;i<total;i++)
        {
            System.out.print("enter "+(i+1)+" shirt data :");
            shirts[i]=sc.nextLine();
        }
        System.out.println("Total SHIRTS are :");
        for (int i = 0; i < shirts.length; i++) 
        {
            System.out.println((i+1)+"."+shirts[i]);
        }
    }
}