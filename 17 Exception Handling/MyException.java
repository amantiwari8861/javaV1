import java.lang.Exception;
class UserException extends Exception
{
    String msg;
    UserException(String msg)
    {
        this.msg=msg;
    }
    @Override
    public String toString() { //overriding toString Method
        return ("\n\t\t ERROR!!!!!!!!   :- "+msg);
    }
}
class MyException
{
    public static void main(String[] args) {
        
        String name="Aman";
        try{
        if(name.equals("nAman"))
        {
            System.out.println("Welcome  "+name);
        }
        else
        {
            // throw (new NumberFormatException("only Aman is applicable for this project "));
            throw (new UserException("only Aman is applicable for this project\n"));
        }
    }
    catch(UserException u)
    {
        System.out.println(u);
    }

    }
}