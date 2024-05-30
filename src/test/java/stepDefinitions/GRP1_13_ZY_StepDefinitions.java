package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.GRP1_13_ZY;
import pages.GRP1_8_ZY;

public class GRP1_13_ZY_StepDefinitions {

    GRP1_13_ZY dc = new GRP1_13_ZY();
    GRP1_8_ZY ln = new GRP1_8_ZY();

    @Then("Notification messages “... password must contain minimum 1 lower-case letter ... ” should be displayed.")
    public void notificationMessagesPasswordMustContainMinimum1LowerCaseLetterShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.lowerCaseMessage, "Your password must contain minimum 1 lower-case letter");
    }
}
