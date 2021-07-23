import java.util.Scanner;
class TwoD
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("enter the row and column of 1st matrix ");
        r1=obj.nextInt();
        c1=obj.nextInt();

        System.out.println("enter the row and column of 2st matrix ");
        r2=obj.nextInt();
        c2=obj.nextInt();

        if(c1==r2)
        {
            //if order of matrix is right 
            int matr1[][]=new int[r1][c1];
            int matr2[][]=new int[r2][c2];
            int matr3[][]=new int[r1][c2];
            System.out.println("---------------------------------");
            System.out.println("enter the matrix 1 ");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                matr1[i][j]=obj.nextInt();
                }
            }

            System.out.println("---------------------------------");
            System.out.println("enter the matrix 2 ");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                matr2[i][j]=obj.nextInt();
                }
            }

            System.out.println("---------------------------------");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c1;k++)
                    {
                        matr3[i][j]=matr3[i][j]+matr1[i][k]*matr2[k][j];
                    }
                }
            }

            System.out.println("-------------------------------------");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(matr3[i][j]+"\t");
                }
                System.out.println(" ");
            }
        }
        else
        {
            System.out.println("multiplication is not possible ");
        }
    }
}