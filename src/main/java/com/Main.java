package main.java.com;

import main.java.com.fileReader.*;
import main.java.com.marriage.Marriage;
import main.java.com.entities.Person;

import java.util.List;

public class Main {

//        boolean status1 = marriage.marriageModule(personsTxt.get(0), personsTxt.get(1));

    public static void main(String[] args) {
        ReadFile reader = new ReadFile();
        Marriage marriage = new Marriage();

        Thread t1 = new Thread(() -> {
            List<Person> personsTxt = reader.readFromFile(SettingReader.TXT);
        });
        Thread t2 = new Thread(() -> {
            List<Person> personsXml = reader.readFromFile(SettingReader.XML);
        });

        t1.start();
        //t1.stop();
        t2.start();
        //System.out.println(status1);
        System.out.println();
        //boolean status2 = marriage.marriageModule(personsXml.get(0), personsXml.get(1));
        //System.out.println(status2);

    }
}
