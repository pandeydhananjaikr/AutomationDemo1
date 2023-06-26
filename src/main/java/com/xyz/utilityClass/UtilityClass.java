package com.xyz.utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UtilityClass {
    static WebDriver driver;
    public UtilityClass(WebDriver driver){
        UtilityClass.driver=driver;
        PageFactory.initElements(driver, null);
    }

    public static void staticWaitForVisibility(int timeInSeconds){
        try{
            Thread.sleep(timeInSeconds);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
