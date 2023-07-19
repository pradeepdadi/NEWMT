package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingAddressPage {
    public WebDriver driver;

    public ShippingAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement ShippingtextBox(String inputText)   {
                return driver.findElement(By.xpath("(//*[contains(text(),'"+inputText+"')]/following::input)[1]"));      
    }
    public WebElement input(String value) {
        
        return driver.findElement(By.xpath("(//*[contains(text(),'"+value+"')]/following::input)[1]"));
    }
}
