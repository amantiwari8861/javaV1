import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        if (payment>=0 && payment<=1000000000) {
            
        Locale l=new Locale("en","IN");
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india=NumberFormat.getCurrencyInstance(l);
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
        }
    }
}
