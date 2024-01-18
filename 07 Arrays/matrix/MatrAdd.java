import java.util.Scanner;

public class MatrAdd {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.println("enter dimensions of 1st matrix");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("enter dimensions of 2nd matrix");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if (r1 == r2 && c1 == c2) 
        {

            int matr1[][] = new int[r1][c1];
            int matr2[][] = new int[r2][c2];
            int matr3[][] = new int[r2][c2];

            // input
            System.out.println("Enter data in 1st matrix ");
            for (int i = 0; i < matr1.length; i++) {
                for (int j = 0; j < matr1[0].length; j++) {
                    matr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter data in 2nd matrix ");
            for (int i = 0; i < matr2.length; i++) {
                for (int j = 0; j < matr2[0].length; j++) {
                    matr2[i][j] = sc.nextInt();
                }
            }
            // logic

            for (int row = 0; row < r1; row++) 
            {
                for (int col = 0; col < c1; col++) 
                {
                    matr3[row][col] = matr1[row][col] + matr2[row][col];
                }
            }

            // print
            System.out.println("The Resultant matrix is ");
            for (int i = 0; i < matr3.length; i++) 
            {
                for (int j = 0; j < matr3[0].length; j++) 
                {
                    System.out.print("\t" + matr3[i][j]);
                }
                System.out.println();
            }
        } 
        else 
        {
            System.out.println("dimension is not same");
        }
        sc.close();
    }
}