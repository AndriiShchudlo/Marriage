package com.marriagemodule;

public class Main {
    public static void main(String[] args) {
        Person andriy = new Person("Andriy", Sex.MALE, 18, false);
        Person marta = new Person("Marta", Sex.FEMALE, 17, false);

        Person ira = new Person("ira", Sex.MALE, 17, false);
        Person anton = new Person("anton", Sex.FEMALE, 17, false);

        Person vira = new Person("vira", Sex.MALE, 17, false);
        Person vova = new Person("vova",Sex.FEMALE,25,true);

        MarriageModule mariage = new MarriageModule();

        boolean  status = mariage.marriageModule(andriy, marta);
        boolean  status1 = mariage.marriageModule(ira, anton);
        boolean  status2 = mariage.marriageModule(vira, vova);

        System.out.println(status);
        System.out.println(status1);
        System.out.println(status2);

    }
}
