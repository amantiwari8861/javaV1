import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        
        String country[]={"India","America","Australia"};
        int covidCases[][]=new int[3][2];//3 country and 2 state =>3*2 =6
        // int covidCases[][]={
        //     {10,34,67,4},
        //     {223,67,57,67},
        //     {23,567,517,7}
        // };

        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter the data");

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                covidCases[i][j]=sc.nextInt();
            }
        }

        System.out.println("The data are ");
        for (int i = 0; i < covidCases.length; i++)  //3
        {
            for (int j = 0; j < covidCases[i].length; j++) //2
            {
                System.out.print(covidCases[i][j]+"  ");
            }
            System.out.println();
        }
    }
}