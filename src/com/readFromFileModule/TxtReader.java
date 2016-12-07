package com.readFromFileModule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TxtReader implements Reader {


    @Override
    public List<String> read(String path) throws Exception  {
        List<String> personsAttributes = new ArrayList<>();
        TestDateOfPerson testDate = new TestDateOfPerson();
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;

            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                boolean result = testDate.testDateOfPerson(a);
                if (!result) {
                    continue;
                }
                for (int i = 0; i < a.length; i++) {
                    personsAttributes.add(a[i]);
                }
            }

        return personsAttributes;
    }


}