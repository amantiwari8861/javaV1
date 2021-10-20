import java.lang.Exception;
class UserException extends ArithmeticException
{
    String msg;
    UserException(){}
    UserException(String msg)
    {
        this.msg=msg;
    }
    public String toString() { //overriding toString Method
        return ("\n\t\t ERROR!!!!!!!!   :- "+msg);
    }
}
public class Throw {
    public static void main(String[] args) {
        // if(2/2 == 1)
        // throw new ArithmeticException(" meri exception");
        // UserException u=new UserException();
        // System.out.println(u);
        // UserException u=new UserException("this is my class object");
        // System.out.println(u);
        throw new UserException("this is my class object");
        // System.out.println("never excecute");
    }
}