package Utils;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import PageObjects.PageObjectsManager;

public class TestContextSetup {
    
public WebDriver driver;
public TestBase testbase;
public GenericUtils genericutils;
public PageObjectsManager pageobjectsmanager;

 public TestContextSetup() throws IOException {
        testbase = new TestBase();
        pageobjectsmanager = new PageObjectsManager(testbase.WebDriverManager());
        genericutils = new GenericUtils(testbase.WebDriverManager());

}
}
