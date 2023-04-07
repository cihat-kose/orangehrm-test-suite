package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.GWD;

public class GRP1_5_12_HG {
    pages.GRP1_5_12_HG hg=new pages.GRP1_5_12_HG();

    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        hg.sendKeysFunction(hg.username, "Admin");
        hg.sendKeysFunction(hg.password, "admin123");
        hg.clickFunction(hg.loginBtn);

        // driver.switchTo().alert().accept();
    }
    @And("Click to Admin and click to Add Button")
    public void clickToAdminAndClickToAddButton() {
        hg.clickFunction(hg.AdminBtn);
        hg.clickFunction(hg.AddBtn);
    }
    @And("Click save button")
    public void clickSaveButton() {
        hg.clickFunction(hg.SaveBtn);
    }


    @Then("Notification messages should be displayed red color")
    public void notificationMessagesShouldBeDisplayedRedColor() {
    hg.verifyContainsTextFunction(hg.required, "Required");

    }

    @And("Enter less characters than necessary and click the save button")
    public void enterLessCharactersThanNecessaryAndClickTheSaveButton() {
        hg.sendKeysFunction(hg.pass,"deneme");
        hg.clickFunction(hg.SaveBtn);
    }

    @Then("The message Should have at least eight characters should be displayed in red.")
    public void theMessageShouldHaveAtLeastEightCharactersShouldBeDisplayedInRed() {
        hg.verifyContainsTextFunction(hg.message, "Should have at least 8 characters");
    }

}
