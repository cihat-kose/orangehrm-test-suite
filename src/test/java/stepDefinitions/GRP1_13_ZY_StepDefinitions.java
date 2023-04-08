package stepDefinitions;

import io.cucumber.java.en.*;
import pages.GRP1_13_ZY;
import pages.GRP1_8_ZY;

public class GRP1_13_ZY_StepDefinitions {

    GRP1_13_ZY dc= new GRP1_13_ZY();
    GRP1_8_ZY ln=new GRP1_8_ZY();

    @Then("Notification messages “... password must contain a lower-case letter ... ” should be displayed.")
    public void notificationMessagesPasswordMustContainALowerCaseLetterShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.lowerCaseMessage,"must contain a lower-case letter");

    }


}
