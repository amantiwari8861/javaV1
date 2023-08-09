public class NestedFor {

    public static void main(String[] args)
    {
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j <6; j++) 
            {
                System.out.print("\ti= "+i+" j= "+j);
            }
            System.out.println();
        }

    }
}