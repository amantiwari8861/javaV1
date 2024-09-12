import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class LocaleList {
    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();

        System.out.println("Number of available locales: " + availableLocales.length);
        List<String> all=Arrays.stream(availableLocales).map(l->l.toString()).sorted().collect(Collectors.toList());
        System.out.println(java.util.Arrays.toString(all.toArray()));
        // for (Locale locale : availableLocales) 
        // {
        //     System.out.println(locale.toString());
        // }
    }
}
/*
 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
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

 */