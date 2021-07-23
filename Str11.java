import java.util.Scanner;
class scanner
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the size of String");  
int n=obj.nextInt();
String[] name=new String[n];
System.out.println("enter the name");
for(int i=0;i<name.length;i++)
{
name[i]=obj.nextLine();
obj.nextLine();
}
for(int i=0;i<name.length;i++)
{
System.out.println("name at "+i+" : "+name[i]);
}
}
}