package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestUserPage {

    public GuestUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Guest User List']")
    public WebElement guestUserListVisible;

    @FindBy(xpath = "//*[text()='Name']")
    public WebElement nameOfTheGuestUserListVisible;

    @FindBy(xpath = "//*[text()='Phone Number']")
    public WebElement phoneNumberOfTheGuestUserListVisible;

    @FindBy(xpath = "//*[text()='Ssn']")
    public WebElement ssnOfTheGuestUserListVisible;

    @FindBy(xpath = "//*[text()='User Name']")
    public WebElement userNameOfTheGuestUserListVisible;

    @FindBy(xpath = "(//*[@type='button'])[5]")
    public WebElement deleteOfTheGuestUserListVisible;

//    @FindBy(xpath = "(//*[text()='Guest User Deleted Successful')")
//    public WebElement deleteOfTheGuestUserListVisible;

    @FindBy(xpath = "//*[text()=' Guest User deleted Successful']")
    public WebElement deleteOfTheGuestUserListMessage;







}
