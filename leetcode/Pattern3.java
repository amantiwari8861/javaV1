public class Pattern3 {

    public static void main(String[] args)
    {
        for (int i = 1; i <=5 ; i++) 
        {
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <5 ; i++) 
        {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >=i; k--) {
                System.out.print(" "+(5-k));
            }
            System.out.println();
        }
    }
}