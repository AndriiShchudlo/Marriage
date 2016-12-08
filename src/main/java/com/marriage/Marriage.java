package main.java.com.marriage;

import main.java.com.entities.Person;
import main.java.com.entities.Sex;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Marriage {
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
