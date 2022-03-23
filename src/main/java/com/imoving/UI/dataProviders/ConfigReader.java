package com.imoving.UI.dataProviders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {//статичный блок, нужен чтоб принадлежал только этому классу
        try {
            String path = "src/test/resources/configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty (String key){
        return properties.getProperty(key).trim();

    }
}
