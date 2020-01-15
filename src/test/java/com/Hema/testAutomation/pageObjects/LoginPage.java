package com.Hema.testAutomation.pageObjects;

import com.Hema.testAutomation.helper.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id="dwfrm_login_username_default")
    WebElement emailAddress;

    @FindBy(id="dwfrm_login_password_default")
    WebElement password;


    @FindBy(name="dwfrm_login_login")
    WebElement loginbtn;

    public void enterLoginDetails(String email,String pass){
        enterData(emailAddress,email);
        enterData(password,pass);
        loginbtn.click();
    }
}
