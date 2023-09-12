package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {
    public WebDriver driver;
public CommonActions(WebDriver driver) {
    this.driver = driver;
}
 
public WebElement textbox(String inputText) {
    return driver.findElement(By.xpath("//*[@*='" + inputText + "']"));
}

public WebElement button(String locator) {
   // return driver.findElement(By.xpath("//*[contains(text(),'"+locator+"')]"));
   return driver.findElement(By.xpath("//button[text()[normalize-space() ='"+locator+"']]"));
    
}
public WebElement links(String alink) {
    return driver.findElement(By.xpath("(//a[text()='" + alink + "' or contains(text(),'" + alink + "')])[1]"));
}

public WebElement clickable(String locator) {
    return driver.findElement(By.xpath("//*[text()='"+locator+"' or contains(text(),'"+locator+"')]"));
}
}
