package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTest{

    @BeforeMethod
    public void beforeRadioButton () {
        getHomePage().goToElements();
        getElementsPage().chooseRadioBtn();
    }

    /**
     * Verify that fields impressive and no are not selected when field yes is checked
     */
    @Test
    public void verifyRadioButtonYes () {
        getRadioButtonPage().chooseYes();
        Assert.assertTrue(getRadioButtonPage().isYesSelected());
        Assert.assertFalse(getRadioButtonPage().weImpressive().isSelected());
        Assert.assertFalse(getRadioButtonPage().weNo().isSelected());
        Assert.assertEquals(getRadioButtonPage().getMessage(),"You have selected Yes");
    }

    /**
     * Verify that fields yes and no are not selected when impressive is checked
     */
    @Test
    public void verifyRadioButtonImpressive () {
        getRadioButtonPage().chooseImpressive();
        Assert.assertFalse(getRadioButtonPage().isYesSelected());
        Assert.assertTrue(getRadioButtonPage().isImpressiveSelected());
        Assert.assertFalse(getRadioButtonPage().weNo().isSelected());
        Assert.assertEquals(getRadioButtonPage().getMessage(),"You have selected Impressive");
    }

    /**
     * Verify that field No is not selectable
     */
    @Test
    public void verifyNO () {
        Assert.assertFalse(getRadioButtonPage().weNo().isEnabled());
    }

}
