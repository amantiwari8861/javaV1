import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JavaRegex1{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex 
{
    String pattern="([01]?\\d{1,2}|2[0-4]\\d|25[0-5]).([01]?\\d{1,2}|2[0-4]\\d|25[0-5]).([01]?\\d{1,2}|2[0-4]\\d|25[0-5]).([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
}

// 0 to 255 => ([01]?\d{1,2}|2[0-4]\d|25[0-5])
