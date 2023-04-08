package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Parent;
import utilities.GWD;

// POM : Page Object Model
public class GRP1_7_TA extends Parent {
    public GRP1_7_TA() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath="(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[1]")
    public WebElement adminUsername;
    @FindBy(xpath="//span[text()='Should be at least 5 characters']")
    public WebElement shouldBe5Chracters;

//    public WebElement getWebElement(String strButton){
//
//        switch (strButton)
//        {
//            case "gradeLevel2" : return gradeLevel2;
//        }
//        return null;
//    }


    public void deleteItem(String searchedText) {

    }
}
