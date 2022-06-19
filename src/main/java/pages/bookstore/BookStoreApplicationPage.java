package pages.bookstore;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreApplicationPage extends BasePage {
    private By login1 = By.id("login");
    private By username = By.id("userName");
    private By password = By.id("password");
    private By loginBtn = By.id("login");

    /**
     * Method sends username and password, and clicks on login
     */
    public void login (String userName, String password) {
        scroll();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(login1));
        getWELogin1().click();

        sendKeys(getWEUsername(),userName);
        sendKeys(getWEPassword(),password);

        scroll();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(loginBtn));
        getWELoginBtn().click();

    }

    /**
     * Get method for web element by locator login1
     */
    public WebElement getWELogin1() {
        return getDriver().findElement(login1);
    }

    /**
     * Get method for web element by locator username
     */
    public WebElement getWEUsername () {
        return getDriver().findElement(username);
    }
    /**
     * Get method for web element by locator password
     */
    public WebElement getWEPassword () {
        return getDriver().findElement(password);
    }

    /**
     * Get method for web element by locator loginBtn
     */
    public WebElement getWELoginBtn () {
        return getDriver().findElement(loginBtn);
    }


    public BookStoreApplicationPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
