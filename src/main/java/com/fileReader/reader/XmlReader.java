package main.java.com.fileReader.reader;

import main.java.com.fileReader.Reader;
import main.java.com.fileReader.SettingReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XmlReader implements Reader {
    private List<HashMap<String, String>> personsAttributes = new ArrayList<>();

    @Override
    public List<HashMap<String, String>> read(String path) throws Exception {

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
        for (int i = 0; i < nList.getLength(); i++) {
            Node nNode = nList.item(i);
            if (nNode.getNodeType() != Node.ELEMENT_NODE) continue;
            Element eElement = (Element) nNode;

            addPersonAttributes(eElement);
        }
    }

    public void addPersonAttributes(Element eElement) {
        HashMap<String, String> attributesOfPerson = new HashMap<>();

        attributesOfPerson.put("name", eElement.getElementsByTagName("name").item(0).getTextContent());
        attributesOfPerson.put("sex", eElement.getElementsByTagName("Sex").item(0).getTextContent());
        attributesOfPerson.put("age", eElement.getElementsByTagName("age").item(0).getTextContent());
        attributesOfPerson.put("marriage", eElement.getElementsByTagName("marriage").item(0).getTextContent());

        personsAttributes.add(attributesOfPerson);
    }
}
