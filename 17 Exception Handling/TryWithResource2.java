import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource2 {

    public static void main(String[] args) 
    {
        try(FileReader fr=new FileReader("hello.py");BufferedReader br=new BufferedReader(fr);)
        {
            String s=br.readLine();
            System.out.println(s);
        }
        catch( IOException fe)
        {
            System.out.println(fe.getMessage());
        }
        System.out.println("after code\n\n");
    }
}
/*
  The try -with-resources statement is a try statement that declares one or more resources. A resource is an object that must be closed after the program is finished with it. The try -with-resources statement ensures that each resource is closed at the end of the statement.
 */