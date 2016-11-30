package com.marriagemodule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFile {

    public static void main(String[] args) {
        ReaderFromFile reader = new ReaderFromFile();

       reader.txtReader();


    }
    private void txtReader(){
        List<String> listDateOfPersons = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/andriis/Documents/persons.txt"));
            String line;
            while ((line = br.readLine())!=null){
                listDateOfPersons.add(line);

            }

        }catch (Exception e){
            System.out.println(e);

        }
        System.out.println(listDateOfPersons);
    }

}



