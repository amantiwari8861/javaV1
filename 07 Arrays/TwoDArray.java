import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        
        String country[]={"India","America","Australia"};
        String states[][]={
                            {"Delhi","UP","Maharastra","Bihar"},
                            {"New York","san deigo","texas","san fransisco"},
                            {"victoria","south australia","tasmania","new south wales"}
                        };
        // int covidCases[][]={
        //                         {10,34,67,4},
        //                         {223,67,57,67},
        //                         {23,567,517,7}
        //                     };

        int covidCases[][]=new int[3][4];//3 country and 4 state =>3*4 =12

        Scanner sc=new Scanner(System.in); 

        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Enter the data of "+country[i]);
            for (int j = 0; j < 4; j++) 
            {
                System.out.print("\t"+states[i][j]+" :");
                covidCases[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("The data are ");
        for (int i = 0; i < covidCases.length; i++)  //3
        {
            System.out.println(country[i]+":");
            for (int j = 0; j < covidCases[i].length; j++) //4
            {
                System.out.println("\t"+states[i][j]+":"+covidCases[i][j]);
            }
        }
        // for (int i = 0; i < covidCases.length; i++) 
        // {
        //     for (int j = 0; j < covidCases[i].length; j++) 
        //     {
        //         System.out.print(covidCases[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}