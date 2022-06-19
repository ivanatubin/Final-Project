package pages.bookstore;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StorePage extends BasePage {
    private By bookName = By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a");
    private By addToCollection = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]");
    private By profileBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]");
    private By deleteBtn = By.id("delete-record-undefined");

    private By logout = By.id("submit");

    /**
     *Method finds logout button and click on it
     */
    public void logout () {
        getWElogout().click();
    }

    /**
     * Method finds the book by title and add it to collection
     */
    public void addToCollection (String book) {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(By.linkText(book)));
        getDriver().findElement(By.linkText(book)).click();
        scroll();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(addToCollection));
        scroll();
        getDriver().findElement(addToCollection).click();
        getDriverWait().until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();
    }

    /**
     *Method navigates to profile
     */
    public void goToProfile () {
        getDriver().navigate().to("https://demoqa.com/profile");
    }

    /**
     * Method checks is book in collection by book title
     */
    public boolean isBookInTable (String title) {
        List<WebElement> listaRedova = getDriver().findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div"));

        for (WebElement we: listaRedova) {
            if (we.getText().contains(title)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method delete book from collection
     */
    public void deleteBookFromCollection () {
        scroll();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(deleteBtn));
        getDriver().findElement(deleteBtn).click();
        getDriver().findElement(By.id("closeSmallModal-ok")).click();
        getDriverWait().until(ExpectedConditions.alertIsPresent());
    }

    /**
     * Method returns text from alert
     */
    public String getAlertText () {
        return getDriver().switchTo().alert().getText();
    }


    /**
     * Get method for web element by locator logout
     */
    public WebElement getWElogout () {
        return getDriver().findElement(logout);
    }

    public StorePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
