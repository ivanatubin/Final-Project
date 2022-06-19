package pages.elementspages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TextBoxPage extends BasePage {

    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submit = By.xpath("//*[@id=\"submit\"]");
    private By resultAL = By.xpath("//*[@id=\"output\"]");


    /**
     * Get method for web element by locator submit
     * */
    public WebElement getSubmit () {
        return getDriver().findElement(submit);
    }
    /**
     * Get method for web element by locator fullName
     * */
    public WebElement getFullName () {
        return getDriver().findElement(fullName);
    }
    /**
     * Get method for web element by locator email
     * */
    public WebElement getEmail () {
        return getDriver().findElement(email);
    }
    /**
     * Get method for web element by locator currentAddress
     * */
    public WebElement getCurrentAddress () {
        return getDriver().findElement(currentAddress);
    }
    /**
     * Get method for web element by locator permanentAddress
     * */
    public WebElement getPermanentAddress () {
        return getDriver().findElement(permanentAddress);
    }

    /**
     * Method inputs full name in text box
     * */
    public void setFullName (String  fullName) {
        getFullName().sendKeys(fullName);
    }
    /**
     * Method inputs email in text box
     * */
    public void setEmail (String  email) {
        getEmail().sendKeys(email);
    }
    /**
     * Method inputs current address in text box
     * */
    public void setCurrentAddress (String address) {
        getCurrentAddress().sendKeys(address);
    }
    /**
     * Method inputs permanent address in text box
     * */
    public void setPermanentAddress (String address) {
        getPermanentAddress().sendKeys(address);
    }
    /**
     * Method fills text box
     * Send inputs to: fullName, email, permanent address, current address
     * */
    public void fillTextBox (String fullName, String email, String currentAddress, String permAddress) {
        setFullName(fullName);
        setEmail(email);
        setCurrentAddress(currentAddress);
        setPermanentAddress(permAddress);
        getDriverWait().until(ExpectedConditions.elementToBeClickable(submit));

        scroll();
        getSubmit().click();


    }

    public TextBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    /**
     * Method returns text result after subbmiting text box
     * */
    public String getAllResult () {
        return getDriver().findElement(resultAL).getText();
    }
}
