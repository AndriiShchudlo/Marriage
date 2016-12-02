package com.readFromFileModule;

import com.marriagemodule.Sex;

public final class TestDateOfPerson {
    private int age;
    protected boolean testDateOfPerson(String[] a) {

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
        if (!isSex) {return false;}
        try {
            age = Integer.parseInt(a[2]);
        } catch (NumberFormatException nfe) {
            return false;
        }
        if (!(a[3].equals("true") || a[3].equals("false")))
            return false;
        return true;
    }
}
