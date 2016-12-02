package com.readFromFileModule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TXTReader implements Reader {

    @Override
    public List<String> read(String path) {
        TestDateOfPerson testDate = new TestDateOfPerson();
        List<String> listDateOfPerson = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                boolean result = testDate.testDateOfPerson(a);
                if (!result) {
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