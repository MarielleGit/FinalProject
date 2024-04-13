package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanManagementPage {

    public DeanManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

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
    @FindBy(xpath = "//h3[text()='Education Term Management']")
    public WebElement headOfEducationTermManagement;
    @FindBy(xpath = "//h5[text()='Education Term List']")
    public WebElement headOfEducationTermList;
    @FindBy(id = "term")
    public WebElement chooseEducationTerm;
    @FindBy(id = "startDate")
    public WebElement startDate;
    @FindBy(id = "endDate")
    public WebElement endDate;
    @FindBy(id = "lastRegistrationDate")
    public WebElement lastRegistrationDate;
    @FindBy(xpath = "(//span[text()='FALL_SEMESTER'])[1]")
    public WebElement educationTermFirstLine;
    @FindBy(xpath = "(//span[text()='2025-04-10'])[1]")
    public WebElement startDateFirstLine;
    @FindBy(xpath = "(//span[text()='2025-09-10'])[1]")
    public WebElement endDateFirstLine;
    @FindBy(xpath = "(//span[text()='2025-04-10'])[2]")
    public WebElement lastRegistrationDateFirstLine;
    @FindBy(xpath = "//div[text()='Dean Saved']")
    public WebElement successMessageDeanSaved;
    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public  WebElement invalidSsnMessageDeanSaved;
    @FindBy(xpath = "//div[text()='Phone number should be exact 12 characters']")
    public  WebElement invalidPhoneMessageDeanSaved;
    @FindBy(xpath = "(//div[text()='Please enter valid phone number'])[1]")
    public  WebElement invalidPhoneMessageDean;
    @FindBy(xpath = "//*[text()='Vice dean Saved']")
    public WebElement alertMessage;

    //Edit Part
    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement editDeanName;
    @FindBy(xpath = "(//input[@id='surname'])[2]")
    public WebElement editDeanSurname;
    @FindBy(xpath = "(//input[@id='birthPlace'])[2]")
    public WebElement editDeanBirthPlace;
    @FindBy(xpath = "(//input[@value='FEMALE'])[2]")
    public WebElement editDeanGenderFemale;
    @FindBy(xpath = "(//input[@value='MALE'])[2]")
    public WebElement editDeanGenderMale;
    @FindBy(xpath = "(//input[@id='birthDay'])[2]")
    public WebElement editDeanBirthDay;
    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement editDeanPhoneNumber;
    @FindBy(xpath = "(//input[@id='ssn'])[2]")
    public WebElement editDeanSsn;
    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement editDeanUsername;
    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement editDeanPassword;
    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement editDeanSubmitButton;
    @FindBy(xpath = "//*[text()='Dean updated Successful']")
    public  WebElement successMessageDeanUpdated;
    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public  WebElement invalidSsnMessageDeanUpdate;
    @FindBy(xpath = "//div[text()='Please enter valid phone number']")
    public  WebElement invalidPhoneMessageDeanUpdate;
    @FindBy(xpath = "//div[text()='Your username should be at least 4 characters']")
    public  WebElement invalidUsernameMessageDeanUpdate;
    @FindBy(xpath = "//div[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']")
    public  WebElement invalidGenderMessageDeanUpdate;



//div[@class='Toastify__toast-container Toastify__toast-container--top-center']
}
