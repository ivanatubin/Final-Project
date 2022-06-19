package pages.elementspages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage {
    private By expand = By.xpath("//*[@id=\"tree-node\"]/div/button[1]");
    private By workspace = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label");
    private By resultText = By.id("result");
    private By react = By.id("tree-node-react");
    private By angular = By.id("tree-node-angular");
    private By veu = By.id("tree-node-veu");

    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    /**
     * Get method for web element by locator workspace
     */
    public WebElement getWorkspace () {
        return getDriver().findElement(workspace);
    }
    /**
     * Get method for web element by locator expand
     */
    public WebElement getExpand () {
       return getDriver().findElement(expand);
    }
    /**
     * Get method for web element by locator resultText
     */
    public WebElement getResult () {
        return  getDriver().findElement(resultText);
    }
    /**
     * Method expands list and checks workspace
     */
    public void checkWorkspace () {
        getExpand().click();
        getWorkspace().click();
    }
    /**
     * Method returns String message
     */
    public String getResultText () {
       return getResult().getText();
    }

    /**
     * Method returns boolean is all subsections of workspace checked
     */
    public boolean isAllChecked () {
     if (getDriver().findElement(react).isSelected() && getDriver().findElement(angular).isSelected() && getDriver().findElement(veu).isSelected()) {
         return true;
     }
     return false;
    }
}
