class Precision2
{
    public static void main(String[] args) {
        // float pi=3.1476F;
        // long l=7788l;
        //  byte b=0b10010;
        //  byte b2=67;
        // System.out.println(pi);
        String obj=new String("hello");
        String obj2=new String("hello");
        String str="hello";
        String str2="hello";
        String str3="the sequence of characters is called string ";

        System.out.println(obj==obj2);//have unique identity
        System.out.println(obj==str); //obj in heap and str in scp
        System.out.println(str==str2); //both stored in scp at same place  
        System.out.println(str3);
    }
}