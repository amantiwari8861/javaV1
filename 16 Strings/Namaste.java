import java.io.*;
public class Namaste {
    public static void main(String[] args) throws Exception
    {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        // Hindi text
        // String hindiText = "\u0928\u092E\u0938\u094D\u0924\u0947";
        String hindiText = "ामन";

        // Displaying Hindi text
        // System.out.println(hindiText);
        for(int i=0;i<65535;i++)
        {
            System.out.println((char)i);
        }
    }
}
