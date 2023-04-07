package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GRP1_6_TA;
import utilities.GWD;

public class GRP1_6_TA_StepDefinitions {

    GRP1_6_TA e6 = new GRP1_6_TA();
    @Given("Navigate to site")
    public void navigateToSite() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Then("Login as Admin")
    public void loginAsAdmin() {
        e6.sendKeysFunction(e6.username,"Admin");
        e6.sendKeysFunction(e6.password,"admin123");
        e6.clickFunction(e6.login);
    }


    @And("Click Add button")
    public void clickAddButton() {
        e6.clickFunction(e6.addButton);
    }

    @And("Enter an Invalid name in to the Employee name field")
    public void enterAnInvalidNameInToTheEmployeeNameField() {
        e6.sendKeysFunction(e6.employeeName,"Haydar");


    }

    @Then("verify that notification messages “no records found” and “invalid” in red color displayed.")
    public void verifyThatNotificationMessagesNoRecordsFoundAndInvalidInRedColorDisplayed() {

        e6.verifyContainsTextFunction(e6.noRecordsFound,"No");
        e6.clickFunction(e6.boslukAdmin);
        e6.verifyContainsTextFunction(e6.invalid,"Invalid");

    }


    @And("Navigate to Admin page")
    public void navigateToAdminPage() {
        e6.clickFunction(e6.navAdmin);
    }

}
