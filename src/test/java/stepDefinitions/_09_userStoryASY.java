package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.GRP1_9_ASY;

public class _09_userStoryASY {
    GRP1_9_ASY loc9= new GRP1_9_ASY();
    @Then("Verify the visibility of addButton on the current page")
    public void verifyTheVisibilityOfAddButtonOnTheCurrentPage() {

        loc9.waitUntilVisible(loc9.addButton9);
        Assert.assertTrue(loc9.addButton9.isDisplayed());
    }
}
