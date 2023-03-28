public class Q1 {

    public static void main(String[] args) throws InterruptedException
    {
        
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                // Thread.currentThread().sleep(500);
                System.out.print("*");
            }
            System.out.println();
        }
    }
}