import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String countries[] = { "india", "america", "australia" };
        String states[][] = { { "UP", "MP" },
                { "NYC", "Texas", "San Fransisco", },
                { "sydney" } };

        int scores[][] = new int[countries.length][];
        for (int i = 0; i < countries.length; i++) 
        {
            System.out.println(countries[i] + ":");
            scores[i] = new int[states[i].length];
            for (int j = 0; j < states[i].length; j++) {
                System.out.print("\t" + states[i][j] + " score:");
                scores[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n************ All Scores ***************\n");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(countries[i] + "[");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(states[i][j] + "(" + scores[i][j] + ")");
                if (j < scores[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        sc.close();

    }
}