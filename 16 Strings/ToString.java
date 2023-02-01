class Demo1
{
    int num=50;

    @Override
    public String toString()
    {
        return "num=" + num ;
    }  
}
class ToString
{
    public static void main(String[] args) {
        Demo1 obj1=new Demo1();
        // Object 
        System.out.println(obj1);
    }
}