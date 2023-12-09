package json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    private final String FILE_NAME;
    private JsonNode rootNode;

    public JsonReader(String filename) {
        FILE_NAME = filename;
    }

    public void read() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            rootNode = objectMapper.readTree(new File(FILE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printData() {
        if (rootNode != null) {
            // Your logic to print JSON data goes here
            System.out.println(rootNode);
        }
    }

    public void close() {
        // No specific action needed for closing in this case
    }
}
