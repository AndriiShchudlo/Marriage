package com.marriagemodule;

public class TestDateOfPerson {
    public boolean testDateOfPerson(String[] a) {

        if (a.length != 4)
            return false;

        if (a[0] == "") {
            return false;
        }
        boolean isSex = false;
        for (Sex sex : Sex.values()) {
            if (sex.name().equals(a[1])) {
                isSex = true;
            }
        }
        if (isSex == false) {return false;}
        try {

            int age = Integer.parseInt(a[2]);
        } catch (NumberFormatException nfe) {
            return false;
        }
        if (!(a[3].equals("true") || a[3].equals("false")))
            return false;
        return true;
    }
}
