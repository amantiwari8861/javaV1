public class BitwiseOp {

    public static void main(String[] args) {
        
        //97 -> 1100001
        //23 -> 0010111

        System.out.println(Integer.toBinaryString(97));
        System.out.println(Integer.toBinaryString(23));

        //   97 -> 1100001
        //   23 -> 0010111
        //97&23 -> 0000001

        System.out.println(97&23);

        //   97 -> 1100001
        //   23 -> 0010111
        //97|23 -> 1110111
        //  1*2^6 + 1*2^5 + 1*2^4 + 0*2^3 + 1*2^2 + 1*2^1 + 1*2^0
        // 119
        System.out.println(97|23);

        int num3=11;
        System.out.println(~num3);


        // << left shift

        // System.out.println(3<<1);
        // System.out.println(3<<2);
        // System.out.println(3<<3);
        // System.out.println(3<<4);// 3* 2*2*2*2

        System.out.println(48>>4);// 48/2 -> 24/2 => 12/2 => 6/2 => 3
        System.out.println(48>>3);
        System.out.println(48>>2);
        System.out.println(48>>1);
    }
}