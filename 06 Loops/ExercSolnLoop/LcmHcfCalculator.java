/**
 * GCD(48, 18)
 * = GCD(18, 48 % 18) → GCD(18, 12)
 * = GCD(12, 18 % 12) → GCD(12, 6)
 * = GCD(6, 12 % 6) → GCD(6, 0)
 * => Answer: 6
 * 
 * lcm = |(48*18)|/6
 *     = 144
 */

public class LcmHcfCalculator {

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int oldA = a;
        int oldB = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("HCF of " + oldA + " and " + oldB + " is: " + a);

        int lcm = (oldA * oldB) / a;
        System.out.println("LCM of " + oldA + " and " + oldB + " is: " + lcm);
    }
}
