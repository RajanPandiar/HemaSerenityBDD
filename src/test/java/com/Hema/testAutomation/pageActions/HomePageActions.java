package com.Hema.testAutomation.pageActions;

import net.thucydides.core.annotations.Step;
import com.Hema.testAutomation.pageObjects.HomePage;

public class HomePageActions {
   private HomePage homePage;

    @Step
    public void launch(){
        homePage.open();
    }

    @Step
    public void clickOnLogin(){
        homePage.clickLoginButton();
    }
}
