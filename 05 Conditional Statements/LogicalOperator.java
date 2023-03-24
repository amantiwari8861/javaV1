import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        float marks=sc.nextFloat();

        if (marks>=70 || marks<=80) 
        {
            System.out.println("got admission in ipu ");
        }


    }
}
