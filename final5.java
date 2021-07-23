// you can declare/initialise a blank final instance in construvctor
class final4
{

    final4() // constructor
    {
        final char ch;  // char ch with final keyword
        ch='C';
        fxn(ch);
    }
    void fxn(char ch2) // functiom
    {
       // ch='C';
        System.out.println("The char value is = "+ch2);
    }
}
class Main
 {
        public static void main(String[] args)
        {
            final4 obj=new final4(); // object of class final1
        }
}