import java.time.LocalDate;

public class LocalDateDemo {
    public static void generatePaySlip() {
        // Code for generating pay slip
        LocalDate paySlipDate = LocalDate.now();
        System.out.println(paySlipDate); // Output will be: 2016-11-18
    }

    public static void main(String[] args) {
        LocalDateDemo.generatePaySlip();

        LocalDate registrationDate = LocalDate.now();
        LocalDate lastDate = registrationDate.plusDays(3); // Adding 3 days to the registration date
        if (LocalDate.now().isAfter(lastDate)) { // Checking whether current date is after the last date
            System.out.println("Please take the assessment as soon as possible");
        }

    }
}
