package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminManagementPage {
    public AdminManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3[@bg='primary']")
    public WebElement headOfAdminManagement;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleGender;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleGender;
    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[text()='Admin Saved']")
    public WebElement adminsavedMessage;

    @FindBy(xpath = "//div[text()='At least 8 characters']")
    public WebElement AtLeast8CharectersMessage;

    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public WebElement EnterValidSSNNumberMessage;

    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement ListLastPartButton;

    @FindBy(xpath = "//div[text()='Vice dean Saved']")
    public WebElement ViceDeanSavedMessage;


    @FindBy(xpath = "//div[text()='Required']")
    public WebElement RequiredMessageUnderUsername;


    @FindBy(xpath = "//div[text()='One number']")
    public WebElement OnenumberMessageUnderPassword;


    @FindBy(xpath = "//table//tbody//td//button")
    public WebElement deleteAdminButton;




}
