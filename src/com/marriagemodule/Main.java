package com.marriagemodule;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        MarriageModule marriage = new MarriageModule();
        ReaderFromFile reader = new ReaderFromFile();

        List<Person> personXML = reader.xmlReader();
        boolean status5 = marriage.marriageModule(personXML.get(0), personXML.get(1));
        System.out.println(status5);

        List<Person> personTXT = reader.txtReader();
        boolean status6 = marriage.marriageModule(personTXT.get(0), personTXT.get(1));
        System.out.println(status6);


    }
}
