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
   // private By clickX = By.xpath("//*[@id=\"cbb\"]/svg/path[1]");
   /* private By resultName = By.id("name");
    private By resultEmail = By.id("email");
    private By resultCurrAddress = By.xpath("//*[@id=\"currentAddress\"]");
    private By resultPermAddress = By.id("permanentAddress"); */
    private By resultAL = By.xpath("//*[@id=\"output\"]");



    public WebElement getSubmit () {
        return getDriver().findElement(submit);
    }

    public WebElement getFullName () {
        return getDriver().findElement(fullName);
    }
    public WebElement getEmail () {
        return getDriver().findElement(email);
    }
    public WebElement getCurrentAddress () {
        return getDriver().findElement(currentAddress);
    }
    public WebElement getPermanentAddress () {
        return getDriver().findElement(permanentAddress);
    }

    public void setFullName (String  fullName) {
        getFullName().sendKeys(fullName);
    }
    public void setEmail (String  email) {
        getEmail().sendKeys(email);
    }
    public void setCurrentAddress (String address) {
        getCurrentAddress().sendKeys(address);
    }
    public void setPermanentAddress (String address) {
        getPermanentAddress().sendKeys(address);
    }

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

   /* public String getResultName () {
        return getDriver().findElement(resultName).getText();
    }
    public String getResultEmail () {
        return getDriver().findElement(resultEmail).getText();
    }
    public String getResultCAddress () {
        return getDriver().findElement(resultCurrAddress).getText();
    }
    public String getResultPermAddress() {
        return getDriver().findElement(resultPermAddress).getText();
    } */

    public String getAllResult () {
        return getDriver().findElement(resultAL).getText();
    }
}
