package com.readFromFileModule;

import com.marriagemodule.Person;
import com.marriagemodule.Sex;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFile {
    private List<String> listDateOfPersons;
    private String extensionTxt = "txt";
    private String extensionXml = "xml";
    private List<Person> persons = new ArrayList<>();
    private List<String> dateOnePerson = new ArrayList<>();


    public List<Person> readFromFile(String pathFile) {
        ReaderFromFile reader = new ReaderFromFile();
        TXTReader txtread = new TXTReader();
        XMLReader xmlread = new XMLReader();
        File x = new File(pathFile);
        String resultExtension = getFileExtension(x);

        if (resultExtension.equals(extensionTxt)) {
            listDateOfPersons = txtread.txtReader(pathFile);
        } else if (resultExtension.equals(extensionXml)) {
            listDateOfPersons = xmlread.xmlReader(pathFile);
        }
        System.out.println(listDateOfPersons);
        List<Person> persons = reader.createListPersons(listDateOfPersons);
        return persons;
    }

    private String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }

    private List<Person> createListPersons(List<String> file) {
        for (int i = 0; i < file.size(); i++) {
            dateOnePerson.add(file.get(i));
            if (dateOnePerson.size() == 4) {
                String name = dateOnePerson.get(0);
                Sex sex = Sex.valueOf(dateOnePerson.get(1));
                int age = Integer.valueOf(dateOnePerson.get(2));
                boolean marriage = Boolean.valueOf(dateOnePerson.get(3));
                persons.add(new Person(name, sex, age, marriage));
                dateOnePerson.clear();
            }
        }
        return persons;
    }

}








