import static java.lang.Math.*;

public class BuiltInFunctions {

    double powerFxn(double num,double rp)//2 7
    {
        double result=1;
        for (int i = 1; i <= rp; i++) 
        {
            result=result*num;
        }
        return result;
    }

    public static void main(String[] args) {

        BuiltInFunctions b=new BuiltInFunctions();
        double result=b.powerFxn(2,7);
        System.out.println("The result is "+result);
        System.out.println(b.powerFxn(7, 3));
        System.out.println(b.powerFxn(2, 3));
        System.out.println(b.powerFxn(4, 2));
        System.out.println(b.powerFxn(9, 2));
        System.out.println(b.powerFxn(3, 3));

        // System.out.println(Math.PI);
        // System.out.println(Math.E);/*Euler's Number 'e' is a numerical constant used in mathematical calculations. The value of e is 2.718281828459045…so on. Just like pi(π), e is also an irrational number. It is described basically under logarithm concepts. */
        
        // System.out.println(Math.pow(2.5, 3));
        // System.out.println(Math.sqrt(2));//1.414
        // System.out.println(Math.sqrt(3));//1.73
        // System.out.println(Math.sqrt(625));//25

        // System.out.println(sqrt(625));

        // System.out.println(Math.abs(-10));
        // System.out.println(Math.floor(3.999));
        // System.out.println(Math.ceil(1.0000001));
        // System.out.println(Math.log(2));
        // double degree=270;
        // double inRadian=(degree*PI)/180.0;
        // System.out.println(Math.sin(degree));
        // System.out.println(Math.sin(inRadian));

        // System.out.println(Math.sin(0*PI/180));
        // System.out.println(Math.sin(Math.toRadians(0)));
        // System.out.println(Math.sin(30*PI/180));
        // System.out.println(Math.sin(45*PI/180));
        // System.out.println(Math.sin(60*PI/180));
        // System.out.println(Math.sin(90*PI/180));
        // System.out.println(Math.sin(180*PI/180)); //error in value
        // System.out.println(Math.sin(Math.toRadians(180)));// output: 1.2246467991473532E-16 error in value
        /*
         * The result 1.2246467991473532E-16 is a very small number, close to zero. It's essentially a floating-point rounding error due to the limitations of how computers represent real numbers in binary.
         * The value 1.2246467991473532E-16 is equivalent to 0.00000000000000012246467991473532, which is very close to zero in practical terms. However, due to the nature of floating-point arithmetic, you might encounter such small discrepancies when dealing with trigonometric functions or other mathematical operations.
         * It's a common phenomenon in programming languages that use floating-point representation. If you need the result to be exactly zero for your application, you may consider rounding the result to a certain precision or using other techniques to handle the tiny numerical differences that arise in floating-point arithmetic.
         */
        // System.out.println(Math.round(Math.sin(Math.toRadians(180)) * 100.0) / 100.0);
        // System.out.println(Math.sin(270*PI/180));
        // System.out.println(Math.sin(360));// error in value
        // System.out.println(Math.round(Math.sin(Math.toRadians(180)) * 100.0) / 100.0);
        // System.out.println(Math.round(1.000001));
        // System.out.println(Math.round(1.5));
        // System.out.println(Math.round(3.99999));

        // for (int i = 0; i < 100; i++) 
        // {
        //     // System.out.print(Math.floor(10*Math.random()+1)+" ,");
        //     System.out.print(Math.floor(Math.random() * (30 - 20 + 1) + 20)+" ,");
        // }
        // System.out.println(Math.hypot(3,4));
    }
}