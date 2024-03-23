// import org.jsoup.Jsoup;
// import org.jsoup.nodes.Document;
// import org.jsoup.nodes.Element;
// import org.jsoup.select.Elements;

// public class App {
//     public static void main(String[] args) {
//         try {
//             // Connect to a website and get the HTML content
//             // String url = "http://www.google.com";

//             // String text="<div class="carousel-item" data-si="37">
//             // <img src="https://image4.slideserve.com/8240399/copyright-2017-edureka-and-or-its-affiliates-1-n.jpg" alt="copyright 2017 edureka and or its affiliates 1" class="d-block w-100"></div>"

//             String url = "https://www.slideserve.com/EdurekaIN/python-django-tutorial-getting-started-with-django-web-development-with-django-edureka-powerpoint-ppt-presentation";
//             Document document = Jsoup.connect(url).get();

//             // Find elements on the page using CSS selectors
//             Elements links = document.select("img");

//             // Iterate through the elements and extract information
//             for (Element link : links) {
//                 String linkText = link.text();
//                 String linkHref = link.attr("src");
//                 System.out.println("Text: " + linkText + ", URL: " + linkHref);
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }