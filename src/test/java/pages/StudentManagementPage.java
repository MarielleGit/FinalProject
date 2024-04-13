package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagementPage {


    public StudentManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentManagementOption;

    @FindBy(xpath = "//h3[text()='Student Management']")
    public WebElement headOfStudentManagement;

    //Add Student
    @FindBy (xpath = "//select")
    public WebElement chooseTeacher;

    @FindBy (xpath = "//select[@id]")
    public WebElement chooseTeacherLast;

    @FindBy (id = "name")
    public WebElement name;

    @FindBy (id = "surname")
    public WebElement surname;
    @FindBy (id = "birthPlace")
    public WebElement birthPlace;
    @FindBy (id = "email")
    public WebElement email;
    @FindBy (id = "phoneNumber")
    public WebElement phoneNumber;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleGender;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleGender;
    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;
    @FindBy(id = "ssn")
    public WebElement ssn;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "fatherName")
    public WebElement fatherName;
    @FindBy (id = "motherName")
    public WebElement motherName;
    @FindBy (id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[text()='Student saved Successfully']")
    public WebElement SuccessMessageStudentSaved;

    //Student List
    @FindBy(xpath = "//h5[text()='Student List']")
    public WebElement headOfStudentList;
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]")
    public WebElement editButtonOfFirstLine;

    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement rightDoubleArrow;  //end of the page, to find last added student

    @FindBy(xpath = "//div[text()='Student saved Successfully']")
    public WebElement successMessageStudentSaved;
    @FindBy(xpath = "//div[text()='Please enter valid email']")
    public  WebElement invalidMailMessage;
    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public  WebElement invalidSsnMessage;
    @FindBy(xpath = "//div[text()=Your username should be at least 4 characters']")
    public  WebElement invalidUsernameMessage;




    //Edit Student
    @FindBy (xpath = "(//select[@id='advisorTeacherId'])[2]")
    public WebElement editStudentChooseTeacher;
    @FindBy (xpath = "(//input[@id='name'])[2]")
    public WebElement editStudentName;
    @FindBy (xpath = "(//input[@id='surname'])[2]")
    public WebElement editStudentSurname;
    @FindBy (xpath = "(//input[@id='birthPlace'])[2]")
    public WebElement editStudentBirthPlace;
    @FindBy (xpath = "(//input[@id='email'])[2]")
    public WebElement editStudentEmail;
    @FindBy (xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement editStudentPhoneNumber;
    @FindBy (xpath = "(//input[@id='ssn'])[2]")
    public WebElement editStudentSsn;
    @FindBy (xpath = "(//input[@id='birthDay'])[2]")
    public WebElement editStudentDateOfBirth;
    @FindBy (xpath = "(//input[@value='FEMALE'])[2]")
    public WebElement editStudentGenderFemale;
    @FindBy (xpath = "(//input[@value='MALE'])[2]")
    public WebElement editStudentGenderMale;
    @FindBy (xpath = "(//input[@id='username'])[2]")
    public WebElement editStudentUsername;
    @FindBy (xpath = "(//input[@id='fatherName'])[2]")
    public WebElement editStudentFatherName;
    @FindBy (xpath = "(//input[@id='motherName'])[2]")
    public WebElement editStudentMotherName;
    @FindBy (xpath = "(//input[@id='password'])[2]")
    public WebElement editStudentPassword;
    @FindBy (xpath = "(//button[text()='Submit'])[2]")
    public WebElement editStudentSubmitButton;
    @FindBy(xpath = "//div[text()='Student updated Successfully']")
    public  WebElement successMessageStudentUpdated;
    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public  WebElement invalidSsnStudentUpdate;
    @FindBy(xpath = "//div[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']")
    public  WebElement invalidGenderMessageStudentUpdate;
    @FindBy(xpath = "//div[text()='Please select advisor teacher']")
    public  WebElement selectAdvisorFailMessageStudentUpdate;

}
