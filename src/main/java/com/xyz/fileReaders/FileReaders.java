package com.xyz.fileReaders;
import com.xyz.Enumerator.SelectDriver;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;
public class FileReaders {
    final String path = "ConfigFile/config.properties";
    private Properties properties;

    public FileReaders() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            properties = new Properties();
            try {
                properties.load(bufferedReader);
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public SelectDriver getBrowser() {
        String browser = properties.getProperty("browser");
        if (browser == null || browser.equalsIgnoreCase("chrome")) return SelectDriver.CHROME;
        else if (browser == null || browser.equalsIgnoreCase("firefox")) return SelectDriver.FIREFOX;
        else throw new RuntimeException("Browser Not Found");
    }

    public String getUrl() {
        String url = properties.getProperty("url");
        return url;
    }

}
