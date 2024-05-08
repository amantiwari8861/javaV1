import java.util.Scanner;

public class ThreeD {
    public static void main(String[] args) {
        // covid cases -> 2 country -> 3 state -> 2 city
        Scanner sc = new Scanner(System.in);
        String country[] = { "India", "America" };
        String states[][] = {
                { "UP", "Bihar", "MP" },
                { "North America", "South America", "East America" },
        };
        String cityName[][][] = {
                {
                    { "Noida", "GZB" },
                    { "Mithila", "Patna" },
                    { "Rewa", "Maihar" }
                },
                {
                    { "new york", "W. DC" },
                    { "san deigo", "san fransisco" },
                    { "texas", "california" }
                }
        };
        int covidCases[][][] = new int[2][3][2];
        System.out.println("Enter covid cases");
        for (int i = 0; i < 2; i++) 
        {
            System.out.println(country[i]+":");
            for (int j = 0; j < 3; j++) 
            {
                System.out.println("\t"+states[i][j]+":");
                for (int k = 0; k < 2; k++) 
                {
                    System.out.print("\t\t"+cityName[i][j][k]+": ");
                    covidCases[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("All Cities are :");
        for (int i = 0; i < 2; i++) {
            System.out.println("Country " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.println("\tState " + (j + 1));
                for (int k = 0; k < 2; k++) {
                    System.out.print("\t\tCity " + (k + 1) + " : ");
                    System.out.println(cityName[i][j][k] + "(" + covidCases[i][j][k] + ")");
                }
            }
        }
        sc.close();
    }
}
