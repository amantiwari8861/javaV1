import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
      
        // ZonedDateTime obj=ZonedDateTime.now(ZoneId.of("-00:00"));

        Set<String> timezones=ZoneId.getAvailableZoneIds();
        timezones.forEach(tz->{
            ZonedDateTime obj=ZonedDateTime.now(ZoneId.of(tz));
            System.out.println(tz+" :"+obj.getHour()+":"+obj.getMinute()+":"+obj.getSecond()+" "+obj.getDayOfMonth()+"/"+obj.getMonthValue()+"/"+obj.getYear());
        });

        ZonedDateTime obj=null;
        for (int i = -14; i < 13; i++) 
        {
            if (i>0) {
                obj=ZonedDateTime.now(ZoneId.of("Etc/GMT+"+i));       
                System.out.println(ZoneId.of("Etc/GMT+"+i) +"     :"+obj.getHour()+":"+obj.getMinute()+":"+obj.getSecond()+" "+obj.getDayOfMonth()+"/"+obj.getMonthValue()+"/"+obj.getYear());
            }else
            {
                obj=ZonedDateTime.now(ZoneId.of("Etc/GMT"+i));
                System.out.println(ZoneId.of("Etc/GMT"+i) +"     :"+obj.getHour()+":"+obj.getMinute()+":"+obj.getSecond()+" "+obj.getDayOfMonth()+"/"+obj.getMonthValue()+"/"+obj.getYear());
            }
        }

    }
}