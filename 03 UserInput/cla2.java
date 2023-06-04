public class cla2 {
    public static void main(String data[]) 
    {
       /* String var1=data[0];
        String var2=data[1];
        String var3=data[2];
        System.out.println("the value of var1 is "+var1);
        System.out.println("the value of var2 is "+var2);
        System.out.println("the value of var3 is "+var3);*/
        int num=Integer.parseInt(data[0]);
        float num2=Float.parseFloat(data[1]);
        double num3=Double.parseDouble(data[2]);
        byte b=Byte.parseByte(data[4]);
        short s=Short.parseShort(data[5]);
        boolean bool=Boolean.parseBoolean(data[6]);
        long l=Long.parseLong(data[7]);
        char ch=data[3].charAt(0);
    
        System.out.println("the value of num is "+num);
        System.out.println("the value of num2 is "+num2);
        System.out.println("the value of num3 is "+num3);
        System.out.println("the value of ch is "+ch);
        System.out.println("the value of b is "+b);
        System.out.println("the value of s is "+s);
        System.out.println("the value of bool is "+bool);
        System.out.println("the value of l is "+l);

    }
}