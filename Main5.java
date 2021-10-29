 class Building5
{
    int a,b,c; //instance variable
    Building5()
    {
        System.out.println("Default constructor");
    }
    Building5(int a)
    {
        this.a=a;
        System.out.println("1 argument constructor "+a);
    }
    Building5(int b,int c)
    {
        this.b=b;
        this.c=c;
        System.out.println("2 argument constructor"+b+" "+c);
    }
}

public class Main5
{
    public static void main(String[] args) {
        Building5 obj=new Building5();

            // new Building5(55);
            // new Building5(55,67);
    }
}