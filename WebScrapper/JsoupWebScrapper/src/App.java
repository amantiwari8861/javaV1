import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App {
    public static void main(String[] args) {
        try {
            // Connect to a website and get the HTML content
            // String url = "http://www.google.com";
            String url = "https://www.sanfoundry.com/java-questions-answers-freshers-experienced/";
            Document document = Jsoup.connect(url).get();

            // Find elements on the page using CSS selectors
            Elements links = document.select("a");

            // Iterate through the elements and extract information
            for (Element link : links) {
                String linkText = link.text();
                String linkHref = link.attr("href");
                System.out.println("Text: " + linkText + ", URL: " + linkHref);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}