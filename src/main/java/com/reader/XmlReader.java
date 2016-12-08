package main.java.com.reader;

import main.java.com.fileReader.Reader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlReader implements Reader {
    private List<String> personsAttributes = new ArrayList<>();


    @Override
    public List<String> read(String path) throws Exception {


        File xmlFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("Person");
        generationListPersons(nList);

        return personsAttributes;

    }


    private void generationListPersons(NodeList nList) {
        TestDateOfPerson testDate = new TestDateOfPerson();
        for (int i = 0; i < nList.getLength(); i++) {
            Node nNode = nList.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                String[] a = new String[4];
                Element eElement = (Element) nNode;
                a[i] = eElement.getTextContent();

                addPersonAttributes(a, eElement);

                boolean result = testDate.testDateOfPerson(a);
                if (!result) {
                    continue;
                }
                for (int j = 0; j < a.length; j++) {
                    personsAttributes.add(a[j]);
                }
            }
        }
    }
    public void addPersonAttributes(String[] attributesPerson, Element eElement) {

        attributesPerson[0] = (eElement.getElementsByTagName("name").item(0).getTextContent());
        attributesPerson[1] = (eElement.getElementsByTagName("Sex").item(0).getTextContent());
        attributesPerson[2] = (eElement.getElementsByTagName("age").item(0).getTextContent());
        attributesPerson[3] = (eElement.getElementsByTagName("marriage").item(0).getTextContent());

    }
}
