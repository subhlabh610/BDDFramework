package utils;

import java.io.FileReader;
import java.util.Properties;

public class PropReader {
    Properties prop;

    public Properties initProp(){
        try {
            prop = new Properties();
            FileReader fileReader = new FileReader("E:\\Workspace\\BDDFramework\\src\\test\\utils\\driver.properties");
            prop.load(fileReader);
        }catch(Exception e){

        }
        return prop;
    }
}
