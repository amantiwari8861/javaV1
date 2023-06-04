import java.util.Scanner;

public class JaggedArray 
{
    public static void main(String[] args) 
    {        
        String countries[]={"india","America"};
        String state[][]={
                {"Delhi","Uttarakhand","Karnataka","kerala"},
                {"San francisco","new york","san diego","texas","california"}
        };
        int covidCases[][];
        Scanner sc=new Scanner(System.in);
        
        covidCases=new int[countries.length][];
        for (int i = 0; i < covidCases.length; i++) 
        {
            System.out.println(countries[i]+" : ");
            covidCases[i]=new int[state[i].length];
            for (int j = 0; j < covidCases[i].length; j++) 
            {
                System.out.print("\tEnter covid cases in "+state[i][j]+":");
                covidCases[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n===========All data ======================");
        for (int i = 0; i < covidCases.length; i++) 
        {
            System.out.println("Covid cases in "+countries[i]);
            for(int j=0;j<covidCases[i].length;j++)
            {
                System.out.println("\t"+state[i][j]+":"+covidCases[i][j]);
            }
        }
    }
}
