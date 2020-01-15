package com.Hema.testAutomation.stepDefinitions;

import cucumber.api.java.en.Given;
import com.Hema.testAutomation.pageActions.HomePageActions;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomePageStepDefinitions {

    @Steps
    HomePageActions homepagestep;

    @Given("^a Ecommerce Portal$")
    public void accessApplication(){
        homepagestep.launch();
    }

    @When("^the user click on the login button")
    public void clickLogin(){
        homepagestep.clickOnLogin();
    }
}
