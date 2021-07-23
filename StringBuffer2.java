import java.util.Scanner;
class StringBuffer2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // StringBuffer str=new StringBuffer(); //str is a reference variable which we are using as a normal variable
        StringBuffer str=new StringBuffer(25); //str is a reference variable which we are using as a normal variable
        // str=sc.nextLine(); error

        System.out.println("the initial capacity of StringBuffer is :"+str.capacity());
        System.out.println("the initial length of StringBuffer is :"+str.length());

        System.out.println("enter text");
        str.append(sc.nextLine());
        System.out.println("the value is :"+str);

        System.out.println("the initial capacity of StringBuffer is :"+str.capacity());
        System.out.println("the initial length of StringBuffer is :"+str.length());
        //new capacity=old capacity*2 +2 ;
        // new capacity= 16*2 +2 = 34 ;
    }
}