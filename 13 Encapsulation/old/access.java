// public,private,protected 
class access {
    private int i=10;
    void fxn2()
    {
        System.out.println("hello i am a fxn of private class ");
        System.out.println("the value of i is "+i);
    }
    private void fxn()
    {
        System.out.println("hello i am private fxn ");
    }
}
class Main {
public static void main(String[] args) {
    access obj=new access();
    obj.fxn2();
    // obj.fxn();
    // System.out.println("the value of i is "+obj.i);
}
}