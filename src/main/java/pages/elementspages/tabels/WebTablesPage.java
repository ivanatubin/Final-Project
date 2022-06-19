package pages.elementspages.tabels;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTablesPage extends BasePage {

    private By add = By.id("addNewRecordButton");
    private By table = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]");
    private By edit = By.id("edit-record-1");
    private By firstNameFirstRow = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]");


    /**
     * Method delete row
     */
    public void deleteRow(String row) {
        getDriver().findElement(By.id("delete-record-"+row)).click();
    }

    /**
     * Method check is the entity in a table. If it is - returns yes; if it is not - returns false
     */
    public boolean isEntityInTable (String name, String lastName, String age, String email, String salary, String department) {
        List<WebElement> list = getDriver().findElement(table).findElements(By.className("rt-tr-group"));

        for (WebElement row : list) {

            if (row.getText().contains(name) && row.getText().contains(lastName) && row.getText().contains(age) &&
                    row.getText().contains(age) &&row.getText().contains(email) && row.getText().contains(salary) &&
                    row.getText().contains(department)) {return true;}
        }

            return false;
    }

    /**
     *  Method check if the name in a requested row had changed
     */
    public boolean isNameChanged(String name, String row) {
        if (getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div["+row+"]/div/div[1]")).getText().equalsIgnoreCase(name))
        {return true;}
        return false;
    }

    /**
     * Method returns web element edit icon in a row
     */
    public WebElement getEdit (String row) {
        return getDriver().findElement(By.id("edit-record-" +row ));
    }

    /**
     * Get method for web elements by locator add
     */
    public WebElement getAdd () {
      return getDriver().findElement(add);
    }

    /**
     * Method finds add icon and clicks on it
     */
    public void addNewRow () {
        getAdd().click();
    }

    public WebTablesPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
