package xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;
import java.io.IOException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XmlReader {

    public static void main(String[] args) {
        try {
            // Read XML file
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/xml/files/Data.xml"));

            // Print elements
            NodeList nodeList = document.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Title: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Author: " + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Genre: " + element.getElementsByTagName("genre").item(0).getTextContent());
                }
            }

            // Write XML file
            Element newBook = document.createElement("book");
            Element newTitle = document.createElement("title");
            newTitle.appendChild(document.createTextNode("New Book Title"));
            Element newAuthor = document.createElement("author");
            newAuthor.appendChild(document.createTextNode("New Book Author"));
            Element newGenre = document.createElement("genre");
            newGenre.appendChild(document.createTextNode("New Book Genre"));

            newBook.appendChild(newTitle);
            newBook.appendChild(newAuthor);
            newBook.appendChild(newGenre);

            Element root = document.getDocumentElement();
            root.appendChild(newBook);

            // Save changes
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/xml/files/Data.xml"));
            transformer.transform(source, result);

            System.out.println("XML file updated successfully!");

        } catch (ParserConfigurationException | IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
