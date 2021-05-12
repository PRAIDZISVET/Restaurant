package by.itacademy.restaurant.util;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

@UtilityClass
public class PropertiesUtil {

    private static Properties properties;

    static {
        try {
            properties = new Properties();
//            PropertiesUtil.class.getClassLoader().getResourceAsStream("application.properties");
            properties.load(Files.newBufferedReader(Paths.get("resources", "application.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
