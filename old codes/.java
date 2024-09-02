interface A
{
void disp();
}
interface B1
{
void get();
}
class B implements A,B1 
{
public void disp()
{
System.out.println("Hello");
}
public void get()
{
System.out.println("Hello jee");
}
public static void main(String[]args)
{
B b1=new B();
b1.disp();
b1.get();
}
}