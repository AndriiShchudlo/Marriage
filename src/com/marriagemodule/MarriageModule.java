package com.marriagemodule;

public class MarriageModule {
    public  boolean marriageModule(Person firstPerson, Person secondPerson) {
        int minAgeFemale = 17;
        int minAgeMale = 18;
        int girlAge;
        int boyAge;

        if (firstPerson.isMarried() || secondPerson.isMarried() || firstPerson.getSex() == secondPerson.getSex())
            return false;

        if (firstPerson.getSex() == Sex.MALE) {
            boyAge = firstPerson.getAge();
            girlAge = secondPerson.getAge();
        } else {
            girlAge = firstPerson.getAge();
            boyAge = secondPerson.getAge();
        }
        if (girlAge >= minAgeFemale & boyAge >= minAgeMale) {
            firstPerson.setMarried(true);
            secondPerson.setMarried(true);
            firstPerson.setLoveHalf(secondPerson);
            secondPerson.setLoveHalf(firstPerson);
            return true;
        }
        return false;

    }
}
