import java.util.StringTokenizer;
// import java.lang.String;
// import java.lang.StringBuffer;
// import java.lang.StringBuilder;
class StrToken
{
    public static void main(String[] args) {
        //StringTokenizer is Depricated
        String str="amantiwari@gmail.com,aman2@gmail.com,aman3@gmail.com,aman@gmail.com";
        StringTokenizer obj=new StringTokenizer(str,","); //multiple values stored  in obj
        System.out.println("total token is "+obj.countTokens());
       
        while (obj.hasMoreTokens()) 
        {
            System.out.println(obj.nextToken());
        }
    }
}