package Utils;

import org.openqa.selenium.WebDriver;
import PageObjects.CommonAsserts;

public class GenericUtils {
    
    public WebDriver driver;
    public CommonAsserts commonasserts;
    TestContextSetup testcontextsetup;

    public GenericUtils(WebDriver driver) {
        this.driver = driver;
    }
    
}
