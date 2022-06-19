package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonTests extends BaseTest{

    /**
     * Verify message after double-click
     */
    @Test
    public void verifyDoubleClick () {
        goToButtons();
        getButtonsPage().doubleClick();
        Assert.assertEquals(getButtonsPage().getMessageDoubleClick(),"You have done a double click");
    }

    /**
     * Verify message after right-click
     */
    @Test
    public void verifyRightClick () {
        goToButtons();
        getButtonsPage().rightClick();
        Assert.assertEquals(getButtonsPage().getMessageRightClick(),"You have done a right click");
    }

    /**
     * Verify message after click
     */
    @Test
    public void verifyClick () {
        goToButtons();
        getButtonsPage().click();
        Assert.assertEquals(getButtonsPage().getTextClickMessage(),"You have done a dynamic click");
    }
}
