package main.java.com.fileReader.reader;

import main.java.com.fileReader.Reader;

import java.security.InvalidParameterException;

public class ReaderProvider {

    public Reader getReader(String filePath) {
        String extensionTxt = "txt";
        String extensionXml = "xml";

        String extension = getFileExtension(filePath);

        if (extension.equals(extensionTxt))
            return new TxtReader();

        if (extension.equals(extensionXml))
            return new XmlReader();

        throw new InvalidParameterException();
    }

    private String getFileExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }

}
