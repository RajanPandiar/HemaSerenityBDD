package com.Hema.testAutomation.stepDefinitions;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.Hema.testAutomation.pageActions.LoginPageActions;

public class LoginPageStepDefinitions {
    @Steps
    LoginPageActions loginPageStep;

    @When("^the user tries to login with (.*) as userName, (.*) as password$")
    public void userLogin(String userName,String password){
        loginPageStep.clickOnLogin(userName,password);
    }
}
