package com.marriagemodule;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class ReaderFromFile {

    protected List<Person> txtReader() {
        List<String> listDateOfPersons = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/andriis/IdeaProjects/MerriageModul/files/persons.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                listDateOfPersons.add(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < listDateOfPersons.size(); i++) {
            String person = listDateOfPersons.get(i);
            String[] datePerson = person.split(",");
            String name = datePerson[0];
            Sex sex = Sex.valueOf(datePerson[1]);
            int age = Integer.valueOf(datePerson[2]);
            boolean marrige = Boolean.valueOf(datePerson[3]);
            persons.add(new Person(name, sex, age, marrige));
        }

        return persons;

    }

    protected List<Person> xmlReader() {
        List<Person> persons = new ArrayList<>();
        try {
            File xmlFile = new File("/home/andriis/IdeaProjects/MerriageModul/files/persons.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("staff");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    //  System.out.println(eElement.getTextContent().);
                    String name = (eElement.getElementsByTagName("name").item(0).getTextContent());
                    Sex sex = Sex.valueOf(eElement.getElementsByTagName("Sex").item(0).getTextContent());
                    int age = Integer.valueOf(eElement.getElementsByTagName("age").item(0).getTextContent());
                    boolean marriage = Boolean.valueOf(eElement.getElementsByTagName("marriage").item(0).getTextContent());
                    persons.add(new Person(name, sex, age, marriage));
                }
            }
            return persons;
        } catch (Exception e) {
            System.out.println(e);
        }
        return persons;
    }
}



