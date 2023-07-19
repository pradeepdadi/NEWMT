package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.DemoPage;
import utils.TestContextSetup;

public class DemoStepDefinition {
    
    public WebDriver driver;
    public DemoPage bankPage;
    TestContextSetup testcontextsetup;

    public DemoStepDefinition(TestContextSetup testcontextsetup) {
        this.testcontextsetup = testcontextsetup;
        bankPage = testcontextsetup.pageObjectmanager.getDemoPage();
    }
    @Given("User Click on {string} in home page")
    public void user_click_on_something_in_home_page(String locator) {
        bankPage.clickable(locator).click();
    
    }
    
    @And("User enter {string} in {string}")
    public void user_enter_something_in_something(String value, String locator)  {
       bankPage.inputValue(locator).sendKeys(value);
    }
    
}

