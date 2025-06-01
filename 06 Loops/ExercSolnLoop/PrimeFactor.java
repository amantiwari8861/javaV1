import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();// 13860

        for (int i = 2; i <= num ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                // System.out.println(i);
                while (num%i==0)
                {
                    num = num / i;
                    System.out.println("i="+i+" num="+num);
                }
            }
        }
        sc.close();
    }
}