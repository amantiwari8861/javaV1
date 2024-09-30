import java.io.*;

public class ByteArrayStreamExample {
    public static void main(String[] args) {
        try {
            // Create a ByteArrayOutputStream
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            
            // Write some data to it
            String text = "Hello, this is a test string!";
            byteOut.write(text.getBytes());
            
            // Convert the written data to a byte array
            byte[] byteArray = byteOut.toByteArray();
            
            // Now let's read the data back using ByteArrayInputStream
            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteArray);
            
            // Read the data and print it
            int data;
            while ((data = byteIn.read()) != -1) {
                // Convert the byte back to a character and print it
                System.out.print((char) data);
            }
            
            // Closing ByteArray streams is optional because they are memory streams.
        //    System.out.println(byteOut.toString());
            byteOut.close();
            byteIn.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
