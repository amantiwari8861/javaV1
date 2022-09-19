public class WrapperAdd {
    public static void main(String[] args) {
        
        Integer n=10,n2=30,result;

        result=n+n2;
        System.out.println("the result is "+result);

        int num=67;
        Integer i=Integer.valueOf(num);//boxing
        System.out.println("num = "+num);

        Integer i2=num;//auto-boxing

        System.out.println(" i2= "+i2);
    }
}