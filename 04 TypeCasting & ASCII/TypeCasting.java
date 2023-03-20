public class TypeCasting 
{
    public static void main(String[] args) 
    {
        // byte b1 = 2, b2 = 6, result;

        // result=b1+b2;//error lossy conversion from int to byte
        // result=b1*b2;//error lossy conversion from int to byte
        // result=(byte)b1 + (byte)b2;//error lossy conversion from int to byte
        // result = (byte) (b1 + b2);// here (b1+b2) giving int value then by using (byte) we converted int to byte

        // System.out.println("the result is " + result);

        // try removing f after 10.5 or 78.6 ( lossy conversion from double to float)
        float f1 = 10.5f, f2 = 78.67F, res;
        res = f1 + f2;
        System.out.println(" result :" + res);

    }
}
