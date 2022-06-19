package pages.elementspages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ButtonsPage extends BasePage {

    private By doubleClickMe = By.xpath("//*[@id=\"doubleClickBtn\"]");
    private By doubleClickMessage = By.id("doubleClickMessage");
    private By rightClick = By.id("rightClickBtn");
    private By rightClickMess = By.id("rightClickMessage");
    private By click = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    private By clickMess = By.id("dynamicClickMessage");
    private By commercial = By.id("Ad.Plus-728x90");


    /**
     * Method returns visible message after click
     */
    public String getTextClickMessage () {
        return getClickMessage().getText();
    }

    /**
     * Method clicks on click button
     */
    public void click () {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(commercial));
        scroll();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(click));
        getClick().click();
    }
    /**
     * Method right clicks on right-click button
     */
    public void rightClick () {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(commercial));
        getDriverWait().until(ExpectedConditions.elementToBeClickable(rightClick));
        Actions actions = new Actions(getDriver());
        actions.contextClick(getRightClick()).perform();
    }

    /**
     * Method double-clicks on double-click button
     */
    public void doubleClick () {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(commercial));
        getDriverWait().until(ExpectedConditions.elementToBeClickable(doubleClickMe));
        Actions actions = new Actions(getDriver());
        actions.doubleClick(getDoubleClickMe()).perform();
    }

    /**
     * Method returns visible message after right clik
     */
    public String getMessageRightClick () {
        return getRightClickMessage().getText();
    }

    /**
     * Method returns visible message after double-click
     */
    public String getMessageDoubleClick () {
       return getDoubleClickMessage().getText();
    }

    /**
     * Get method for web element by locator doubleClickMe
     */
    public WebElement getDoubleClickMe () {
        return getDriver().findElement(doubleClickMe);
    }
    /**
     * Get method for web element by locator doubleClickMessage
     */
    public WebElement getDoubleClickMessage () {
        return getDriver().findElement(doubleClickMessage);
    }
    /**
     * Get method for web element by locator rightClick
     */
    public WebElement getRightClick () {
        return getDriver().findElement(rightClick);
    }
    /**
     * Get method for web element by locator rightClickMess
     */
    public WebElement getRightClickMessage () {
        return getDriver().findElement(rightClickMess);
    }
    /**
     * Get method for web element by locator click
     */
    public WebElement getClick () {
        return getDriver().findElement(click);
    }
    /**
     * Get method for web element by locator clickMess
     */
    public WebElement getClickMessage () {
        return getDriver().findElement(clickMess);
    }



    public ButtonsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
