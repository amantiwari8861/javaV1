class Building5
{
    int b,c; //instance variable
    Building5()
    {
        System.out.println("Default constructor");
    }
    Building5(int b)
    {
        this();
        this.b=b;
        System.out.println("1 argument constructor "+b);
    }
    Building5(int b,int c)
    {
        this(b); //calling of 1 argument constructor
        this.c=c;
        System.out.println("2 argument constructor"+b+" "+c);
    }
}
public class Main6
{
    public static void main(String[] args) {
        Building5 obj=new Building5(58,98);
    }
}