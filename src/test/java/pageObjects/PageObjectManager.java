package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public WebDriver driver;
    public CommonActions commonActions;
    public CommonAsserts commonAsserts;
    public ShippingAddressPage shippingaddresspage;
    public DemoPage demoPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public CommonActions getcommonActions() {
        commonActions = new CommonActions(driver);
        return commonActions;
    }
    public CommonAsserts getofferPage() {
        commonAsserts = new CommonAsserts(driver);
        return commonAsserts;
    }

    public ShippingAddressPage getshippingaddresspage() {
        shippingaddresspage = new ShippingAddressPage(driver);
        return shippingaddresspage;
    }
    public DemoPage getDemoPage(){
        demoPage = new DemoPage(driver);
        return demoPage;
    }

}
