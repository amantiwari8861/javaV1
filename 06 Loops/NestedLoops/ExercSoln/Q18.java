public class Q18 
{
    public static void main(String[] args) 
    {
        /*  
            4 4 4 4 4 4 4
            4 3 3 3 3 3 4
            4 3 2 2 2 3 4
            4 3 2 1 2 3 4
            4 3 2 2 2 3 4
            4 3 3 3 3 3 4
            4 4 4 4 4 4 4 
        */
        int val;
        for (int i = 1; i <= 7; i++) 
        {
            val=4;
            for (int j = 1; j <= 7; j++) 
            {
                if (i==1 || i==7) 
                {
                    System.out.print(val+" ");
                }
                else
                {
                    if (j==1 || j==7) 
                    {
                        System.out.print(val+" ");
                    }
                    else
                    {
                        System.out.print("@ ");
                    }
                }
            }
            val--;
            System.out.println();
        }     
    }   
}