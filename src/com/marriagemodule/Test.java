package com.marriagemodule;

import java.util.List;

/**
 * Created by andriis on 12/1/16.
 */
public class Test {
    public static void main(String[] args) {
        MarriageModule marriage = new MarriageModule();
        ReaderFromFile reader = new ReaderFromFile();

        Person andriy = new Person("Andriy", Sex.MALE, 18, false);
        Person marta = new Person("Marta", Sex.FEMALE, 17, false);

        Person ira = new Person("ira", Sex.MALE, 17, false);
        Person anton = new Person("anton", Sex.FEMALE, 17, false);

        Person vira = new Person("vira", Sex.MALE, 17, false);
        Person vova = new Person("vova",Sex.FEMALE,25,true);


        boolean  status = marriage.marriageModule(andriy, marta);
        boolean  status1 = marriage.marriageModule(ira, anton);
        boolean  status2 = marriage.marriageModule(vira, vova);

        System.out.println(status);
        System.out.println(status1);
        System.out.println(status2);


    }
}
