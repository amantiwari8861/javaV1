import java.util.Scanner;

public class Stringintro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        System.out.println( A.compareTo(B) >0 ? "Yes" : "No" );
        
        char arr1[]=A.toCharArray();
        arr1[0] -= 32;
        char arr2[]=B.toCharArray();
        arr2[0] -= 32;

        System.out.println(String.valueOf(arr1)+" "+String.valueOf(arr2));
        sc.close();
    }
}



