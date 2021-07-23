import java.util.Scanner;
class StrBuff1
{
    public static void main(String[] args) {
        // String name;
        // Scanner obj=new Scanner(System.in);
        // System.out.print("enter your name :");
        // name=obj.next();
        // System.out.println("the name is "+name);
        StringBuffer name2=new StringBuffer();
        // name2=obj.next(); //error
        name2.append(obj.next());
        System.out.println("the name2 value is "+name2);
        // name2.append(obj.nextLine()); skips the input
        name2.append(" ");
        name2.append(obj.next());
        System.out.println("the name2 modified value is "+name2);
    }
}