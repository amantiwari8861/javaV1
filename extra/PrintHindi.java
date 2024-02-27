import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class PrintHindi {

    static String decodeText(String input, String encoding) throws IOException {
        return new BufferedReader(
                new InputStreamReader(
                        new ByteArrayInputStream(input.getBytes()),
                        Charset.forName(encoding)))
                .readLine();
    }

    public static void main(String[] args) throws IOException 
    {
        PrintStream ps = new PrintStream(System.out, true, Charset.forName("UTF-16"));
        ps.println("अमन");
        String str = new String("अमन".getBytes(StandardCharsets.UTF_8), "UTF-16");
        ps.println(str);
        ps.println(Charset.defaultCharset().displayName());
        ps.println(Charset.isSupported("utf-8"));
        ps.println(Charset.isSupported("utf-16"));
        ps.println(Charset.isSupported("utf-32"));
        ps.print(new String("अमन".getBytes(),Charset.forName("utf-8")));
        ps.print(new String("अमन".getBytes(StandardCharsets.UTF_8),Charset.forName("utf-8")));
        ps.print(new String("अमन".getBytes(StandardCharsets.UTF_16),Charset.forName("utf-16")));
        ps.print(new String("अमन".getBytes(StandardCharsets.UTF_16),Charset.forName("utf-32")));

        ps.println(decodeText("अमन", "utf-32"));
        byte[] arr = "अमन".getBytes(Charset.forName("UTF-32"));
        ps.print(new String(arr,"UTF-32"));

        for (byte b : "अमन".getBytes(StandardCharsets.UTF_16))
        {
            ps.println((char)b);
        }
        ps.println(new String("अमन".getBytes(StandardCharsets.UTF_16), StandardCharsets.UTF_16));
        InputStream is = new FileInputStream("MyFile.txt");
        ps.println(new String(is.readAllBytes(), StandardCharsets.UTF_16));

        String japaneseString = "よろしくお願いします"; // Pleased to meet you.

        ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(japaneseString);
        String utf8String = new String(byteBuffer.array(), StandardCharsets.UTF_8);
        ps.println(utf8String);
        String str4 = "你";
        int codePoint = str4.codePointAt(0);    
        ps.format("U+%04X", codePoint);


        String str3 = "a Z â Δ 你 好 ಡ ತ ع";
        File file = new File("x-utf8.txt");
    
        // write file in default charset (UTF-8)
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            out.write(str3);
        }
    
        // read file in default charset (UTF-8)
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = in.readLine()) != null) {
                ps.println(line);
            }
        }
    }
}