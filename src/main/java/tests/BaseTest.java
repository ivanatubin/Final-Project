package tests;

import pages.*;
import pages.bookstore.BookStoreApplicationPage;

import pages.bookstore.StorePage;
import pages.elementspages.*;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.elementspages.tabels.AddNewRegistrationFormPage;
import pages.elementspages.tabels.WebTablesPage;


import java.time.Duration;

@Getter
public class BaseTest {
    private WebDriver driver;
    private WebDriverWait driverWait;

    private HomePage homePage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;
    private WebTablesPage webTablesPage;
    private AddNewRegistrationFormPage addNewRegistrationFormPage;
    private ButtonsPage buttonsPage;
    private FormsPage formsPage;
    private BookStoreApplicationPage bookStoreApplicationPage;
    private StorePage storePage;
    private RadioButtonPage radioButtonPage;


    @BeforeClass
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivana\\Desktop\\Bootcamp\\chromedriver.exe");
        driver = new ChromeDriver();

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        this.homePage = new HomePage(driver,driverWait);
        this.elementsPage = new ElementsPage(driver,driverWait);
        this.textBoxPage = new TextBoxPage(driver,driverWait);
        this.checkBoxPage = new CheckBoxPage(driver,driverWait);
        this.addNewRegistrationFormPage=new AddNewRegistrationFormPage(driver,driverWait);
        this.webTablesPage = new WebTablesPage(driver,driverWait);
        this.buttonsPage = new ButtonsPage(driver,driverWait);
        this.formsPage = new FormsPage(driver,driverWait);
        this.bookStoreApplicationPage=new BookStoreApplicationPage(driver,driverWait);
        this.storePage=new StorePage(driver,driverWait);
        this.radioButtonPage = new RadioButtonPage(driver,driverWait);

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

    }
    @BeforeMethod
    public void beforeMethod () {
        driver.get("https://demoqa.com/");
    }

    @AfterClass
    public void close () {driver.close();}

    public void goToWebTables () {
        homePage.goToElements();
        elementsPage.chooseWebTables();
    }

    public void goToButtons() {
        homePage.goToElements();
        elementsPage.chooseButtons();
    }
    public String firstName () {
        return "Petar";
    }
    public String lastName () {
        return "Petrovic";
    }
    public String email () {
        return "email@email.com";
    }
    public void acceptAlert () {
        getDriver().switchTo().alert().accept();
    }
}
