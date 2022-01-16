import java.time.LocalTime;

public class LocaleTimeDemo {

    public static void main(String[] args) {

        LocalTime startTime = LocalTime.now();
        LocalTime endTime = startTime.plusHours(1); // Adding 1 hour to the start time
        while (true) {
            LocalTime current = LocalTime.now();
            int hour = current.getHour(); // Getting the hours, minutes and seconds components
            int minute = current.getMinute();
            int second = current.getSecond();
            if (hour == endTime.getHour() && minute == endTime.getMinute() && second == endTime.getSecond()) {
                System.out.println("Over");
                break;
            }
        }
    }
}