import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class WorldClock {
    public static void main(String[] args) {
        // System.out.println(ZonedDateTime.now());
        // System.out.println(ZonedDateTime.now(ZoneId.of("-08:00")));
        ZonedDateTime currentDate = ZonedDateTime.now(ZoneOffset.UTC );
        System.out.println(currentDate);
        // System.out.println(currentDate.plusSeconds(Calcutta));
        ZonedDateTime obj=ZonedDateTime.now(ZoneId.of("-00:00"));
        System.out.println(obj.getHour()+":"+obj.getMinute()+":"+obj.getSecond()+" "+obj.getDayOfMonth()+"/"+obj.getMonthValue()+"/"+obj.getYear());
    }
}

// EST - -05:00
// HST - -10:00
// MST - -07:00
// ACT - Australia/Darwin
// AET - Australia/Sydney
// AGT - America/Argentina/Buenos_Aires
// ART - Africa/Cairo
// AST - America/Anchorage
// BET - America/Sao_Paulo
// BST - Asia/Dhaka
// CAT - Africa/Harare
// CNT - America/St_Johns
// CST - America/Chicago
// CTT - Asia/Shanghai
// EAT - Africa/Addis_Ababa
// ECT - Europe/Paris
// IET - America/Indiana/Indianapolis
// IST - Asia/Kolkata
// JST - Asia/Tokyo
// MIT - Pacific/Apia
// NET - Asia/Yerevan
// NST - Pacific/Auckland
// PLT - Asia/Karachi
// PNT - America/Phoenix
// PRT - America/Puerto_Rico
// PST - America/Los_Angeles
// SST - Pacific/Guadalcanal
// VST - Asia/Ho_Chi_Minh