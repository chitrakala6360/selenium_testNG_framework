package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public PropertyReader() throws FileNotFoundException, IOException {
    }
    FileInputStream fileInputStream = null;
    Properties p = null;

    public static String readkey(String key) throws IOException {
        FileInputStream fileInputStream=null;
        Properties p=null;
        fileInputStream=new FileInputStream(System.getProperty("user.dir") + "/src/main/resource/data.properties");
        p=new Properties();
        p.load(fileInputStream);

        return p.getProperty(key);


    }


}
