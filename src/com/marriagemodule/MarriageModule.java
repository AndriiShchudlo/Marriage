package com.marriagemodule;

public class MarriageModule {
    private int minAgeFemale = 17;
    private int minAgeMale = 18;
    private int girlAge;
    private int boyAge;

    public boolean marriageModule(Person firstPerson, Person secondPerson) {
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
            wedding(firstPerson,secondPerson);
            return true;
        }
        return false;
    }
    
    private void wedding(Person firstPerson, Person secondPerson){
        firstPerson.setMarried(true);
        secondPerson.setMarried(true);
        firstPerson.setLoveHalf(secondPerson);
        secondPerson.setLoveHalf(firstPerson);
    }
}
