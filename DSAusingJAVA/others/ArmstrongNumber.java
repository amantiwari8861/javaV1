package armstrongnumber;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
      int num, temp, rem, arm = 0;
			System.out.println("Enter a number");
			num = Integer.parseInt(new Scanner(System.in).nextLine());
		   temp = num;
			while (num > 0)
			{
				rem = num % 10;
				arm = arm + (rem * rem * rem);
				num = num / 10;
			}

			if (temp == arm)
			{
				System.out.println("It is an Armstrong number");
			}
			else
			{
				System.out.println("It is not an Armstrong number");
			}
			new Scanner(System.in).nextLine();
    }
    
}
