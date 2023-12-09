public class Tricky {

    public static void main(String[] args) 
    {
        int a=11, b=22, c;
         
        c = a + b + a++ + b++ + ++a + ++b;//33+11+22+13+24 // left to right
        //a=13
        //b=24
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}