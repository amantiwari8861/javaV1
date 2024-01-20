public class NestedFor {

    public static void main(String[] args) throws Exception
    {
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                // System.out.print("\ti= "+i+" j= "+j);
                System.out.print("*");
                // Thread.sleep(500);
            }
            System.out.println();
        }
    }
}