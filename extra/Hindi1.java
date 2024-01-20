import java.io.UnsupportedEncodingException;

public class Hindi1 {
    public static void main(String[] args) throws UnsupportedEncodingException 
    {
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        out.println("नमस्ते दुनिया!"); // Output: नमस्ते दुनिया!
                
    }
}