import java.util.Scanner;
class TwoD
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        //int matr[][]={{10,11,12},{21,22,23}};
        int matr[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               matr[i][j]=obj.nextInt();
            }
        }
// ------------------------------------------------
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matr[i][j]+"\t");
            }
            System.out.println("     ");
        }
        
    }
}