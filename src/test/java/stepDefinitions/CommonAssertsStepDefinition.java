package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageObjects.CommonAsserts;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class CommonAssertsStepDefinition {

    public WebDriver driver;
    public CommonAsserts commonAsserts;
    // public String productName;
    TestContextSetup testcontextsetup;
    PageObjectManager pageObjectmanager;

    public CommonAssertsStepDefinition(TestContextSetup testcontextsetup) {
        this.testcontextsetup = testcontextsetup;
        commonAsserts = testcontextsetup.pageObjectmanager.getofferPage();
    }

    @Then("assert {string} is displayed in header")
    public void assert_is_displayed_in_header(String value) {

        String actualValue = commonAsserts.headername(value).getText();
        System.out.println(actualValue);
        assertEquals(value, actualValue);

    }

    @Then("assert {string} is displayed in section Learn more about {string}")
    public void assert_is_displayed_in_section_Learn_more_about(String name, String section) {

        String actualValue = commonAsserts.learnMoreAbout(section, name).getText();
        assertEquals(name, actualValue);
    }

    @When("user click on {string} dropdown")
    public void user_click_on_something(String object) throws InterruptedException {
        commonAsserts.select(object).click();
    }

    @Then("user hOver on {string}")
            public void user_hOver_on(String path) {
        //testcontextsetup.genericUtils.actions(path).build().perform();
        testcontextsetup.genericUtils.actions(path);
                
            }
}