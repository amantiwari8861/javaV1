import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardInput2 {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String s = "";
            while (s != null) {
                System.out.print("Type xyz to exit:");
                s = in.readLine();
                if (s != null)
                    s = s.trim();
                System.out.print("Read:" + s);
                if (s.equals("xyz"))
                    System.exit(0);
            }
        } catch (IOException e) {
            System.out.print("Exception:" + e);
        }
    }
}