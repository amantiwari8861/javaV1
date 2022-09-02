public class loops {
    public static void main(String[] args) {

        // for (int i = 0; i < 10; i++)
        // {
        // System.out.println(" i ="+i);
        // }
        // for(int i=10;i>0;i--)
        // {
        // System.out.println("i="+i);
        // }
        // for(;;)
        // {
        // System.out.println("Hii Aman Sir");
        // }
        // for (int i = 0; i < 40; i=i+2)
        // {
        // System.out.println("i="+i);
        // }
        // for (int i = 0; i < 100;)
        // {
        // if (i<10)
        // {
        // i=i+2;
        // }
        // else if(i<20)
        // {
        // i=i+5;
        // }
        // else{
        // i=i+8;
        // }
        // System.out.print(i+" ");
        // }
        // while (true)
        // {
        // System.out.println("hello aman sir");
        // }
        // int i=1;
        // while (i<10)
        // {
        // System.out.println("i="+i);
        // i++;
        // }
        // int j=10;
        // while (j>0)
        // {
        // System.out.println("j="+j);
        // j--;
        // }
        // int arr[]={10,20,30,40,50};
        // for (int e : arr)
        // {

        // System.out.println("e ki value "+(e*5+10)+" hai");
        // }
        // for (int i = 1; i <= 10; i++) 
        //{
        //     System.out.println("i=" + i);
        //     if (i == 6) 
        //     {
        //         System.out.println(" the value of i is "+i);
        //         break;
        //     }
        // }
        // for (int i = 1; i <= 10; i++) 
        // {
        //     if (i==2||i==4||i == 6) 
        //     {
        //         continue;
        //     }
        //     System.out.println("i=" + i);
        // }

        // int k=1;
        // do {
        //     System.out.println("k="+k);
        //     k++;
        // } while (k<=10);

        // int k=1;
        // do {
        //     System.out.println("k="+k);
        //     k++;
        // } while (k>=10);//wrong condition

        // int l=0;
        // do {
        //     l++;
        //     if (l%2 == 0) 
        //     {
        //         continue;
        //     }
        //     System.out.println("l="+l);
        // } while (l<=10);

        int m=1;
        do {
            if (m%5 == 0) 
            {
                break;
            }
            System.out.println("m="+m);
        m++;
        } while (m<=10);
    }
}