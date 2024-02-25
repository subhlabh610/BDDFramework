package utils;

import java.io.FileReader;
import java.util.Properties;

public class PropReader {
    static Properties prop;

    public static Properties initProp(){
        try {
            prop = new Properties();
            FileReader fileReader = new FileReader("src/main/java/utils/driver.properties");
            prop.load(fileReader);
        }catch(Exception e){

        }
        return prop;
    }
}
