import java.util.Scanner;

public class matr {
public static void main(String[] args) {
    int arr[][]=new int[4][3];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the matrix ");
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<3;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<3;j++)
        {
           System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
    }

}
    
}