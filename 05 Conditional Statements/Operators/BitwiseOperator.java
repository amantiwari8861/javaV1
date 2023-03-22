public class BitwiseOperator {

    public static void main(String[] args) {
        
        // Bitwise Operator eg. &,|,~,<<,>>,^

        int num=19; //convert 19(decimal) into binary(01)

        // System.out.println(Integer.toBinaryString(num));
        // System.out.println(Integer.parseInt("10011", 2));

        int num2=16;

        // int result=num&num2;
        // 1.	Bitwise and( &  ) -> (19 & 16) 
        //             0001 0011
        //             0001 0000
        //             _________
        //             0001 0000  ->  16 ans.
        //             _________

        // System.out.println(result);


        // int result2= num | num2 ;
        // 2.	Bitwise or ( |  ) -> (19 | 16) 
        //             0001 0011
        //             0001 0000
        //             _________
        //             0001 0011  ->  19 ans.
        //             _________

        // System.out.println(result2);

        // int result3=~num;

        // System.out.println(result3);

        //left shift (<<)

        // System.out.println(3<<1);
        // System.out.println(3<<2);
        // System.out.println(3<<3);
        // System.out.println(3<<4);


        //right shift
        System.out.println(128>>1);
        System.out.println(128>>2);
        System.out.println(128>>3);
        System.out.println(128>>4);

    }
}