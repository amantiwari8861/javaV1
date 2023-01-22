import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        // StringBuilder B=new StringBuilder(A);
        // String C=String.valueOf(new StringBuilder(A).reverse());
        // System.out.println(C.equals(A) );
        // System.out.println((C.equals(A) )?"Yes":"No");
        System.out.println(((String.valueOf(new StringBuilder(A).reverse())).equals(A) )?"Yes":"No");
        sc.close();
    }
}
