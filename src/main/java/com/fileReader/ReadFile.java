package main.java.com.fileReader;

import main.java.com.entities.Person;
import main.java.com.entities.Sex;
import main.java.com.fileReader.reader.PersonValidation;
import main.java.com.fileReader.reader.ReaderProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFile {
    private List<Person> persons = new ArrayList<>();


    public List<Person> readFromFile(String filePath) {
        PersonValidation checkCorrectnessAttributes = new PersonValidation();
        List<HashMap<String, String>> personsAttributes = new ArrayList<>();
        ReaderProvider provider = new ReaderProvider();
        Reader reader = provider.getReader(filePath);

        try {
            personsAttributes = reader.read(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<HashMap<String,String>> editedPersonsAttributes = checkCorrectnessAttributes.isValidate(personsAttributes);
        printPersons(editedPersonsAttributes);
        createListPersons(editedPersonsAttributes);
        return persons;
    }

    private void createListPersons(List<HashMap<String, String>> personsAttributes) {
        for (HashMap<String, String> hashMap : personsAttributes) {

            String name = hashMap.get("name");
            Sex sex = Sex.valueOf(hashMap.get("sex"));
            int age = Integer.valueOf(hashMap.get("age"));
            boolean marriage = Boolean.valueOf(hashMap.get("marriage"));

            persons.add(new Person(name, sex, age, marriage));
        }
    }

    private void printPersons(List<HashMap<String, String>> personsAttributes) {
        for (HashMap<String, String> hashMap : personsAttributes) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                System.out.print(entry.getKey()+": " + entry.getValue()+"\t\t");
            }
            System.out.println();
        }

    }
}








