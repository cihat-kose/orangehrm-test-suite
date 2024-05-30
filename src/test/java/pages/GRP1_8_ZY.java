package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

// LeftNav olarak kullnilacak
// sol taraftaki menuler burda

public class GRP1_8_ZY extends Parent {

    public GRP1_8_ZY() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//span[text()='Admin']")
    public WebElement Admin;

    public WebElement getWebElement(String strButton){
        switch (strButton)
        {
            case "Admin" : return Admin;
        }
        return null;
    }
}
