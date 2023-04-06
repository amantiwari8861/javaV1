import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        
        //pre-defined
        // int covidCases[][]={
        //     {10,34,67,4,34,56},
        //     {223,67,57,67,88,56,89},
        //     {223,67,57,67}
        // };
        //jagged array (every row's length is changed)
        
        int covidCases[][],country,state;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of Country ");
        country=sc.nextInt();
        covidCases=new int[country][];

        for (int i = 0; i < country; i++) 
        {
            System.out.println("Enter states of "+(i+1)+" Country :");
            state=sc.nextInt();
            covidCases[i]=new int[state];//3
            for (int j = 0; j < state; j++) 
            {
                System.out.print("Enter Cases in "+(j+1)+" state :");
                covidCases[i][j]=sc.nextInt();
            }
            System.out.println();
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
        sc.close();
    }
}