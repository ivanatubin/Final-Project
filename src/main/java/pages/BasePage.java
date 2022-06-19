package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait driverWait;

    public BasePage(WebDriver driver, WebDriverWait driverWait) {
        this.driver = driver;
        this.driverWait = driverWait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    /**
     * Method scrolls down
     * */
    public void scroll () {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }

    /**
     * Method send text to web element
     * */
    public void sendKeys (WebElement we, String input) {
        we.sendKeys(input);
    }

    /**
     * Method clears field
     * */
    public void clearField(By by) {
        getDriver().findElement(by).clear();
    }

}
