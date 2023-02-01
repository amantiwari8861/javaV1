// import java.lang.*; by default
public class StringBuff4 {
    public static void main(String[] args) {
    
        // StringBuffer obj="aman";//incompatible types: String cannot be converted to StringBuffer
        // System.out.println(obj);//error
        StringBuffer obj2Buffer=new StringBuffer();
        System.out.println("initial capacity of obj is "+obj2Buffer.capacity());//16 by default
        obj2Buffer.append("amant");
        System.out.println("length : "+obj2Buffer.length()+" capacity after adding 5 character : "+obj2Buffer.capacity());
        //capacity=16+length => 21
        obj2Buffer.append("iwari8861@gm");//5+12=17
        System.out.println("length : "+obj2Buffer.length()+" capacity : "+obj2Buffer.capacity());
        //capacity=17 is less than capacity 21 then it will be 21
        obj2Buffer.append("ail.c");//17+5=22
        System.out.println("length : "+obj2Buffer.length()+" capacity : "+obj2Buffer.capacity());
        //capacity=(old Capacity*2)+2 => 21*2+2=44
        obj2Buffer.append("iwarighjkgfdsjhgfdghjki");//22+23=45
        System.out.println("length : "+obj2Buffer.length()+" capacity : "+obj2Buffer.capacity());
        //capacity=(old Capacity*2)+2 => 44*2+2=90
        obj2Buffer.append("iwarighjkgfdsjhgfdghjkiiwarighjkgfdsjhgfdghjk");//45+45=90
        System.out.println("length : "+obj2Buffer.length()+" capacity : "+obj2Buffer.capacity());
        //capacity=90 is equal to capacity 90
    }
}
