package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FormsPage extends BasePage{

    private By practiceForm = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li");

    private By firstName = By.id("firstName");
    private By lastName =By.id("lastName");
    private By male = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]");
    private By female = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]");
    private By mobile = By.id("userNumber");

    private By thankMessage = By.id("example-modal-sizes-title-lg");
    private By mobileResult = By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[4]/td[2]");
    private By nameResult = By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[2]");


    public void checkPracticeForm () {
        scroll();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(practiceForm));
        getDriver().findElement(practiceForm).click();
    }

    public void fillFormReqired (String fisrtName, String lastName, String gender,  String mobile) {
        sendKeys(getFirstName(),fisrtName);
        sendKeys(getLastName(),lastName);
        if (gender.equalsIgnoreCase("male")) {getMale().click(); } else {getFemale().click();}
        getMobile().sendKeys(mobile, Keys.ENTER);
    }

    public String getMessage () {
       return getThankMessage().getText();
    }
    public String mobileResult () {
        return getMobileResult().getText();
    }

    public String nameResult () {
        return getName().getText();
    }

    public WebElement getName() {
        return getDriver().findElement(nameResult);
    }



    public WebElement getFirstName() {
        return getDriver().findElement(firstName);
    }

    public WebElement getLastName() {
        return getDriver().findElement(lastName);
    }

    public WebElement getFemale() {
        return getDriver().findElement(female);
    }
    public WebElement getMale() {
        return getDriver().findElement(male);
    }

    public WebElement getThankMessage() {
        return getDriver().findElement(thankMessage);
    }

    public WebElement getMobile() {
        return getDriver().findElement(mobile);
    }
    public WebElement getMobileResult() {
        return getDriver().findElement(mobileResult);
    }

    public FormsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
