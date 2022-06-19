package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    private By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By forms = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5");
    private By bookStoreApl = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");
    /**
     * Method clicks on Elements
     * */
    public void goToElements () {
        scroll();
        getElements().click();
    }
    /**
     * Method clicks on Forms
     * */
    public void goToForms () {
        scroll();
        getForms().click();
    }
    /**
     * Method clicks on Book Application
     * */
    public void goToBookApplication () {
        scroll();
        getBookStoreApl().click();
    }
    /**
     * Get method for web element by locator elements
     * */
    public WebElement getElements () {
        return getDriver().findElement(elements);
    }
    /**
     * Get method for web element by locator forms
     * */
    public WebElement getForms () {
        return getDriver().findElement(forms);
    }
    /**
     * Get method for web element by locator bookStoreApl
     * */
    public WebElement getBookStoreApl () {
        return getDriver().findElement(bookStoreApl);
    }


    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

}
