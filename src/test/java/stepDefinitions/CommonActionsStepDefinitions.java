package StepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import PageObjects.CommonActions;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;


public class CommonActionsStepDefinitions {
  
    public WebDriver driver;
public CommonActions commonactions;
TestContextSetup testcontextsetup;

public CommonActionsStepDefinitions(TestContextSetup testcontextsetup) {
    this.testcontextsetup = testcontextsetup;
    commonactions = testcontextsetup.pageobjectsmanager.getcommonactions();
}
    @Given("user enter {string} text into {string}")
    public void user_enter_text_into(String value, String path) {
        commonactions.textbox(path).clear();
        commonactions.textbox(path).sendKeys(value);
    }

    @And("user click on {string} button")
    public void user_click_on_button(String object)  {
        commonactions.button(object).sendKeys(Keys.ENTER); 
    }

    @And("user click on {string} link")
    public void user_click_on_link(String alink)  {
        commonactions.links(alink).click(); 
    }

    @When("user click on {string}")
    public void user_click_on_something(String object) throws InterruptedException {
        commonactions.clickable(object).click();
    }
}
