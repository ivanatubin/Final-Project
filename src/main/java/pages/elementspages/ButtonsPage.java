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


    public String getTextClickMessage () {
        return getClickMessage().getText();
    }

    public void click () {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(commercial));
        scroll();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(click));
        getClick().click();
    }
    public void rightClick () {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(commercial));
        getDriverWait().until(ExpectedConditions.elementToBeClickable(rightClick));
        Actions actions = new Actions(getDriver());
        actions.contextClick(getRightClick()).perform();
    }
    public void doubleClick () {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(commercial));
        getDriverWait().until(ExpectedConditions.elementToBeClickable(doubleClickMe));
        Actions actions = new Actions(getDriver());
        actions.doubleClick(getDoubleClickMe()).perform();
    }

    public String getMessageRightClick () {
        return getRightClickMessage().getText();
    }
    public String getMessageDoubleClick () {
       return getDoubleClickMessage().getText();
    }


    public WebElement getDoubleClickMe () {
        return getDriver().findElement(doubleClickMe);
    }
    public WebElement getDoubleClickMessage () {
        return getDriver().findElement(doubleClickMessage);
    }
    public WebElement getRightClick () {
        return getDriver().findElement(rightClick);
    }
    public WebElement getRightClickMessage () {
        return getDriver().findElement(rightClickMess);
    }
    public WebElement getClick () {
        return getDriver().findElement(click);
    }
    public WebElement getClickMessage () {
        return getDriver().findElement(clickMess);
    }



    public ButtonsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
