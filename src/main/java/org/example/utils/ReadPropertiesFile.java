package org.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {



    public Properties readPropertyFile()
    {
        FileInputStream fileInputStream= null;
        Properties properties=null;
        try {
            if (fileInputStream==null) {
                fileInputStream = new FileInputStream(new Constant().getPropertiesFileURL());
            }

          if (properties==null){properties=new Properties();}

            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
    public String getBrowser()
    {
       return readPropertyFile().getProperty("Browser");
    }
    public String getBaseURL()
    {
        return readPropertyFile().getProperty("BaseURL");
    }

}
