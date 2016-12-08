package main.java.com.fileReader;

import java.util.List;

public interface Reader {
    List<String> read(String path)throws Exception;

}
