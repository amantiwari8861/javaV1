import java.util.Arrays;
import java.util.Scanner;

public class StringArr {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String names[];
        System.out.print("How many student names u want to store :");
        int len=sc.nextInt();

        names=new String[len];

        names[0]="Aman Tiwari";
        System.out.println("Enter the names");
        sc.nextLine();
        for (int i = 1; i < names.length; i++) 
        {
            System.out.print("Enter "+i+"th student name:");
            names[i]=sc.nextLine();
        }
        System.out.println("All names are");
        System.out.println(Arrays.toString(names));
        sc.close();
    }
}
