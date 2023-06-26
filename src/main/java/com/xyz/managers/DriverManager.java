package com.xyz.managers;

import com.xyz.Enumerator.SelectDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverManager {
    private WebDriver driver;
    static SelectDriver selectDriver;
    public DriverManager() {
        selectDriver = ReaderManager.getInstance().getFileReaders().getBrowser();
    }

    public WebDriver createDriverForLaunch() {
        switch (selectDriver) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
        }
        return driver;
    }

    public WebDriver getDriverForLaunch() {
        if (driver == null) {
            driver = createDriverForLaunch();
        }
        return driver;
    }

    public void shutDownBrowser() {
        driver.quit();
    }


}
