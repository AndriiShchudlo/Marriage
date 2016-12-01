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
        List<Person> persons = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/andriis/IdeaProjects/MerriageModul/files/persons.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                for (int i = 0; i < a.length; i+=4) {
                    String name = a[i];
                    Sex sex = Sex.valueOf(a[i+1]);
                    int age = Integer.valueOf(a[i+2]);
                    boolean marriage = Boolean.valueOf(a[i+3]);
                    persons.add(new Person(name, sex, age, marriage));
                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        return persons;
    }

        protected List<Person> xmlReader () {
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



