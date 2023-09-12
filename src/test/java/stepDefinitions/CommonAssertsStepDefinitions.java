package StepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.WebDriver;
import PageObjects.CommonAsserts;
import io.cucumber.java.en.Then;

public class CommonAssertsStepDefinitions {

    public WebDriver driver;
    public CommonAsserts commonasserts;

    @Then("assert {string} is displayed in header")
    public void assert_is_displayed_in_header(String value) {
        String actualValue = commonasserts.headername(value).getText();
        System.out.println(actualValue);
        assertEquals(value, actualValue);
    }

}
