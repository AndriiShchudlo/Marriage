package main.java.com.reader;

import main.java.com.marriagemodule.*;

public final class TestDateOfPerson {
    private int age;
    protected boolean testDateOfPerson(String[] a) {

        if (a.length != 4)
            return false;

        if (a[0] == "") {
            return false;
        }

        try {
            age = Integer.parseInt(a[2]);
        } catch (NumberFormatException nfe) {
            return false;
        }

        if (!(a[3].equals("true") || a[3].equals("false"))) {
            return false;
        }


        for (Sex sex : Sex.values()) {
            if (!sex.name().equals(a[1])) continue;
            return true;
        }
        return false;
    }
}
