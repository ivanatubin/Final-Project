package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FormTests extends BaseTest {

    /**
     * Verify correct output after subbmitting form with required fields
     * */
    @Test
    public void verifySubmittingFormOnlyRequiredFields () {
        getHomePage().goToForms();
        getFormsPage().checkPracticeForm();
        getFormsPage().fillFormReqired(firstName(),lastName(),"male","0000000000");
        Assert.assertEquals(getFormsPage().getMessage(),"Thanks for submitting the form");
        Assert.assertEquals(getFormsPage().mobileResult(),"0000000000");
        Assert.assertEquals(getFormsPage().nameResult(),"Petar Petrovic");
    }
}
