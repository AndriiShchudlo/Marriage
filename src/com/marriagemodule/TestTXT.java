package com.marriagemodule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class TestTXT {
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
}
