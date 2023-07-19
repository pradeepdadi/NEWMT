package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoPage {
    
    public WebDriver driver;

    public DemoPage(WebDriver driver) {
        this.driver = driver;
    }
public WebElement clickable (String locator){
    return driver.findElement(By.xpath("//*[text()='"+locator+"']"));
}
public WebElement inputValue (String locator){
    return driver.findElement(By.xpath("(//*[contains(text(),'"+locator+"')]/following::input)[1]"));
}
public WebElement button(String locator) {
    return driver.findElement(By.xpath("//button[contains(text(),'"+locator+"')]"));
    
}
}
