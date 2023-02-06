public class DataType {
    public static void main(String[] args) {
        
        byte b = 127;// -128 ~ 127 (8bit -> 1byte)
        short s = 32767;// -32768 ~ 32767 (16bit ->2byte)
        int i = 2147483647;// -2147483648 ~ 2147483647 (32bit -> 4byte)
        long l = 9223372036854775807L;// -9223372036854775808 ~ 9223372036854775807 (64bit -> 8byte)
        float f = 3.123456F;// -3.4028235E38 ~ 3.4028235E38 (32bit -> 4byte)
        double d = 5.123456789123456;// -1.7976931348623157E308 ~ 1.7976931348623157E308 (64bit -> 8byte)
        char c = 'a';// 0 ~ 65535 (16bit -> 2byte)
        boolean bool = true;// true or false (1bit)

        //String class
        String sname = "Aman Tiwari";

        System.out.println("byte b : "+b);
        System.out.println("short s : "+s);
        System.out.println("int i : "+i);
        System.out.println("long l : "+l);
        System.out.println("float f : "+f);
        System.out.println("double d : "+d);
        System.out.println("char c : "+c);
        System.out.println("boolean bool : "+bool);

        System.out.println("Student Name  : "+sname);

    }
}