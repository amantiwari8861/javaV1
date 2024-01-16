public class TypeCastingDataType {

    public static void main(String[] args) {

        // int b=67;
        // // byte b2=b;
        // byte b2=(byte)b; //explicit
        // System.out.println(b2);

        // int b4;byte b3;
        // b3=56;
        // b4=b3;
        // System.out.println(b4);

        // long phoneno=9891062743L;
        // int ph;
        // ph=phoneno;
        // // ph=(int)phoneno;//error in value
        // System.out.println(ph);

        // float f=56.9;
        // float f=56.9f;
        // double d=f;
        // System.out.println(d);

        // double d=56.8764543572;
        // // float f=d;
        // float f=(float)d;
        // System.out.println(f);

        int num=65;
        // char ch=num;
        char ch=(char)num;
        System.out.println(ch);

        // int A=65;
        // char ch2=(char)(A+26-1);
        // System.out.println(ch2);

        // char ch3='C';
        // int num4=ch3;

        // System.out.println(num4);

        // System.out.println((char)'e');
        // System.out.println((int)'e');
        // System.out.println((char)(65+13));

        /*
         * Note:
         * A -> 65
         * B -> 66
         * . -> .
         * Z -> 90
         * 
         * a -> 97
         * b -> 98
         * . -> .
         * z -> 122
         * 
         * 0 -> 48
         * 1 -> 49
         * . -> .
         * 9 -> 57
         */
    }
}