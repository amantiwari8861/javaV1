/*
       *
      * * 
     * * *
    * * * *
     * * * 
    * * * *
   * * * * *
  * * * * * *
   * * * * * 
  * * * * * *
 * * * * * * *
* * * * * * * *
    * * * *
    * * * *
    * * * *
    * * * *
 */

import java.util.Scanner;

public class Q15 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row(multiple of 4)");
        int r=sc.nextInt();
        int c=r;

        int space=r-1;
        for (int row = 1; row <=r; row++) 
        {
            for (int column = 1; column <= c; column++) 
            {

                if(column<=space)
                {
                    System.out.print("@");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
            
            if (row%4==0) 
            {
                space=space+1;
            }
            else
            {
                space=space-1;
            }
        }
        //for square
       for (int row = 0; row < 4; row++) 
       {
        for (int column = 0; column < 8; column++) 
        {
            if(column<4)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("* ");
            }
        }
        System.out.println();
       }
       sc.close();
    }
}