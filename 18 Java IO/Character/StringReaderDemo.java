import java.io.*;

public class StringReaderDemo {

    public static void main(String[] args) {

        String result=null;
        int i;
        try (BufferedReader reader = new BufferedReader(new StringReader("    \n\tLorem ipsum dolor sit amet."))) 
        {
            do 
            {
                reader.mark(1);
                i=reader.read();
                // System.out.println("skipped 1 space "+Character.isWhitespace(i));
            } while (Character.isWhitespace(i));

            reader.reset();
            result = reader.readLine();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(result);
    }
}