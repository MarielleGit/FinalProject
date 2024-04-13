package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonManagementPage {

    public LessonManagementPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (id ="controlled-tab-example-tab-educationTerm")
    public WebElement educationTerm;

    @FindBy (id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessonsList;

    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgram;

    @FindBy(xpath = "//select[@id='term']")
    public WebElement chooseEducationTerm;
    @FindBy(xpath = "//input[@id='startDate']")
    public WebElement startDate;
    @FindBy(xpath = "//input[@id='endDate']")
    public WebElement endDate;
    @FindBy(xpath = "//input[@id='lastRegistrationDate']")
    public WebElement lastRegistrationDate;
    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[1]")
    public WebElement submitButtonAddEducationTerm;
    @FindBy(xpath = "(//tbody//tr//td)[1]")
    public WebElement educationTermListEducationTerm;
    @FindBy(xpath = "(//tbody//tr//td)[2]")
    public WebElement educationTermListStartDate;
    @FindBy(xpath = "(//tbody//tr//td)[3]")
    public WebElement educationTermListEndDate;
    @FindBy(xpath = "(//tbody//tr//td)[4]")
    public WebElement educationTermListLastRegistrationPage;
    @FindBy (xpath = "(//a[@class='page-link'])[1]")
    public WebElement leftForwardButton;
    @FindBy (xpath = "(//a[@class='page-link'])[2]")
    public WebElement leftButton;
    @FindBy (xpath = "(//a[@class='page-link'])[3]")
    public WebElement rightButton;
    @FindBy (xpath = "(//a[@class='page-link'])[4]")
    public WebElement rightForwardButton;
    @FindBy (xpath = "(//span[@class='page-link'])[1]")
    public WebElement numberEducationTermList;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement educationTermStartDateRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement educationTermEndDateRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement educationTermLastRegistrationDateRequired;

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement nameLessonManagement;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement nameLessonManagementRequired;
    @FindBy(xpath = "//input[@id='compulsory']")
    public WebElement compulsoryBoxLessons;
    @FindBy(id = "creditScore")
    public WebElement creditScore;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement creditScoreLessonsRequired;
    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement submitButtonLessons;
    @FindBy(xpath = "(//tr//th)[5]")
    public WebElement lessonsLessonListLessonName;
    @FindBy(xpath = "(//tr//th)[6]")
    public WebElement lessonsLessonListCompulsory;
    @FindBy(xpath = "(//tr//th)[7]")
    public WebElement lessonsLessonListCreditScore;
    @FindBy(xpath = "(//a[@class='page-link'])[5]")
    public WebElement lessonsLessonListLeftForwardButton;
    @FindBy(xpath = "(//a[@class='page-link'])[6]")
    public WebElement lessonsLessonListLeftButton;
    @FindBy(xpath = "(//a[@class='page-link'])[7]")
    public WebElement lessonsLessonListRightButton;
    @FindBy(xpath = "(//a[@class='page-link'])[8]")
    public WebElement lessonsLessonListRightForwardButton;
    @FindBy(xpath = "(//span[@class='page-link'])[2]")
    public WebElement lessonsLessonListNumOfPages;
    @FindBy(xpath = "//input[@id='react-select-2-input']")
    public WebElement lessonProgramChooseLessons;
    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement lessonProgramChooseEducationTerm;
    @FindBy(xpath = "//select[@id='day']")
    public WebElement lessonProgramChooseDay;
    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement lessonProgramStartTime;
    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement lessonProgramStopTime;
    @FindBy(xpath = "(//button[@type='button'])[30]")
    public WebElement lessonProgramSubmitButton;
    @FindBy(xpath = "(//input[@type='checkbox'])[29]")// change this number
    public WebElement lessonProgramLessonProgramAssignmentChooseLesson;
    @FindBy (xpath = "//select[@id='teacherId']")
    public WebElement lessonProgramChooseTeacher;
    @FindBy(xpath = "(//button[@type='button'])[31]")
    public WebElement lessonProgramLessonProgramAssignmentSubmitButton;
    @FindBy(xpath = "(//div[.='Error: Education Term with TERM AND YEAR already register'])[1]")
    public WebElement lessonManagementEducationTermErrorMessage;
    @FindBy(xpath = "(//div[.='Created Education Term'])[1]")
    public WebElement lessonManagementEducationTermSuccessMessage;
    @FindBy(xpath = "(//div[.='Error: Lesson with lesson name maths already register'])[3]")
    public WebElement lessonManagementLessonsErrorMessage;
    @FindBy(xpath = "//div[.='Lesson added to Teacher']")
    public WebElement lessonManagementLessonsSuccessAssignedMessage;
    @FindBy(xpath = "(//button[@class='btn btn-danger'])[1]")
    public WebElement lessonManagementLessonsDeleteButton;
    @FindBy(xpath = "(//div[.='Created Lesson Program'])[3]")
    public WebElement lessonManagementLessonsProgramSuccessMessage;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement lessonManagementLessonsProgramErrorMessage;













}
