import java.time.LocalDateTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime); // Output: 2016-11-21T11:45:35.859
        System.out.println(dateTime.minusDays(3)); // Subtracting 3 days

    }
}