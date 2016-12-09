package main.java.com;

import main.java.com.fileReader.*;
import main.java.com.marriage.Marriage;
import main.java.com.entities.Person;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReadFile reader = new ReadFile();
        Marriage marriage = new Marriage();

        List<Person> personsTxt = reader.readFromFile(SettingReader.TXT);
//        boolean status1 = marriage.marriageModule(personsTxt.get(0), personsTxt.get(1));
  //     System.out.println(status1);

        System.out.println();

        List<Person> personsXml = reader.readFromFile(SettingReader.XML);
    //    boolean status2 = marriage.marriageModule(personsXml.get(0), personsXml.get(1));
      //  System.out.println(status2);

    }
}
