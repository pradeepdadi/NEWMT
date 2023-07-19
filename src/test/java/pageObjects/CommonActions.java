package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {
    public WebDriver driver;

    public CommonActions(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement textBox(String inputText) {
                return driver.findElement(By.xpath("//*[@*='"+inputText+"']"));
        //return driver.findElement(By.xpath("(//*[@name='"+inputText+"' or text()='"+inputText+"']//following::div/input])[1]"));
    }
    

    public WebElement button(String locator) {
        return driver.findElement(By.xpath("//button[contains(text(),'"+locator+"')]"));
        
    }

    public WebElement clickable(String locator) {
                return driver.findElement(By.xpath("//*[text()='"+locator+"' or contains(text(),'"+locator+"')]"));       
    }
    public WebElement clickWithSection(String submenu,String menu) {
        return driver.findElement(By.xpath("//*[@class='title']//*[text()='"+menu+"']//following::a[text()='"+submenu+"']"));
    }
    public WebElement clickLable(String locator) {
        return driver.findElement(By.xpath("//*[text()='"+locator+"']/following::div[1]"));     
}


    public WebElement links(String alink){
        return driver.findElement(By.xpath("(//a[text()='"+alink+"' or contains(text(),'"+alink+"')])[1]"));
    }

}
