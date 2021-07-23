public class cla2 {
    public static void main(String data[]) {
       /* String var1=data[0];
        String var2=data[1];
        String var3=data[2];
        System.out.println("the value of var1 is "+var1);
        System.out.println("the value of var2 is "+var2);
        System.out.println("the value of var3 is "+var3);*/
        int num=Integer.parseInt(data[0]);
        float num2=Float.parseFloat(data[1]);
        double num3=Double.parseDouble(data[2]);
        char ch=data[3].charAt(0);
        byte b=Byte.parseByte(data[4]);
        short s=Short.parseShort(data[5]);
        boolean bool=Boolean.parseBoolean(data[6]);
        long l=Long.parseLong(data[7]);
    }
}