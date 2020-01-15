package com.Hema.testAutomation.pageObjects;

import com.Hema.testAutomation.helper.BasePage;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath="//div[@class='profile-wrap']/a")
    WebElement loginButton;
    public void clickLoginButton(){
        loginButton.click();
    }
}
