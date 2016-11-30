package com.marriagemodule;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MarriageModule mariage = new MarriageModule();
        ReaderFromFile reader = new ReaderFromFile();

        List<Person> personXML = reader.xmlReader();
        boolean status5 = mariage.marriageModule(personXML.get(0), personXML.get(1));
        System.out.println(status5);

        List<Person> personTXT = reader.txtReader();
        boolean status6 = mariage.marriageModule(personTXT.get(0), personTXT.get(1));
        System.out.println(status6);
//        Person andriy = new Person("Andriy", Sex.MALE, 18, false);
//        Person marta = new Person("Marta", Sex.FEMALE, 17, false);
//
//        Person ira = new Person("ira", Sex.MALE, 17, false);
//        Person anton = new Person("anton", Sex.FEMALE, 17, false);
//
//        Person vira = new Person("vira", Sex.MALE, 17, false);
//        Person vova = new Person("vova",Sex.FEMALE,25,true);
//
//
//        boolean  status = mariage.marriageModule(andriy, marta);
//        boolean  status1 = mariage.marriageModule(ira, anton);
//        boolean  status2 = mariage.marriageModule(vira, vova);
//
//        System.out.println(status);
//        System.out.println(status1);
//        System.out.println(status2);
//        CreationPersonsWithFile persons = new CreationPersonsWithFile();
//        List<Person> person = persons.GenerationArrayOfPersons();
//
//        boolean status3 = mariage.marriageModule(person.get(0), person.get(1));
//        boolean status4 = mariage.marriageModule(person.get(2), person.get(3));
//        System.out.println("First couple: " + status3 + " Second couple :" + status4);

    }
}
