public class _02ArithmeticOp 
{
    public static void main(String[] args) 
    {
        // Arithmatic Operator eg. +,-,*,/,% (Mod)
        double num1 = 13.4, num2 = 2.0, result;

        // result=num1+num2;
        // result=num1-num2;
        // result=num1*num2;
        //result=num1/num2;
        result = num1 % num2; // for remainder (shesh)

        System.out.println("Result is " + result);
        System.out.printf("Result is %.2f " , result);
    }
}
