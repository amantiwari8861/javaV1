import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        BigInteger a=new BigInteger(sc.next());
        BigInteger b=new BigInteger(sc.next());
        BigInteger sum=a.add(b);
        BigInteger multi=a.multiply(b);

        System.out.println(sum);
        System.out.println(multi);
        sc.close();
    }
}