package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest{

    /**
     * Verify that a new field is added
     */
    @Test
    public void verifyAddingNewDataInTableFunctionality () {
        goToWebTables();
        getAddNewRegistrationFormPage().addNew(firstName(),lastName(),email(),"25","30000","Insurance");
        Assert.assertTrue(getWebTablesPage().isEntityInTable(firstName(), lastName(),"25",email(),"30000","Insurance"));
    }

    /**
     * Verify that the first name in the required row is edit
     */
    @Test
    public void verifyEditFirstName () {
        goToWebTables();
        getAddNewRegistrationFormPage().editFirstName("2","Sara");
        Assert.assertTrue(getWebTablesPage().isNameChanged("Sara","2"));
    }
    /**
     * Verify that a row is deleted
     */
    @Test
    public void verifyDeletingRowFunctionality() {
        goToWebTables();
        getWebTablesPage().deleteRow("3");
        Assert.assertFalse(getWebTablesPage().isEntityInTable("Kierra", "Gentry", "29" , "kierra@example.com" , "2000" , "Legal"));
    }
}
