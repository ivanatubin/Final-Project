package pages.elementspages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage {
    private By textBox = By.id("item-0");
    private By checkBox = By.id("item-1");
    private By webTables = By.xpath("//*[@id=\"item-3\"]");
    private By radioBtn = By.id("item-2");
    private By buttons = By.xpath("//*[@id=\"item-4\"]");

    /**
     * Get method for web element by locator buttons
     */
    public WebElement getButtons () {
        return   getDriver().findElement(buttons);
    }
    /**
     * Get method for web element by locator textBox
     */
    public WebElement getTextBox () {
        return   getDriver().findElement(textBox);
    }
    /**
     * Get method for web element by locator checkBox
     */
    public WebElement getCheckBox () {
        return   getDriver().findElement(checkBox);
    }
    /**
     * Get method for web element by locator webTables
     */

    public WebElement getWebTables () {
        return   getDriver().findElement(webTables);
    }
    /**
     * Get method for web element by locator radioBtn
     */

    public WebElement getRadioBtn () {
        return   getDriver().findElement(radioBtn);
    }

    /**
     * Method clicks on buttons
     */
    public void chooseButtons () { scroll();
        getButtons().click();
    }
    /**
     * Method clicks on text box
     */
    public void chooseTextBox () {
        getTextBox().click();
    }
    /**
     * Method clicks on checkbox
     */
    public void chooseCheckBox () {
        scroll();
        getCheckBox().click();
    }
    /**
     * Method clicks on webtables
     */
    public void chooseWebTables () {
        scroll();
        getWebTables().click();
    }
    /**
     * Method clicks on radio buttons
     */
    public void chooseRadioBtn () {
        scroll();
        getRadioBtn().click();
    }




    public ElementsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
