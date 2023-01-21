class Addition
{
    //static int a=10,b=20,c;
    int a=10,b=20,c;
    //c=a+b;   gives error 
    public static void main(String args[])
    {
        Addition abc=new Addition();
        abc.c=abc.a+abc.b;
        // c=a+b;
        System.out.println("the value of a is :" + abc.c);
    }
}