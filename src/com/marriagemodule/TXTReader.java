package com.marriagemodule;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TXTReader {

    protected List<String> txtReader(String txt) {
        TestDateOfPerson testDate = new TestDateOfPerson();
        List<String> listDateOfPerson = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(txt));
            String line;
            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                boolean result = testDate.testDateOfPerson(a);
                if (result == false) {
                    continue;
                }
                for (int i = 0; i < a.length; i++) {
                    listDateOfPerson.add(a[i]);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listDateOfPerson;
    }


}