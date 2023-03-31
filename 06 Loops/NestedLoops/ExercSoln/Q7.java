public class Q7 {

    public static void main(String[] args) throws InterruptedException{
        
        // for(int i=1;i<=10;i++)
        // {
        //     // System.out.printf(" 1 X %-3d =%-3d \n",i,i*1);
        //     // System.out.printf(" 1 X %-3d =%-3d \n",10,i*10);
        //     // System.out.printf(" 1 X %-3d =%-3d \n",100,i*100);

        //     System.out.printf(" 1 X %-2d =%-2d ",i,i*1);
        //     System.out.printf(" 2 X %-2d =%-2d ",i,i*2);
        //     System.out.printf(" 3 X %-2d =%-2d ",i,i*3);
        //     System.out.printf(" 4 X %-2d =%-2d ",i,i*4);
        //     System.out.printf(" 5 X %-2d =%-2d ",i,i*5);
        //     System.out.printf(" 6 X %-2d =%-2d ",i,i*6);
        //     System.out.printf(" 7 X %-2d =%-2d ",i,i*7);
        //     System.out.printf(" 8 X %-2d =%-2d ",i,i*8);
        //     System.out.printf(" 9 X %-2d =%-2d ",i,i*9);
        //     // System.out.printf(" 10 X %-2d =%-2d ",i,i*10);
        //     // System.out.printf(" 11 X %-2d =%-2d ",i,i*11);
        //     System.out.println();
        //     // Thread.sleep(60*1000);
        // }

        //or

        for (int i = 1; i <= 10; i++) 
        {
            for (int j = 1; j <= 9; j++) 
            {
                System.out.printf(" %d X %-2d =%-2d ",j,i,i*1);
            }
            System.out.println();
        }


    }
}