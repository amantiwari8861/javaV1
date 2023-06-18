import java.io.*;

class Checked
{
    public static void main(String[] args) throws IOException
    {
        
        try
        {
            FileReader fr=new FileReader("hello.py");
            BufferedReader br=new BufferedReader(fr);
            String s=br.readLine();
            System.out.println(s);
            fr.close();
            br.close();
        }
        catch( IOException fe)
        {
            // fe.printStackTrace();
            System.out.println(fe.getMessage());
        }

        System.out.println("after code\n\n");

    }
}