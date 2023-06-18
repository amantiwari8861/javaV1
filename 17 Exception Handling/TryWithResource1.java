import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) 
    {
        
        FileReader fr=null;
        BufferedReader br=null;
        try
        {
            fr=new FileReader("hello.py");
            br=new BufferedReader(fr);
            String s=br.readLine();
            System.out.println(s);
        }
        catch( IOException fe)
        {
            // fe.printStackTrace();
            System.out.println(fe.getMessage());
        }
        
        if(fr!=null)
        fr.close();

        if(br!=null)
        br.close();
        System.out.println("after code\n\n");


    }
}