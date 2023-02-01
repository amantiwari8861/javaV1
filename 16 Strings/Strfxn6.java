public class Strfxn2 {
public static void main(String[] args) {
String str1=new String("Dell"); //in heap
String str2="Dell"; //in SCP
//how to compare these 2 strings 
System.out.println(str1==str2); // false
System.out.println(str1.equals(str2)); //  true
System.out.println(str2.equals(str1)); //true
String str4=str1;//behaves object(in heap)
String str5=str1.intern(); //behaves like STRING LITERAL (SCP)
System.out.println(str4);
System.out.println(str4==str2);//false
System.out.println(str5==str2);//true
}
}