import java.util.Scanner;
class TwoD
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        //int matr[][]={{10,11,12},{21,22,23}};
        int matr1[][]=new int[3][3];
        int matr2[][]=new int[3][3];
        int matr3[][]=new int[3][3];
        System.out.println("Enter the first matrix ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               matr1[i][j]=obj.nextInt();
            }
        }
        System.out.println("enter the 2nd matrix ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               matr2[i][j]=obj.nextInt();
            }
        }
// ------------------------------------------------
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               matr3[i][j]=matr1[i][j]+matr2[i][j];
            }
        }

// ------------------------------------------------
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matr3[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
}