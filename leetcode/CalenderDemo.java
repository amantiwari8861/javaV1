import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class CalenderDemo {
    public static void main(String args[]) throws Exception {
      
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        // getting current date
        cal.set(2017, 8, 14);
        System.out.println("Today's date: " + sdf.format(cal.getTime()));
      
        Format f = new SimpleDateFormat("EEEE");
        String str = f.format(new Date());
        System.out.println("Day Name: " + str);
    }
}