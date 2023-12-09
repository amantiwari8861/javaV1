package msoffice;

import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class MsWordReader {
    private final String FILE_NAME;

    public MsWordReader(String filename) {
        FILE_NAME = filename;
    }

    public void readDocx() {
        try {
            InputStream fis = new FileInputStream(FILE_NAME);
            XWPFDocument document = new XWPFDocument(fis);
            XWPFWordExtractor extractor = new XWPFWordExtractor(document);
            String text = extractor.getText();
            System.out.println(text);
            fis.close();
            extractor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
