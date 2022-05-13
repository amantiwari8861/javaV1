import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        
        int matr[][]=new int[2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("the size of the matrix is "+matr.length+" rows and "+matr[0].length+" columns");
        System.out.println("enter the elements");
        for (int i = 0; i < matr.length; i++)
        {
            for (int j = 0; j < matr[0].length; j++)
            {
                matr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is");
        for (int i = 0; i < matr.length; i++)
        {
            for (int j = 0; j < matr[0].length; j++)
            {
                System.out.print(matr[i][j]+" ");
            }
            System.out.println();
        } 
        sc.close();
    }
}