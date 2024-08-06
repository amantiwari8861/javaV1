public class NestedLoop {

    public static void main(String[] args) throws Exception 
    {
        // for (int i = 1; i <= 5; i++) // read 5 chapters (Task)
        // {
        //     System.out.println("Chapter "+i);
        //     for (int j = 1; j <= 4; j++) 
        //     {
        //         // Thread.sleep(3000);
        //         System.out.print("\tSection "+j+"   ");
        //     }
        //     System.out.println();
        // }

        /* 
            ******
            ******
            ******
        */

        // for (int i = 0; i < 3; i++) 
        // {
        //     for (int j = 0; j < 6; j++) 
        //     {
        //         System.out.print("*");
        //     }
        //     Thread.sleep(2000);
        //     System.out.println();
        // }

        // for (int i = 0; i < 6; i++) 
        // {
        //     for (int j = 0; j <= i; j++) 
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        /*

        #####* 
        ####** 
        ###*** 
        ##**** 
        #***** 

        */
        for (int i = 0; i < 5; i++) 
        {
            for (int space = 6-1; space > i; space--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
/* 
         1
        121
       12321
      1234321
     123454321 
*/

    // for (int row = 1; row <= 5; row++) 
    // {
    //     for (int space = 5; space >row; space--)
    //     {
    //         System.out.print(" ");
    //     }
    //     for (int i = 1; i <= row; i++) 
    //     {
    //         System.out.print(i);
    //     }
    //     for (int j = row-1; j >0; j--) 
    //     {
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }    



    }
}