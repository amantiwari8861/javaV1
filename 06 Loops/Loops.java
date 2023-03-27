import java.util.Arrays;

public class Loops {

    public static void main(String[] args) {
        
        //for while do-while for-each

        // for(;;)
        // {
        //     System.out.println("Hello");
        // }
        /* initialization
         * condition
         * increment/decrement
         */
        // int i;
        // for(i=1;i<=10;i++)
        // {
        //     System.out.println(i+" Hello everyone!");
        // }

        // for(int i=10;i>0;i--)
        // {
        //     System.out.println(i);
        // }

        // int j=1; //initialization
        // while (j<=10)//condition
        // {
        //     System.out.println(j);
        //     j++;//increment/dec
        // }

        // int k=10;
        // while (k>0) {
        //     System.out.println(k);
        //     k--;
        // }

        // Case 1:
        // int c=1;
        // do {
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

        int arr1[]={10,20,56,383,23,24};

        for (int i : arr1) 
        {
            System.out.println(i);
        }

        // System.out.println(Arrays.toString(arr1));




    }
}