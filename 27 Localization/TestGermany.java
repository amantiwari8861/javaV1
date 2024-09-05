import java.util.Locale;
import java.util.ResourceBundle;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

public class TestGermany {

    public static void main(String args[]) {
        // DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("de",
        // "DE"));
        // DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.of("de",
        // "DE"));
        // String date = df.format(new Date());
        // System.out.println(date);

        // DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG,Locale.of("de",
        // "DE"));
        // String time = df.format(new Date());
        // System.out.println(time);
        // NumberFormat nft = NumberFormat.getCurrencyInstance(
        // Locale.of("de","DE"));
        // String formatted = nft.format(1000000);
        // System.out.println(formatted);
        // System.out.println("नमस्कार अमन सर");// this console is not able to print
        // anything

        Locale l1 = Locale.of("de", "DE");
        ResourceBundle rb1 = ResourceBundle.getBundle("MessageBundle", l1);
        System.out.println(rb1.getString("message"));
        Locale l2 = Locale.of("zn", "ZN");
        ResourceBundle rb2 = ResourceBundle.getBundle("MessageBundle", l2);
        System.out.println(rb2.getString("message"));

    }
}