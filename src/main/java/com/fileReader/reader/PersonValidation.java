package main.java.com.fileReader.reader;

import main.java.com.entities.Sex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonValidation {

    public List<HashMap<String, String>> isValidate(List<HashMap<String, String>> personAttributes) {

        return personAttributes;
    }

    public boolean xxx  (Map.Entry<String,String> entry){
        if (entry.getValue()==null) return false;
       return true;
    }

//        if (a.length != 4) return false;
//
//        if (a[0] == "") return false;
//
//        try {
//            int age = Integer.parseInt(a[2]);
//        } catch (NumberFormatException nfe) {
//            return false;
//        }
//
//        if (!(a[3].equals("true") || a[3].equals("false"))) return false;
//        for (Sex sex : Sex.values()) {
//            if (!sex.name().equals(a[1])) continue;
//            return true;
//        }


}
