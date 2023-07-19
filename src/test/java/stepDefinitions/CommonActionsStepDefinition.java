package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageObjects.CommonActions;
import utils.TestContextSetup;

public class CommonActionsStepDefinition {

    public WebDriver driver;
    public String productName;
    public CommonActions commonActions;
    TestContextSetup testcontextsetup;

    public CommonActionsStepDefinition(TestContextSetup testcontextsetup) {
        this.testcontextsetup = testcontextsetup;
        commonActions = testcontextsetup.pageObjectmanager.getcommonActions();
    }

    @Given("user enter {string} text into {string}")
    public void user_enter_text_into(String value, String path) {
        commonActions.textBox(path).clear();
        commonActions.textBox(path).sendKeys(value);
    }

    @When("user click on {string}")
    public void user_click_on_something(String object) throws InterruptedException {
        commonActions.clickable(object).click();
    }

    @When("user click on {string} button")
    public void user_click_on_button(String object) throws InterruptedException {
        commonActions.button(object).sendKeys(Keys.ENTER);
    }
//  @Given("user enter random {int} char into {string}")
//  public void user_enter_random_char_into(int num, String path) {
//      String value=testcontextsetup.genericUtils.randomNumber(num);
//      commonActions.textBox(path).clear();
//      commonActions.textBox(path).sendKeys(value);
//  }
      @And("user click on {string} from section {string}")
        public void user_click_on_something_from_section_something(String submenu, String menu) throws Throwable {
          commonActions.clickWithSection(submenu, menu).click();
        }
    

        @When("user click on {string} link")
        public void user_click_on_link(String alink) throws InterruptedException {
            commonActions.links(alink).click();
        }
        @And("user select {string} from {string} section")
        public void user_select_from_section(String submenu, String menu) throws Throwable {
            commonActions.clickable(menu).click();
            commonActions.clickable(submenu).click();
        }

        @And("^user select (.+) from \"([^\"]*)\" sections$")
        public void user_select_from_something_section(String submenu, String menu) throws Throwable {
            commonActions.clickable(menu).click();
            commonActions.clickable(submenu).click();
        }


        @And("user select {string} from {string} lable")
        public void user_select_from_lable(String submenu, String menu) throws Throwable {
            commonActions.clickLable(menu).click();
            commonActions.clickable(submenu).click();
        }
}