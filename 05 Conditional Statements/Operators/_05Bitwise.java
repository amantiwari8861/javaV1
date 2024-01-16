public class _05Bitwise {

    public static void main(String[] args) {
        
        //convert 97 into binary 
        // Bitwise operator eg. &,|,~,^,<<,>>

        //97 -> 1100001
        //23 -> 0010111

        // System.out.println("97 :"+Integer.toBinaryString(97));
        // System.out.println("47 :"+Integer.toBinaryString(47));

        //   97 -> 1100001
        //   47 -> 0101111
        //        ---------
        //97&47 -> 0100001 => 33 Ans.

        // System.out.println("97&47 is :"+(97&47)); 

        //   97 -> 1100001
        //   23 -> 0010111
        //         -------
        //97|23 -> 1110111
        //  1*2^6 + 1*2^5 + 1*2^4 + 0*2^3 + 1*2^2 + 1*2^1 + 1*2^0
        // 119
        // System.out.println("97|23 is :"+(97|23));

        // int num3=11;
        // System.out.println(~num3);
        // System.out.println(~(-10));

        // << left shift

        // System.out.println(Integer.toBinaryString(3));
        // 3 = 11 in 8 bit it will be 00000011
        // shift these bits to left 00110000


        // System.out.println(3<<0); // 3
        // System.out.println(3<<1); // 3*2
        // System.out.println(3<<2); // 3*2*2
        // System.out.println(3<<3); // 3*2*2*2
        // System.out.println(3<<4); // 3*2*2*2*2

        System.out.println(48>>4);// 48/2 -> 24/2 => 12/2 => 6/2 => 3
        System.out.println(48>>3);
        System.out.println(48>>2);
        System.out.println(48>>1);
    }
}