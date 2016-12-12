package main.java.com.fileReader.reader;

import main.java.com.fileReader.Reader;
import main.java.com.fileReader.SettingReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TxtReader implements Reader
{



    @Override
    public List<HashMap<String, String>> read(String path) throws Exception {

        PersonValidation testDate = new PersonValidation();
        BufferedReader br = new BufferedReader(new FileReader(path));
        List<HashMap<String, String>> hm = new ArrayList<>();

        while (br.ready()) {
            HashMap<String, String> attributesOfPerson = new HashMap<>();
            String[] a = br.readLine().split(SettingReader.SEPARATOR_TXT_FILE);

            attributesOfPerson.put("name", a[0]);
            attributesOfPerson.put("sex", a[1]);
            attributesOfPerson.put("age", a[2]);
            attributesOfPerson.put("marriage", a[3]);
            hm.add(attributesOfPerson);
        }
        return hm;
    }
}
