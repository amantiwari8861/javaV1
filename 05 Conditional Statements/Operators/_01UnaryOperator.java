public class _01UnaryOperator {

    public static void main(String[] args) {
        
        // 5+9 here 5 and 9 is operands and + is an operator 

        //unary operator eg. ++,--
        // int num=10;
        // // num+1;
        // // num=num+1;
        // // num++; //same as num=num+1;
        // num--; //same as num=num-1;

        // System.out.println(num);

        //pre-fix and post-fix

        int num2=10,num3;

        num3=num2++;
        num3=++num2;

        System.out.println("num2 = "+num2);//10 ?
        System.out.println("num3 = "+num3);//11 ?

    }
}