import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaMCQ {
    public static void main(String[] args) {
        String output = getUrlContents("https://www.sanfoundry.com/java-questions-answers-freshers-experienced/");
        System.out.println(output);

        // output.matches("<h3>[]{,}</h3>");
        Pattern pattern = Pattern.compile("<h3>(\\S+)</h3>");
        // Matching the compiled pattern in the String
        Matcher matcher = pattern.matcher(output);
        if (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }

    }

    private static String getUrlContents(String theUrl) {
        StringBuilder content = new StringBuilder();
        // Use try and catch to avoid the exceptions
        try {
            URL url = new URL(theUrl); // creating a url object
            URLConnection urlConnection = url.openConnection(); // creating a urlconnection object

            // wrapping the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            // reading from the urlconnection using the bufferedreader
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}