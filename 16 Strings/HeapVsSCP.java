// import java.lang.String;
// import java.lang.*; bydefault imported
// String is a class in java
public class HeapVsSCP {
    public static void main(String[] args) {

        // String s=new String(); //String is a class
        // s="hello";
        // System.out.println("the value is :"+s);

        // String str="hello my name is aman"; //string literals gets memory in string
        // constant pool (SCP)
        // System.out.println("the value is :"+str);

        String str2 = new String("hello3"); // gets memory in heap memory
        String str4 = new String("hello3"); // gets memory in heap memory
        String str3 = "hello3";// gets memory in scp
        String str5 = "hello3";// gets memory in scp
        // System.out.println("the value is :"+str2);
        // System.out.println("the value is :"+str3);

        System.out.println(str2 == str3); // false bcz str2 in heap and str3 is in scp
        System.out.println(str2 == str4); // false bcz unique identity and memory location is different
        System.out.println(str3 == str5); // true
    }

}
