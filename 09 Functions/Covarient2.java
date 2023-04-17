class Covarient
{
    void fxn0()
    {
        System.out.println("hello i am no return type fxn ");
    }
    int fxn()
    {
        System.out.println("hello i am int return type fxn ");
        return 100;
    }
    char fxn2()
    {
        System.out.println("hello i am char return type fxn ");
        return 'A';
    }
    float fxn3()
    {
        System.out.println("hello i am float return type fxn ");
        return 3.14f;
    }
    Covarient fxn4()
    {
        return this;//this referes to current class obj 
    }

}
class Main
{
    public static void main(String[] args) {
        // Covarient obj=new Covarient();
        // obj.fxn0();//hello i am no return ...... 
        // System.out.println(obj.fxn());//100
        // System.out.println(obj.fxn2());// A
        // System.out.println(obj.fxn3());// 3.14
        // Covarient obj2; //not initialized only declared
        // obj2=obj.fxn4(); //got Covarient class object in return 
        new Covarient().fxn4().fxn0();//2nd way
        // obj2.fxn0();1st way
    }
}