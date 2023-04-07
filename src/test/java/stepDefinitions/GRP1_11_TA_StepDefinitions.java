package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.GRP1_11_TA;

public class GRP1_11_TA_StepDefinitions {

    GRP1_11_TA e11 = new GRP1_11_TA();

    @Then("Verify that Add User heading is displayed")
    public void verifyThatAddUserHeadingIsDisplayed() {
        e11.verifyContainsTextFunction(e11.addUserText, "Add User");

    }
}
