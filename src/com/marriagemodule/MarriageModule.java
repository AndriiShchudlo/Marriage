package com.marriagemodule;

public class MarriageModule {
    public static boolean marriageModule(Person firstPerson, Person secondPerson) {
        int minAgeFemale = 17;
        int minAgeMale = 18;
        int girlAge;
        int boyAge;
        if (firstPerson.married == true || secondPerson.married == true || firstPerson.sex == secondPerson.sex)
            return false;

        if (firstPerson.sex == Sex.MALE) {
            boyAge = firstPerson.age;
            girlAge = secondPerson.age;
        } else {
            girlAge = firstPerson.age;
            boyAge = secondPerson.age;
        }
        if (girlAge >= minAgeFemale & boyAge >= minAgeMale) {
            firstPerson.married = true;
            secondPerson.married = true;
            return true;
        }
        return false;

    }
}
