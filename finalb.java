class finalb 
{
    final int a=50;
    //final int num;

    void fxn()
    {
        a=10;
    //    num=50;
        System.out.println("the value of a and num " +a+ " " +num);
    }
} 

class Abc
{
    public static void main(String[] args) 
    {
     finalb obj=new finalb();
     obj.fxn();   
    }
}