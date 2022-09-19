import java.util.Scanner;
class TwoDarray2
{
    public static void main(String[] args) 
    {
        int matr[][]=new int[2][3];
        Scanner sc=new Scanner(System.in);

        // System.out.println("matr.length:"+matr.length);
        // System.out.println("matr[0].length:"+matr[0].length);

        System.out.println("enter the matrix");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                matr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(matr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}