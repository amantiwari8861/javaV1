import java.util.StringTokenizer;
// import java.lang.String;
// import java.lang.StringBuffer;
// import java.lang.StringBuilder;
class StrToken
{
    public static void main(String[] args) {
        //StringTokenizer is Depricated
        String str="hello everyone my name is Aman";
        StringTokenizer obj=new StringTokenizer(str," "); //multiple values stored  in obj
        System.out.println("total token is "+obj.countTokens());
       
        // System.out.println(obj instanceof Object); //true
        // System.out.println(obj);
        while (obj.hasMoreTokens()) {

            System.out.println(obj.nextToken());

        }
    }
}