import java.util.Scanner;

public class MatrMulti {

    public static void main(String[] args) {
        
        int matr1[][],matr2[][],resultantMatr[][],r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and column of 1st matrix");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter row and column of 2nd matrix");
        r2=sc.nextInt();
        c2=sc.nextInt();

        if(c1==r2)
        {
            System.out.println("Multiplication possible");
            matr1=new int[r1][c1];
            matr2=new int[r2][c2];
            resultantMatr=new int[r1][c2];

            //input
            System.out.println("Enter 1st matrix");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c1; j++) 
                {
                    matr1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter 2nd matrix");
            for (int i = 0; i < r2; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    matr2[i][j]=sc.nextInt();
                }
            }
            //logic
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    resultantMatr[i][j]=0;
                    for (int k = 0; k < c1; k++) 
                    {
                        resultantMatr[i][j]=resultantMatr[i][j]+matr1[i][k]*matr2[k][j];
                    }
                }
            }
            //print resultant
            System.out.println("The resultant matrix is ");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    System.out.print("\t"+resultantMatr[i][j]);
                }
                System.out.println();
            }

        }
        else
        {
            System.out.println("Multi. not possible");
        }

        sc.close();
    }
}