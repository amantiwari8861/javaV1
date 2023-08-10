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

public class Q15 
{
    public static void main(String[] args) 
    {

        int space=8-1,star=1,col=8;
        for (int i = 1; i <=12; i++) 
        {
            for (int j = 1; j <= 8; j++) 
            {

                if(j<=space)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            
            if (i%4==0) 
            {
                space=space+1;// 7 -> 5 -> 3
                star=star-1;//3->5
            }
            else
            {
                space=space-1;
                star=star+1;
            }
            System.out.println();
        }
       for (int i = 0; i < 4; i++) 
       {
        for (int j = 0; j < 8; j++) 
        {
            if(j<4)
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
    }
}