package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.GRP1_13_ZY;
import pages.GRP1_8_ZY;

import java.util.List;


public class GRP1_8_ZY_StepDefinitions {

    GRP1_13_ZY dc = new GRP1_13_ZY();
    GRP1_8_ZY ln = new GRP1_8_ZY();

    @Then("Enter username and password then click login button")
    public void enterUsernameAndPasswordThenClickLoginButton() {
        dc.sendKeysFunction(GRP1_13_ZY.username, "Admin");
        dc.sendKeysFunction(GRP1_13_ZY.loginPassword, "admin123");
        dc.clickFunction(GRP1_13_ZY.loginButton);
    }

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dt) {

        List<String> strButtons = dt.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = ln.getWebElement(strButton);
            ln.clickFunction(element);
        }
    }

    @Then("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {

        List<String> strButtons = dt.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton);
            dc.clickFunction(element);
        }
    }

    @When("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }
    }

    @Then("Notification messages “Already exists” should be displayed.")
    public void notificationMessagesAlreadyExistsShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExistMessage, "Already exists");
    }
}
