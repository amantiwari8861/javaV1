public class Loops {

    public static void main(String[] args)
    {
        
        //for,while,do-while and for-each

        /* initialization
         * condition
         * increment/decrement
         */

        // for(;;)
        // {
        //     System.out.println("Hello Everyone!");
        // }
        // int i;
        // for(i=1;i<=10;i++)
        // {
        //     System.out.println(i+" Hello everyone!");
        // }

        // for(int i=10;i>0;i--)
        // {
        //     System.out.println(i);
        // }

        // while (true) 
        // {
        //     System.out.println("Hello Everyone!!");
        // }

        // int j=1; //initialization
        // while (j<=10)//condition
        // {
        //     System.out.println(j);//statements
        //     j++;//increment/dec
        // }

        //if no. of steps is known then use for loop and when it's unknown use while loop

        // int k=10;
        // while (k>0) 
        // {
        //     System.out.println(k);
        //     k--;
        // }

        // Case 1:
        // int c=1;
        // do 
        // {
        //     System.out.println(c);
        //     c++;
        // } while (c<10);

        //Case 2:
        // int c=1;
        // do 
        // {
        //     System.out.println(c);
        //     c++;
        // } while (c==10);

        // int arr1[]={10,20,56,383,23,24};

        // for (int i = 0; i < 6; i++) 
        // {
        //     System.out.println(arr1[i]);
        // }

        // for (int i : arr1) 
        // {
        //     System.out.println(i);
        //     if (i==56) 
        //     {
        //         break;
        //     }
        // }

        // for (int i = 0; i < 10; i++) 
        // {
        //     System.out.println("i ="+i);
        //     if (i==5) {
        //         break;
        //     }
        // }
        for (int i = 1; i <= 10; i++) 
        {
            if (i%2==0) 
            {
                continue;
            }
            System.out.println("i ="+i);
        }
    }
}