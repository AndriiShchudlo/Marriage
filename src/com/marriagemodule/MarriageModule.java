package com.marriagemodule;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.WeakHashMap;

public class MarriageModule {
    public boolean marriageModule(Person firstPerson, Person secondPerson) {
        if (firstPerson.isMarried() || secondPerson.isMarried() || firstPerson.getSex() == secondPerson.getSex())
            return false;
        int girlAge;
        int boyAge;
        int minAgeFemale = 17;
        if (firstPerson.getSex() == Sex.MALE) {
            boyAge = firstPerson.getAge();
            girlAge = secondPerson.getAge();
        } else {
            girlAge = firstPerson.getAge();
            boyAge = secondPerson.getAge();
        }
        if (girlAge >= minAgeFemale & boyAge > minAgeFemale) {
            wedding(firstPerson, secondPerson);
            return true;
        }
        return false;
    }

    private void wedding(Person firstPerson, Person secondPerson) {
        firstPerson.setMarried(true);
        secondPerson.setMarried(true);
        firstPerson.setLoveHalf(secondPerson);
        secondPerson.setLoveHalf(firstPerson);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter( "/home/andriis/IdeaProjects/Marriage/files/wedding.txt"))) {
            bw.write("Love halt:");
            bw.newLine();
            bw.write(String.valueOf(firstPerson.getLoveHalf()));
            bw.newLine();
            bw.write(String.valueOf(secondPerson.getLoveHalf()));
        } catch (Exception e){
        System.out.println(e);
        }

    }
}
