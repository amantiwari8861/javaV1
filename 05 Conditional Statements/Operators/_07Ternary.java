public class _07Ternary 
{
    public static void main(String[] args) 
    {
        //Ternary Operator or Conditional operator
        //syntax : (codition)?(runs if true) : (runs if false)

        int num1,num2,max;
        num1=200;num2=400;

        // max= (num1>num2) ? 1 : 0 ;
        max= (num1>num2) ? num1 : num2 ;

        System.out.println(max);
    }
}
