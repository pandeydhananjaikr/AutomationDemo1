package com.xyz.stepDefinition.firstModuleStepDef;

import com.xyz.pageObject.firstModulePage.FirstModulePageObject;
import com.xyz.parentManager.ParentManager;
import io.cucumber.java.en.Given;

public class FirstModuleStepDefinition {

    ParentManager parentManager;
    FirstModulePageObject firstModulePageObject;
    public FirstModuleStepDefinition (ParentManager parentManager){
        this.parentManager= parentManager;
        firstModulePageObject = parentManager.getPageManager().getFirstModulePageObject();
    }

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        firstModulePageObject.userIsOnHomepage();
    }
}
