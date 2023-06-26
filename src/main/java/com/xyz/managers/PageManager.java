package com.xyz.managers;
import com.xyz.pageObject.firstModulePage.FirstModulePageObject;
import com.xyz.utilityClass.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
public class PageManager {
    private UtilityClass utilityClass;
    private FirstModulePageObject firstModulePageObject;
    private WebDriver driver;
    public PageManager(WebDriver driver){
        this.driver = driver;
    }
    public UtilityClass getUtilityClass(){
        return (utilityClass==null) ? utilityClass = new UtilityClass(driver) : utilityClass;
    }
    public FirstModulePageObject getFirstModulePageObject(){
        return (firstModulePageObject==null) ? firstModulePageObject =
                new FirstModulePageObject(driver) : firstModulePageObject;
    }




}
