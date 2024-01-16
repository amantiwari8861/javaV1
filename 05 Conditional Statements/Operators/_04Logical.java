public class _04Logical 
{
    public static void main(String[] args) {
        
        //logical operator eg. &&,||,!

        int num1,num2,num3;
        boolean result;

        //And (&&)
        // num1=10;num2=20;num3=5;
        // result=num1<num2 && num2>num3; //both the conditions must be true

        //Or (||)
        // num1=10;num2=20;num3=55;
        // result=num1<num2 || num2>num3; //atleast one of the conditions must be true
        //result= 10<20 || 20>55
        //result= true || false
        //result= true

        //multiple conditions
        // num1=3;
        // resuslt= num1==5 || num1==3 || num1==7 || num1>9 ;
        // num1=5;num2=10;num3=20;
        // result= num2>5 && num2<num3 && num1<num2 ;
        
        
        //not (!)
        num1=20;
        result= !(num1>10);

        System.out.println(result);
    }
}
