class promotion {
public void fxn1(float a,long b) {
    System.out.println(""+a+" "+b);
}
public void fxn1(int a,int b,int c) {
    System.out.println(""+a+" " +b+" "+c);
}
}
class Run
{
    public static void main(String[] args) {
    promotion obj3=new promotion();
    obj3.fxn1(10.56f,50);       
    obj3.fxn1(10,50,30);       
    }
}