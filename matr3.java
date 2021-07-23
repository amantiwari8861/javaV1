import java.util.Scanner;
class TwoD
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        //int matr[][]={{10,11,12},{21,22,23}};
        int matr1[][]=new int[3][3];
        System.out.println("Enter the first matrix ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               matr1[i][j]=obj.nextInt();
            }
        }
// ------------------------------------------------
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matr1[i][j]+"\t");
            }
            System.out.println("");
        }
// ------------------------------------------------
System.out.println("Transpose");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matr1[j][i]+"\t");
            }
            System.out.println("");
        }
        
    }
}