package com.xyz.stepDefinition;

import com.xyz.managers.PageManager;
import com.xyz.parentManager.ParentManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.bytebuddy.jar.asm.Type;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    ParentManager parentManager;

    public Hooks(ParentManager parentManager) {
        this.parentManager = parentManager;
    }

    @Before
    public void beforeScenario(){

    }
    @After
    public void afterScenario(){
        parentManager.getDriverManager().shutDownBrowser();
    }

    @AfterStep
    public void takeScreeShot(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)parentManager.getDriverManager().getDriverForLaunch()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screeShot");
        }

    }
}
