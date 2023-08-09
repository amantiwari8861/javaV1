public class NestedUse 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 6; i++) 
        {
            System.out.println("\nReading Chapter "+i);
            for(int j=1;j<=5;j++)
            {
                System.out.print("\tSection "+j);
                for(int k=1;k<=2;k++)
                {
                    System.out.print("\n\t\tPara "+k);
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}