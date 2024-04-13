package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {


    public TeacherManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagement;
    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement teacherManagementAddTeacherEditButton; //the number change for different edit button
    @FindBy(xpath = "(//a[@class='page-link'])[1]")
    public WebElement teacherManagementAddTeacherLeftForward;
    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement teacherManagementAddTeacherLeftButton;
    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement teacherManagementAddTeacherRightButton;
    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement teacherManagementAddTeacherRightForwardButton;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement teacherManagementAddTeacherNameRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement teacherManagementAddTeacherSurnameRequired;
    @FindBy(xpath = "//div[text()='Required']")
    public WebElement teacherManagementAddTeacherBirthPlaceRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement teacherManagementAddTeacherEmailRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement teacherManagementAddTeacherPhoneRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement teacherManagementAddTeacherDateOfBirthRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement teacherManagementAddTeacherSsnRequired;
    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public WebElement invalidSsnmessage;
    @FindBy(id = "controlled-tab-example-tab-advisorTeachersList")
    public WebElement teacherManagementAdvisorTeacher;
    @FindBy(xpath = "(//tr//th)[5]")
    public WebElement advisorTeachersAdvisorTeachersListName;
    @FindBy(xpath = "(//tr//th)[6]")
    public WebElement advisorTeachersAdvisorTeachersListSsn;
    @FindBy(xpath = "(//a[@class='page-link'])[5]")
    public WebElement advisorTeacherAdvisorTeachersListLeftForwardButton;
    @FindBy(xpath = "(//a[@class='page-link'])[6]")
    public WebElement advisorTeacherAdvisorTeachersListLeftButton;
    @FindBy(xpath = "(//a[@class='page-link'])[7]")
    public WebElement advisorTeacherAdvisorTeachersListRightButton;
    @FindBy(xpath = "(//a[@class='page-link'])[8]")
    public WebElement advisorTeacherAdvisorTeachersListRightForwardButton;
    @FindBy(xpath = "(//span[@class='page-link'])[2]")
    public WebElement advisorTeacherAdvisorTeachersListNumOfPage;
    @FindBy(xpath = "//div[text()='Teacher saved successfully']")
    public WebElement teacherManagementAddTeacherSuccessMessage;

    @FindBy(xpath = "(//*[@type='button'])[9]")
    public WebElement teacherEditListButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement teacherManagementTeacherListErrorMessageEdit;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement teacherManagementTeacherListSuccessMessageEdit;
    @FindBy(xpath = "//*[text()='Choose Lessons']/following-sibling::div/div/div[1]//input")
    public WebElement inputLessons;

    @FindBy(xpath = "//div//input[@id='react-select-3-input']")
    public WebElement chooseLessons;
    @FindBy(id = "react-select-2-input")
    public WebElement chooseLessonsLast;

    @FindBy(xpath = "//div[text()='Java']")
    public WebElement javaOption;

    @FindBy(id = "name")
    public WebElement teacherName;

    @FindBy(id = "surname")
    public WebElement teacherSurname;

    @FindBy(id = "birthPlace")
    public WebElement teacherBirthPlace;

    @FindBy(id = "email")
    public WebElement teacherEmail;

    @FindBy(id = "phoneNumber")
    public WebElement teacherPhoneNumber;

    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacherButton;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleRadioOption;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioOption;

    @FindBy(id = "birthDay")
    public WebElement DateOfBirth;

    @FindBy(id = "ssn")
    public WebElement teacherSsn;

    @FindBy(id = "username")
    public WebElement teacherUsername;

    @FindBy(id = "password")
    public WebElement teacherPassword;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;


    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public WebElement failSsnMessage;

    // pup up teacher box

    @FindBy(xpath = "//span[text()='Rolandas']")
    public WebElement findTeachOnTheList;

    @FindBy(xpath = "(//*[@type='text'])[8]")
    public WebElement chooseLessonBox;

//    @FindBy(xpath = "//div[@id='react-select-5-placeholder']")
//    public WebElement getChooseLessonsBox;

    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement nameBox;

    @FindBy(xpath = "(//input[@id='surname'])[2]")
    public WebElement surnameBox;

    @FindBy(xpath = "//input[@value='Madrid']")
    public WebElement BirthPlaceBox;

    @FindBy(xpath = "(//input[@id='email'])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement phoneBox;

    @FindBy(xpath = "(//input[@id='ssn'])[2]")
    public WebElement ssnEditBox;

    @FindBy(xpath = "(//input[@id='isAdvisorTeacher'])[2]")
    public WebElement isAdvisorBox;

    @FindBy(xpath = "(//input[@value='MALE'])[2]")
    public WebElement maleBox;

    @FindBy(xpath = "(//input[@id='birthDay'])[2]")
    public WebElement dateOfbirthBox;

    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement usernameBox;

    @FindBy(xpath = "(//input[@placeholder='Password'])[2]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//*[@type='button'])[29]")
    public WebElement submitBox;

    @FindBy(xpath = "//div[text()='Teacher updated Successful']")
    public WebElement successMessageBox;

    @FindBy(xpath = "(//div[text()='Required'])")
    public WebElement requiredBirthPlaceMessageBOx;

    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement ListLastPartButton;



}
