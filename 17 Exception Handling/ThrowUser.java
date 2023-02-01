public class ThrowUser {
public static void main(String[] args) {
 
    int num=5;
    if(num<18)
    {
        throw new ArithmeticException("Age must be grater than or equal to 18 ");
    }
}
}