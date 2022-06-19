package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BookStoreTests extends BaseTest {

    @AfterMethod
    public void logout (){
        getStorePage().logout();
    }

     /**
     * Verify that logout button is displayed after login
     */
    @Test
    public void verifySuccessfulLogin () {
        getHomePage().goToBookApplication();
        getBookStoreApplicationPage().login("ivana123","ivana123!+");
        Assert.assertTrue(getStorePage().getWElogout().isDisplayed());
    }

    /**
     * Verify visibility of book at table after adding it to collection
     */
    @Test
    public void verifyAddToCollectionFunctionality () {
        verifySuccessfulLogin();
        getStorePage().addToCollection("Git Pocket Guide");
        getStorePage().goToProfile();
        Assert.assertTrue(getStorePage().isBookInTable("Git Pocket Guide"));
    }

    /**
     * Verify deleting book from table functionality
     */
    @Test
    public void verifyDeleteBookFunctionality ()  {
        verifySuccessfulLogin();
        getStorePage().goToProfile();
        getStorePage().deleteBookFromCollection();
        Assert.assertEquals(getStorePage().getAlertText(),"Book deleted.");
        acceptAlert();
        Assert.assertFalse(getStorePage().isBookInTable("Git Pocket Guide"));
    }

}
