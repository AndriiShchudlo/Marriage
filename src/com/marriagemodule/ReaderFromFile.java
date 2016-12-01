package com.marriagemodule;


import java.io.File;
import java.util.List;

public class ReaderFromFile {
    String txt = "/home/andriis/IdeaProjects/MerriageModul/files/persons.txt";
    String xml = "/home/andriis/IdeaProjects/MerriageModul/files/persons.xml";

    public static void main(String[] args) {
        TXTReader txtread = new TXTReader(txt);
        XMLReader xmlread = new XMLReader();
        List<String> txt = txtread.txtReader();

        System.out.println(txt);

    }



}



