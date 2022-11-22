package steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {
    public String getPropertyValue(String propertyName){
        String propertyValue = "";
        Properties properties = new Properties();
        try(FileInputStream inputStream = new FileInputStream("/Users/valeriia/Downloads/Desktop/15bilet/zad/src/test/resources/my.properties")) {
            properties.load(inputStream);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }
}