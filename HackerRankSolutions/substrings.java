import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class substrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        if (S.length() >=1 && S.length()<=100 && start>=0 ) 
        {
           System.out.println(S.substring(start, end)); 
        }
    }
}
