import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter materials used :");
        while (sc.hasNextLine()) 
        {
            String data = sc.nextLine();
            if (data.isEmpty()) 
            {
                break; // Exit the loop if an empty line is entered
            }
            System.out.println(" Material is :"+data);
        }

        System.out.println("byeee");
        int num1,num2,result;
        System.out.println("enter 2 numbers :");
        num1=sc.nextInt();
        num2=sc.nextInt();
        result=num1+num2;
        System.out.println("The result is "+result);

        sc.close();
    }
}

            // int i=1;
            // while (sc.hasNext()) 
            // {
            //     System.out.println( (i++) +" "+sc.nextLine());
            // }