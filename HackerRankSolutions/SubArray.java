import java.util.Scanner;

public class SubArray 
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }
        //logic
        int count=0;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i; j < arr.length; j++) 
            {
                // System.out.print("[");
                int sum=0;
                for (int k = i; k <= j; k++) 
                {
                    // System.out.print(arr[k]+",");
                    sum+=arr[k];
                }
                if (sum<0) 
                {
                    count++;
                }
                // System.out.println("\b]");
            }
        }
        System.out.println(count);
        sc.close();

        
        //psuedo-code

        /*
            step 1: arr[]=[1,2,3],i=0
                0<3 T
                (a) j=0  0<3 T
                    (i) k=0 0<=0 T
                        print 1
                    (ii) k=1 1<=0 false

                (b) j=1 1<3 T
                    (i) k=0 0<=1 T
                        print 1
                    (ii) k=1 1<=1 T
                        print 2
                    (iii) k=2 2<=1 False

                (c) j=2 2<3 T
                    (i) k=0 0<=2 T
                        print 1
                    (ii) k=1 1<=2 T
                        print 2
                    (iii) k=2 2<=2 T
                        print 3
                    (iv) k=3 3<=2 false

                (d) j=3 3<3 False

            Step 2 : i=1 , 1<3 T
                
                (a) j=1 ,1<3 T
                    (i) k=1 1<=1 T
                        print 2 
                    (ii) k=2 2<=1 F

                (b) j=2 2<3 T
                    (i) k=1 1<=2 T
                        print 2
                    (ii) k=2 2<=2 T
                        print 3
                    (iii) k=3 3<=2 F
                
                (c) j=3 3<3 F
                
        step 3: i=2  2<3 T

            (a) j=2 2<3 T
                (i) k=2 2<=2 T
                print 3
                (ii) k=3 3<=2 F

            (b) j=3 3<3 F

        step 4: i=3 3<3 F XXXXXX
         */


    }
}
