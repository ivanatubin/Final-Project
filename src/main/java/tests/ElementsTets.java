package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTets extends BaseTest{
    /**
     * Verify that filling text box with valid input returns correct data
     */
    @Test
    public void verifyFillTextBox () {
        getHomePage().goToElements();
        getElementsPage().chooseTextBox();
        getTextBoxPage().fillTextBox(firstName()+lastName(),email(),"Address","Address");

        Assert.assertEquals(getTextBoxPage().getAllResult(), "Name:PetarPetrovic\n" +
                "Email:email@email.com\n" +
                "Current Address :Address\n" +
                "Permananet Address :Address");
    }

    /**
     * Verify that when you check workspace all subsections are checked
     */
    @Test
    public void verifyThatSubsectionsAreChecked () {
        getHomePage().goToElements();
        getElementsPage().chooseCheckBox();
        getCheckBoxPage().checkWorkspace();
        Assert.assertEquals(getCheckBoxPage().getResultText(),"You have selected :\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu");
        Assert.assertTrue(getCheckBoxPage().isAllChecked());
    }


}
