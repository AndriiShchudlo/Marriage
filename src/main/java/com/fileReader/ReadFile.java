package main.java.com.fileReader;

import main.java.com.entities.Person;
import main.java.com.entities.Sex;
import main.java.com.fileReader.reader.ReaderProvider;

import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private List<Person> persons = new ArrayList<>();


    public List<Person> readFromFile(String filePath) {
        List<String> personsAttributes = new ArrayList<>();
        ReaderProvider provider = new ReaderProvider();
        Reader reader = provider.getReader(filePath);

        try {
            personsAttributes = reader.read(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        createListPersons(personsAttributes);
        System.out.println(personsAttributes);
        return persons;
    }

    private void createListPersons(List<String> file) {
        List<String> dateOnePerson = new ArrayList<>();
        for (int i = 0; i < file.size(); i++) {
            dateOnePerson.add(file.get(i));
           if (dateOnePerson.size() != SettingReader.COUNT_ATTRIBYTES) continue;
            addPerson(dateOnePerson);
            dateOnePerson.clear();
        }
    }

    private void addPerson(List<String> dateOnePerson) {
        String name = dateOnePerson.get(0);
        Sex sex = Sex.valueOf(dateOnePerson.get(1));
        int age = Integer.valueOf(dateOnePerson.get(2));
        boolean marriage = Boolean.valueOf(dateOnePerson.get(3));

        persons.add(new Person(name, sex, age, marriage));

    }
}








