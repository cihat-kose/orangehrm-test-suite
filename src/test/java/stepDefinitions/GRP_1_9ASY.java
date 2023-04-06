package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.GRP1_9_ASY;

public class GRP_1_9ASY {

    GRP1_9_ASY locators9= new GRP1_9_ASY();

    @Then("Verify the visibility of addButton on the current page")
    public void verifyTheVisibilityOfAddButtonOnTheCurrentPage() {

        locators9.waitUntilVisible(locators9.addButton9);
        Assert.assertTrue(locators9.addButton9.isDisplayed());
    }
}
