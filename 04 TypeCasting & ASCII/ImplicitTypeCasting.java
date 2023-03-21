public class ImplicitTypeCasting {
    public static void main(String[] args) {
        
        // int num=100;
        // double d;

        // d=num;//implicit typecasting (type-promotion)
        // d=d+5.67;

        // System.out.println(d);

        // ASCII -> American standard code for information interchange
        char ch=65;// implicit typecasting
        System.out.println(ch);

        int n='A';// implicit typecasting
        System.out.println(n);


        System.out.println((char)66); //explicit typecasting
        System.out.println((int)'B'); //explicit typecasting

        /* Note: 
         *      A -> 65
         *      B -> 66
         *      . -> .
         *      Z -> 90
         * 
         *      a -> 97
         *      b -> 98
         *      . ->  .
         *      z -> 122
         * 
         *      0 -> 48
         *      1 -> 49
         *      . -> .
         *      9 -> 56
         */
    }
}