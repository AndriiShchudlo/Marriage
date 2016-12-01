package com.marriagemodule;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLReader {
    ReaderFromFile reader = new ReaderFromFile();

    protected void xmlReader () {
        List<String> listDateOfPerson = new ArrayList<>();
        try {
            File xmlFile = new File(reader.xml);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("staff");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String name = (eElement.getElementsByTagName("name").item(0).getTextContent());
                    Sex sex = Sex.valueOf(eElement.getElementsByTagName("Sex").item(0).getTextContent());
                    int age = Integer.valueOf(eElement.getElementsByTagName("age").item(0).getTextContent());
                    boolean marriage = Boolean.valueOf(eElement.getElementsByTagName("marriage").item(0).getTextContent());

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
