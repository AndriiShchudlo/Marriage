package com.marriagemodule;

public class Main {
    public static void main(String[] args) {
        Person andriy = new Person("Andriy", Sex.MALE, 18, false);
        Person marta = new Person("Marta", Sex.FEMALE, 17, false);

        Person ira = new Person("ira", Sex.MALE, 17, false);
        Person anton = new Person("anton", Sex.FEMALE, 17, false);

        Person vira = new Person("vira", Sex.MALE, 17, true);
        Person vova = new Person("Vova", Sex.FEMALE, 17, false);

        boolean  status = MarriageModule.marriageModule(andriy, marta);
        boolean  status1 = MarriageModule.marriageModule(ira, anton);
        boolean  status2 = MarriageModule.marriageModule(ira, anton);
        System.out.println(status);
        System.out.println(status1);
        System.out.println(status2);

    }
}
