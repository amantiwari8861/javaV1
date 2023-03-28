
public class Q2 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 *          Psuedocode (Dry Run)
 * 
 *  Step 1: i=0
 *          0<5 True
 *          (a) j=0
 *                0<=0 True
 *                 print *
 *           (b) j=1
 *                1<=0 False
 *          syso means new line
 * 
 *  Step 2: i=1
 *          1<5 True
 *          (a) j=0
 *              0<=1 True
 *                 print *
 *          (b) j=1
 *               1<=1 T
 *              print *
 *          (c) j=2
 *                2<=1 F
 *         new line
 *      .
 *      .
 *      .
 */