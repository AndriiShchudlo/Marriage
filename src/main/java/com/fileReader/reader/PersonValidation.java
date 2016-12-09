package main.java.com.fileReader.reader;

import main.java.com.entities.Sex;

public class PersonValidation {

    protected boolean isValidate(String[] a) {

        if (a.length != 4) return false;

        if (a[0] == "") return false;

        try {
            int age = Integer.parseInt(a[2]);
        } catch (NumberFormatException nfe) {
            return false;
        }

        if (!(a[3].equals("true") || a[3].equals("false"))) return false;
        for (Sex sex : Sex.values()) {
            if (!sex.name().equals(a[1])) continue;
            return true;
        }
        return false;
    }
}
