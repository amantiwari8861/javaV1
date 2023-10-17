package util;

public class GenerateThreedigitUniqueNo 
{
    static int count;
    public static String generate()
    {
        count++;
        String s=null;
        if (count<10) 
        {
            s=String.join("","P00",String.valueOf(count));
        }
        else if(count<100)
        {
            s=String.join("","P0",String.valueOf(count));
        }
        else if(count<1000)
        {
            s=String.join("","P",String.valueOf(count));
        }
        else
        {
            System.out.println("3 digit unique no. limit exceeded");
            System.exit(1);
        }
        return s;
    }
}
