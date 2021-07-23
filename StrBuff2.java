import java.util.Scanner;
class StrBuff2
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        StringBuffer name2=new StringBuffer();
        System.out.println("the length is :"+name2.length()+"and capacity is :"+name2.capacity());
        System.out.print("enter your name :");
        name2.append(obj.nextLine());
        System.out.println("the name2 modified value is "+name2);
        System.out.println("the length is :"+name2.length()+"and capacity is :"+name2.capacity());
        
    }
}