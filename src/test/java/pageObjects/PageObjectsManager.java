package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
    
    public WebDriver driver;
    public CommonActions commonactions;
    public CommonAsserts commonasserts;

    public PageObjectsManager(WebDriver driver){
this.driver = driver;
    }
    public CommonActions getcommonactions() {
        commonactions = new CommonActions(driver);
        return commonactions;
    }
    
    public CommonAsserts  getcommonasserts() {
        commonasserts = new CommonAsserts(driver);
        return commonasserts;
    }
}
