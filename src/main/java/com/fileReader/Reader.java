package main.java.com.fileReader;

import java.util.HashMap;
import java.util.List;

public interface Reader {
    List<HashMap<String,String>> read(String path)throws Exception;

}
