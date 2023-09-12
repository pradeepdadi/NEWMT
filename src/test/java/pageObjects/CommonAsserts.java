package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonAsserts {
    public WebDriver driver;

    public CommonAsserts(WebDriver driver) {
        this.driver = driver;
    }
public WebElement headername(String path){
    return driver.findElement(By.xpath("//*[contains(text(),'" + path + "')]"));
}


}
