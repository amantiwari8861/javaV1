import java.util.Scanner;

public class InstanceOf {
    public static void main(String[] args) {
        
        boolean result;
        result= "Aman" instanceof String;
        System.out.println(result);

        Scanner sc=new Scanner(System.in);
        boolean res=sc instanceof Scanner;
        System.out.println(res);
    }
}
