import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        
        // 4+8 here + is an operator and 4,8 is operand
        // unary operator (only single operand is required ) eg. ++,--
        // binary operator (2 operand is required )
        //    1.arithmatic operator eg. +,-,*,/,%
        //    2.relational operator eg. <,>,<=,>=,==,!=
        //    3.logical operator eg. &&,||,!
        //    4.assignment operator eg. =,+=,-=,*=,/=,%= etc. 
        //    5.bitwise operator eg. &,|,~,<<,>>,^
        // ternary operator (3 operand is required )
        // misc operator eg. instanceof

        // 1.unary eg. ++,--

        Scanner sc=new Scanner(System.in);
        // int num=10;
        // num=num+1;
        // num--;
        // num--;
        // num--;
        // System.out.println("num="+num);

        // int result=num++;
        // System.out.println("result="+result);
        // System.out.println("num="+num);

        // 2.binary
        //  a.arithmatic 
        // int num=100,num2=20,result;

        // result=num+num2;
        // System.out.println(result);
        // result=num-num2;
        // System.out.println(result);
        // result=num*num2;
        // System.out.println(result);
        // result=num/num2;
        // System.out.println(result);
        // System.out.println(27%4);
        // System.out.println(7%10);
        // System.out.println(1%10);

        //  b. relational operator eg. <,>,<=,>=,==,!=

        // System.out.println("10<20 :"+(10<20));
        // System.out.println("10>20 :"+(10>20));
        // System.out.println("10<=20 :"+(10<=20));
        // System.out.println("10<=10 :"+(10<=10));
        // System.out.println("10>=20 :"+(10>=20));
        // System.out.println("10>=10 :"+(10>=10));
        // System.out.println("10==20 :"+(10==20));
        // System.out.println("10==10 :"+(10==10));
        // System.out.println("10!=10 :"+(10!=10));
        // System.out.println("20!=10 :"+(20!=10));

        // // && 
        // System.out.println(100>20 && 20<30 ); // true && true = true
        // System.out.println(100>20 && 200<30); // true && false = false
        // System.out.println(10>20  && 20<30 ); // false && true = false
        // System.out.println(10>20  && 200<30); // false && false = false


        // // // ||
        // System.out.println(100>20 || 20<30 ); // true  || true = true
        // System.out.println(100>20 || 200<30); // true  || false = true
        // System.out.println(10>20  || 20<30 ); // false || true = true
        // System.out.println(10>20  || 200<30); // false || false = false

        // System.out.println(!(10>20));
        // System.out.println(!(100>20));

        // System.out.println(10==10 && 10<20 && 30>20 && 56<90);

        // int num3=28;
        // System.out.println(num3%2==0 || num3%4==0 || num3%14==0);

        // d.assignment operator
        // int num=10;
        // num=num+50;
        // //or
        // num+=50;
        // num-=50;
        // num*=50;
        // num/=50;
        // num%=50;
        // System.out.println("num="+num);

        // e.Bitwise 

        // 97    -> 01100001
        // 53    -> 00110101
        // 97&53 -> 00100001 -> ?
        // System.out.println(97&53);

        // 97    -> 01100001
        // 53    -> 00110101
        // 97|53 -> 01110101 -> 64+32+16+4+1 => 117
        // System.out.println(97|53);

        // exclusive or (^) XOR
        // 97    -> 01100001
        // 53    -> 00110101
        // 97^53 -> 01010100 -> 64+16+4
        // System.out.println(97^53);

        // System.out.println(~10);
        // System.out.println(~-10);

        // Left Shift (<<)
        System.out.println(Integer.toBinaryString(13)); // 1101
        //    00001101 << 1 -> 00011010 -> 16+8+2 -> 26
        System.out.println(13<<1); // 13 * 2
        System.out.println(13<<2); // 13 * 2 * 2
        System.out.println(13<<3); // 13 * 2 * 2 * 2
        System.out.println(13<<4); // 13 * 2 * 2 * 2 *2

        System.out.println(128>>1);
        System.out.println(128>>2);
        System.out.println(128>>3);
        System.out.println(128>>4);


        // Ternary or conditional operator
        // syntax : condition ? if true : if false

        // int num1=10,num2=29,result;
        // result=num1>num2 ? num1 : num2;
        // System.out.println("result = "+result);

        // System.out.println("Aman" instanceof String);

        sc.close();
    }
}