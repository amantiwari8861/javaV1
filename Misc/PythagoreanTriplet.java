public class PythagoreanTriplet {
    public static void main(String[] args) {

        double a, b, c, lhs, rhs, sum = 1000;

        for (a = 1; a <= sum; a++) {
            for (b = 1; b <= sum; b++) {
                // for(c=1;c<=1000;c++)
                // {
                // lhs=a*a + b*b;
                // rhs=c*c;
                // if(lhs==rhs)
                // {
                // // System.out.println("Pythagorean Triplet ");
                // // System.out.println(a+" "+b+" "+c);
                // if((a+b+c) == 1000)
                // {
                // System.out.println(a+" "+b+" "+c);
                // break;
                // }
                // }
                // else
                // {
                // System.out.println("else "+a+" "+b+" "+c);
                // }
                // }
                c = sum - a - b;
                if (a * a + b * b == c * c)
                    System.out.printf("a=%.0f, b=%.0f, c=%.0f\n", a, b, c);
            }
        }
    }

}