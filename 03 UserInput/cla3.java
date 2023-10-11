class cla3
{
    public static void main(String[] data) {

    System.out.println(data[0]);
    System.out.println(data[0].getClass());

    byte b=Byte.parseByte(data[0]);
    short s=Short.parseShort(data[1]);
    int a=Integer.parseInt(data[2]);
    long l=Long.parseLong(data[3]);
    float f=Float.parseFloat(data[4]);
    double d=Double.parseDouble(data[5]);
    boolean bool=Boolean.parseBoolean(data[6]);
    char ch=data[7].charAt(0);
    System.out.println(ch);
    // boolean ch2=Character.isUpperCase('B');

    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);

    }
}