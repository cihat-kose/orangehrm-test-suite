package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

// DialogContent olarak kullnilacak
// kullanıcı ile dialogla veri alan bölümler

public class GRP1_13_ZY extends Parent {
    public GRP1_13_ZY() {PageFactory.initElements(GWD.getDriver(), this);}


    @FindBy(css = "input[placeholder='Username']")
    public static WebElement username;

    @FindBy(css="input[placeholder='Password']")
    public static WebElement loginPassword;

    @FindBy(css="button[type='submit']")
    public static WebElement loginButton;

    @FindBy(xpath="//span[text()='User Management ']")
    public static WebElement UserManagment;
    @FindBy(xpath="//button[text()=' Add ']")
    public static WebElement addButton;

    @FindBy(xpath="(//input[@autocomplete='off'])[1]")
    public static WebElement userNameInput;

    @FindBy(xpath="//span[text()='Already exists']")
    public WebElement alreadyExistMessage;

    @FindBy(xpath ="//input[@type='password'][1]")
    public static WebElement userPassword;

    @FindBy(xpath="//span[text()='Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password']")
    public WebElement lowerCaseMessage;

    ////span[ contains(text(),'must contain a lower-case letter')]

    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "UserManagment": return UserManagment;
            case "addButton": return addButton;
            case "userNameInput": return userNameInput;
            case "userPassword": return userPassword;

        }

        return null;
    }


 }
