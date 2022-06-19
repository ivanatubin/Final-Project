package pages.elementspages.tabels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewRegistrationFormPage extends WebTablesPage {

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By department = By.id("department");
    private By submitBtn = By.id("submit");

    /**
     * Method adds new entity in table
     */
    public void addNew (String firstName, String lastName, String email, String age, String salary, String department) {
        addNewRow();
        sendKeys(weFirstName(),firstName);
        sendKeys(weLastName(),lastName);
        sendKeys(weEmail(),email);
        sendKeys(weAge(),age);
        sendKeys(weSalary(),salary);
        sendKeys(weDepartment(),department);
        weSubmitBtn().submit();
    }

    /**
     * Method edits first name in a row
     */
    public void editFirstName(String row, String name) {
        getEdit(row).click();
        clearField(firstName);
        sendKeys(weFirstName(),name);
        weSubmitBtn().click();
    }

    public WebElement weSubmitBtn () {
        return getDriver().findElement(submitBtn);
    }
    public WebElement weDepartment () {
        return getDriver().findElement(department);
    }
    public WebElement weSalary() {
        return getDriver().findElement(salary);
    }
    public WebElement weAge () {
        return getDriver().findElement(age);
    }
    public WebElement weEmail() {
        return getDriver().findElement(email);
    }
    public WebElement weLastName () {
        return getDriver().findElement(lastName);
    }
    public WebElement weFirstName () {
        return getDriver().findElement(firstName);
    }


    public AddNewRegistrationFormPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
