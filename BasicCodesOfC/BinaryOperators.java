import java.util.Scanner;

public class BinaryOperators {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //Binary : in which 2 operand are required

        // 1.Arithmetic Operators eg. +,-,*,/,%

        // int num,d,result;
        // System.out.println("enter 2 values");

        // num=sc.nextInt();
        // d=sc.nextInt();
        // result=num%d;

        // System.out.println("the remainder  is "+result);

        /* 2.Relational Operator eg. <,>,>=,<=,==(checks equality),!=(not equal to)

        System.out.println(15<6);
        System.out.println(15<=15);
        System.out.println(19==19);
        System.out.println(19!=19); */

        //3.Logical operator eg. &&,||,!


        // System.out.println(15<12 && 12>5);

        // System.out.println(14>2 && 2<5);//  true && true => true

        // System.out.println(13>6 || 56>80);// true || false => true

        // System.out.println(!(56>8));// !(true) => false

        //4.Bitwise operators eg. &,|,<<,>>,~

        //    19 -> 10011
        //    23 -> 10111
        // 19&23 -> 10011 => 19 Ans.

        // System.out.println(Integer.toBinaryString(19));
        // System.out.println(Integer.toBinaryString(23));

        // System.out.println(19&23);

        //    19 -> 10011
        //    23 -> 10111
        // 19 | 23 -> 10111 => 23 Ans.

        // System.out.println(19|23);


        // System.out.println(6 << 1);//6*2
        // System.out.println(6 << 2);//6*2*2
        // System.out.println(6 << 3);//6*2*2*2


        // System.out.println(128>>1);//128* 1/2 
        // System.out.println(128>>2);//128* 1/2 *1/2
        // System.out.println(128>>3);//128* 1/2 *1/2 *1/2

        // System.out.println(~13);

        //Ternary operator :
        // synatax:    (condition) ?  if true : if false 

        int result=  (23>2) ? 23 : 2 ;
        System.out.println(result);


        int result2=  (23<2) ? 23 : 2 ;
        System.out.println(result2);
    }
}