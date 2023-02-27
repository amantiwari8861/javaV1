import java.util.Scanner;
class StrBuff1
{
    public static void main(String[] args) {
        // String name;
        Scanner sc=new Scanner(System.in);
        // System.out.print("enter your name :");
        // name=sc.next();
        // System.out.println("the name is "+name);
        StringBuffer name2=new StringBuffer();
        // name2=sc.next(); //error
        name2.append("Hello ");        
        name2.append(sc.nextLine());
        System.out.println("the name2 value is "+name2);
        // name2.append(sc.nextLine()); skips the input
        // name2.append(" ");
        // name2.append(sc.next());
        // System.out.println("the name2 modified value is "+name2);
    }
}