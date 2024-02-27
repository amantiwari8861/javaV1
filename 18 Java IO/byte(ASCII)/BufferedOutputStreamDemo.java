import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String args[]) {

        // Use FileOutputStream to write binary data to a file. FileOutputStream is
        // meant for writing streams of raw bytes such as image data. For writing
        // streams of characters, consider using FileWriter.
        // To append content to an existing file, open FileOutputStream in append mode
        // by passing second argument as true.

        try {
            // FileOutputStream fout = new FileOutputStream("Hello.txt");//to replace old data in file
            FileOutputStream fout = new FileOutputStream("Hello.txt",true);//to append in data at file
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "hii i am aman i am appending in this file ";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.close();
            fout.close();
            System.out.println("success");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
            e.printStackTrace();
        }

        // try {
        // BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Hello.txt"));
        // bos.write('H');
        // bos.write('e');
        // bos.write('l');
        // bos.write('l');
        // bos.write('o');
        // bos.write(' ');
        // bos.write('T');
        // bos.write('h');
        // bos.write('e');
        // bos.write('r');
        // bos.write('e');
        // bos.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("File not found");
        // } catch (IOException e) {
        // System.out.println("IO Exception");
        // e.printStackTrace();
        // }
    }
}