public class LabelledLoop {

    public static void main(String[] args) {
        
        // for (int i = 0; i < 5; i++) 
        // {
        //     System.out.println("i="+i);
        //     for (int j = 0; j < 3; j++) 
        //     {
        //         if(j==1)
        //         break;
        //         System.out.print("\tj="+j);
        //     }
        //     System.out.println();
        // }

        // Label for the outer loop
        /* outerLoop:
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                // If condition is met, break the outer loop
                if (i * j == 6) {
                    System.out.println("Breaking outer loop when i * j = 6 (i=" + i + ", j=" + j + ")");
                    break outerLoop;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("End of loops."); */
        outerLoop:
        for (int a = 1; a <= 3; a++) 
        {
            System.out.println("a="+a);
            for (int b = 1; b <= 3; b++) 
            {
                System.out.println("   b="+b);
                semi:
                for (int c = 1; c <= 3; c++) 
                {
                    System.out.println("     c="+c);
                    for (int d = 1; d <= 3; d++) 
                    {
                        System.out.print("\td="+d);
                        if(d==2)
                            break semi;
                        if (a * b * c * d == 12) 
                        {
                            System.out.println("Breaking outer loop when a * b * c * d = 12 (a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ")");
                            break outerLoop;
                        }
                        System.out.println("\na = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("End of all loops.");
    }
}
