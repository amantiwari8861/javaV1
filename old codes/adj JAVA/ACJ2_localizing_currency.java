//what is localizing currency?
// localizing currency is internationalize date, time, and numbers 
// localizing currency or internationalize currency is numberformat 
//     and 
// numberFormat class provides methods to format the Currency.




// import java.text.spi.NumberFormatProvider;
import java.util.*;
// import java.util.NumberFormat;
// import javax.swing.text.NumberFormatter;

public class ACJ2_localizing_currency
{
    static void pc(Locale l1)
    {
        double d1=12345.54321;
        java.text.NumberFormat formatter = java.text.NumberFormat.getCurrencyInstance(l1);
        String currency = formatter.format(d1);
        System.out.println(currency+ " for locale value"+l1);    
    }
    
    public static void main(String[] args)
    {
		Locale l1=new Locale();
        pc(l1.UK);
        pc(l1.Us);
        pc(l1.INDIA);
        
    }
}






// import java.text.*; 
// import java.util.*; 
// public class ACJ2_localizing_currency { 
	// public static void main(String args[]){ 
		// NumberFormat nft = NumberFormat.getCurrencyInstance(new Locale("de","DE")); 
		// String formatted = nft.format(1000000); 
		// System.out.println(formatted); 
	// } 
// } 