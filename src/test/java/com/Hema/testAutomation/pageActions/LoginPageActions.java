package com.Hema.testAutomation.pageActions;

import net.thucydides.core.annotations.Step;
import com.Hema.testAutomation.pageObjects.LoginPage;

public class LoginPageActions {
    LoginPage loginPage;

    @Step
    public void clickOnLogin(String UserName,String Password) {
        loginPage.enterLoginDetails(UserName,Password);
    }
}
