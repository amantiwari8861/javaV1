public class WrapperClass {
 
    public static void main(String[] args) 
    {
        // A Wrapper class is a class which contains the primitive data types (int, char, short, byte, etc).
        // In other words, wrapper classes provide a way to use primitive data types (int, char, short, byte, etc)
        // as objects. These wrapper classes come under java.


        // int i=10;//here i is not an object it is primitive data type
        // System.out.println(i);

        // Integer i2=new Integer(10);
        // System.out.println(i2);
        // System.out.println(i2.getClass());

        // Integer i3=55; //auto boxing
        // System.out.println(i3);

        // int i4=i3; //unboxing
        // System.out.println(i4);

        Character c='A';
        Float f=56.8f;
        Double d=78.78787;
        Byte b=89;
        Short s=899;
        Long p=8748394L;
        Boolean b2=true;

        String num1="10.5",num2="20";

        // System.out.println(num1+num2);
        float result=Integer.parseInt(num2)+Float.parseFloat(num1);
        System.out.println(result);
        //In collection framework only wrapper classes is acceptable

    }
}
