import java.util.Scanner;

import util.FileInputHandler;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int patrolDogs;
        boolean isAcceptable=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Paw Patrol");
        System.out.println("=====================");
        do {
            System.out.print("How many patrol dogs? (0-2) :");
            try 
            {
                patrolDogs=Integer.parseInt(sc.nextLine().trim());
                if (patrolDogs<0 || patrolDogs>2) 
                {
                    System.out.println("Error :patrol dogs must be between 0 to 2");
                    continue;
                }
                isAcceptable=true;
                new FileInputHandler();
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Error :value is not number!!");
            }
            catch(Exception e)
            {
                System.out.println("Error :"+e.getMessage());
            }
        } while (!isAcceptable);
        System.out.println("Running simulation from month 7- 6");
        sc.close();
    }
}
