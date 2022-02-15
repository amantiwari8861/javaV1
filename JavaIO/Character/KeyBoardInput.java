import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardInput {
    public static void main(String[] args) {
        int counter = 0;
        String S;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.println("UNIX : type ctrl+d to exit" + "\nWINDOWS : Type ctrl+C to exit");
        try {
            while (counter < 5) {
                S = in.readLine();
                System.out.println("read:" + S);
                counter++;
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
