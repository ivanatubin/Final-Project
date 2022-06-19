package pages.elementspages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

@Getter
public class RadioButtonPage extends BasePage {
    private By yes =By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By impresive =By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By no =By.id("noRadio");
    private By message = By.className("mt-3");

    /**
     * Method returns message*/
    public String getMessage () {
        return getDriver().findElement(message).getText();
    }

    public void chooseYes (){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(yes));
        weYes().click();
        getDriverWait().until(ExpectedConditions.elementToBeSelected(By.id("yesRadio")));
    }

    public void chooseImpressive() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(impresive));
        weImpressive().click();
        getDriverWait().until(ExpectedConditions.elementToBeSelected(By.id("impressiveRadio")));
    }

    /**
     * Method returns Yes WebElement*/

    public WebElement weYes () {
       return getDriver().findElement(yes);
    }

    public boolean isYesSelected() {
        if (getDriver().findElement(By.id("yesRadio")).isSelected()) {return true;}
        return false;
    }

    public boolean isImpressiveSelected () {
        if (getDriver().findElement(By.id("impressiveRadio")).isSelected()) {return true;}
        return false;
    }

    public WebElement weImpressive() {
        return getDriver().findElement(impresive);
    }

    public WebElement weNo () {
        return getDriver().findElement(no);
    }


    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
