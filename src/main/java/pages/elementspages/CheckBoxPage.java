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
    public WebElement getWorkspace () {
        return getDriver().findElement(workspace);
    }

    public WebElement getExpand () {
       return getDriver().findElement(expand);
    }
    public WebElement getResult () {
        return  getDriver().findElement(resultText);
    }

    public void checkWorkspace () {
        getExpand().click();
        getWorkspace().click();
    }
    public String getResultText () {
       return getResult().getText();
    }

    public boolean isAllChecked () {
     if (getDriver().findElement(react).isSelected() && getDriver().findElement(angular).isSelected() && getDriver().findElement(veu).isSelected()) {
         return true;
     }
     return false;
    }
}
