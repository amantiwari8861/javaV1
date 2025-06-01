public class Q8 {

    public static void main(String[] args) {
        
        int n=10,sum=0;
        for (int i = 1; i <= n*2; i+=2) {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("sum="+sum);
    }
}