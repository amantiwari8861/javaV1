import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        
        if (s.length()>=1 && s.length()<= 400000)
        {
            String tokens[]=s.split("[ ._'!@,?]+");  
            System.out.println(tokens.length);
            
            for (String string : tokens) 
            {
                System.out.println(string);
            }      
        }
        if (s.length()==0) {
            System.out.println(0);
        }
        scan.close();
    }
}

