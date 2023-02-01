import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("Hello.txt");
            FileInputStream fis2 = new FileInputStream("ReadFile.txt");
            SequenceInputStream sis = new SequenceInputStream(fis, fis2);
            // System.out.println((char) sis.read()); // h
            System.out.println(new String(sis.readAllBytes())); //hello_therehello_aman sir
            sis.
            if(sis.markSupported()){
                sis.mark(0);
                sis.reset();
                System.out.println(new String(sis.readAllBytes())); //ello there
            }
            else{
                System.out.println("Mark is not supported");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}