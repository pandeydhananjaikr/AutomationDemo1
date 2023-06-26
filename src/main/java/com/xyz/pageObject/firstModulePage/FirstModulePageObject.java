package com.xyz.pageObject.firstModulePage;

import com.xyz.fileReaders.FileReaders;
import com.xyz.managers.ReaderManager;
import com.xyz.utilityClass.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FirstModulePageObject {

    private static WebDriver driver;
    public FirstModulePageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userIsOnHomepage(){
        FirstModulePageObject.driver.get(ReaderManager.getInstance().getFileReaders().getUrl());
        UtilityClass.staticWaitForVisibility(15000);
    }


}
