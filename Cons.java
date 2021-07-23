class Cons
{
    Cons()
    {
        System.out.println("default cnstructor ");
    }
    Cons(int a,int b)
    {
        System.out.println("the value of a and b is "+a+"  "+b);
    }
    Cons(long a,int b)
    {
        System.out.println("the value of a in long and b is "+a+"  "+b);
    }
}
class Main
{
    public static void main(String[] args) {
        // Cons obj=new Cons();//default
        Cons obj1=new Cons(10,20);
        Cons obj2=new Cons(10l,20); 
    }
}