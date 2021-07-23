class UserException
{
    String msg;
    UserException(String msg)
    {
        this.msg=msg;
    }
    public String toString() { //overriding toString Method
        return (" is :"+msg);
    }
}
class toString1
{
    public static void main(String[] args) {
        
    UserException obj=new UserException("hiiiii");
    System.out.println("the value of obj"+obj); //gives address
    }
}