package csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CsvReader {
    private final String FILE_NAME;
    private CSVParser csvParser;
    private String[] headers;

    public CsvReader(String filename) {
        FILE_NAME = filename;
    }

    public void read() {
        try {
            Reader reader = new FileReader(FILE_NAME);
            csvParser = CSVFormat.DEFAULT
                    .withFirstRecordAsHeader() // Treats the first record as header
                    .parse(reader);
            headers = getHeadersArr(csvParser);
        } 
        catch (FileNotFoundException fe) 
        {
            System.out.println(fe.getLocalizedMessage());
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public String[] getHeadersArr(CSVParser csvParser) {
        return csvParser.getHeaderNames().toArray(new String[0]);
    }

    public void printData() {
        if (!csvParser.isClosed()) {
            for (int i = 0; i < headers.length; i++) {
                if (headers[i].equalsIgnoreCase("Roll No."))
                    System.out.printf("%-10s", headers[i]);
                else
                    System.out.printf("%-20s", headers[i]);
            }
            System.out.println();
            for (CSVRecord record : csvParser) {
                for (String header : headers) {
                    String value = record.get(header);
                    if (header.equalsIgnoreCase("Roll No."))
                        System.out.printf("%-10s", value);
                    else
                        System.out.printf("%-20s", value);
                }
                System.out.println();
            }
        }
    }

    public void close() {
        if (csvParser != null) {
            try {
                csvParser.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}