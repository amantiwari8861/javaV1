class this1
{
    this1()
    {
        this.fxn();
        // fxn();
    }
    void fxn()
    {
        System.out.println("hello world");
    }
}
class Main
{
    public static void main(String[] args) {
        this1 obj=new this1();
    }
}