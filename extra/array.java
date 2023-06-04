import java.util.Scanner;

public class array 
{
    public static void main(String[] args) 
    {
        // int arr[];
        // arr=new int[5];

        // int arr2[]=new int[5];
        // int arr3[]={10,34,67,8,9};

        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter value in array");
        // for (int i = 0; i < arr2.length; i++) 
        // {
        //     arr2[i]=sc.nextInt();
        // }

        // for (int i = 0; i < arr2.length; i++) 
        // {    
        //     System.out.print(arr2[i]+",");
        // }
        
        // System.out.println("----------");
        // for (int i : arr2) 
        // {
        //     System.out.println(i);
        // }

        String countries[]={"india","australia","America"};
        // int covidCases[][]={
        //                         {10,2,3,34,67},
        //                         {1100,23,4,67,77},
        //                         {223,12,45,6,78}
        // };

        int covidCases[][]=new int[3][5];
            System.out.println("Enter the value in array");
        for (int i = 0; i < covidCases.length; i++) 
        {
            for (int j = 0; j < covidCases[i].length; j++) 
            {
                covidCases[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is ");
        for (int i = 0; i < covidCases.length; i++) 
        {
            for (int j = 0; j < covidCases[i].length; j++) 
            {
                System.out.print(covidCases[i][j]+"\t");
            }
            System.out.println();
        }



    }
}