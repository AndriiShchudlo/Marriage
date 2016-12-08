package main.java.com.fileReader.reader;

import main.java.com.fileReader.Reader;
import main.java.com.fileReader.SettingReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TxtReader implements Reader {


    @Override
    public List<String> read(String path) throws Exception  {
        List<String> personsAttributes = new ArrayList<>();
        PersonValidation testDate = new PersonValidation();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;

        while ((line = br.readLine()) != null) {
            String[] a = line.split(SettingReader.SEPERATOR_TXT_FILE);


            boolean result = testDate.isValidate(a);


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