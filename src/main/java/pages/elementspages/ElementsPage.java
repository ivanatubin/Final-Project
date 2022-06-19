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


    public WebElement getButtons () {
        return   getDriver().findElement(buttons);
    }

    public WebElement getTextBox () {
        return   getDriver().findElement(textBox);
    }

    public WebElement getCheckBox () {
        return   getDriver().findElement(checkBox);
    }

    public WebElement getWebTables () {
        return   getDriver().findElement(webTables);
    }

    public WebElement getRadioBtn () {
        return   getDriver().findElement(radioBtn);
    }

    public void chooseButtons () { scroll();
        getButtons().click();
    }

    public void chooseTextBox () {
        getTextBox().click();
    }

    public void chooseCheckBox () {
        scroll();
        getCheckBox().click();
    }

    public void chooseWebTables () {
        scroll();
        getWebTables().click();
    }

    public void chooseRadioBtn () {
        scroll();
        getRadioBtn().click();
    }




    public ElementsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
