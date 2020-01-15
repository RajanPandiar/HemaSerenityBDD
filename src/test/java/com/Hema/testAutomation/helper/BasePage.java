package com.Hema.testAutomation.helper;

import cucumber.api.java.Before;
import net.serenitybdd.core.pages.PageObject;
import org.junit.BeforeClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage extends PageObject {

    public void enterData(WebElement element,String data){
        element.click();
        element.sendKeys(data);
        waitForElementToBeDisplayed(element);
        element.sendKeys(Keys.TAB);

    }

    /*
     * This Method makes element to wait till element is Displayed
     * Helps avoiding Stale Element exception
     */
    public void waitForElementToBeDisplayed(WebElement webElement){
        for(int waitCount=1;waitCount<3;waitCount++){
            try{
                waitFor(webElement);
            }catch(Exception e){
                //just created a wait loop where an element will be searched for 30 seconds after page is renderred
            }

        }
    }


}
