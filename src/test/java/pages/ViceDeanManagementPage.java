package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagementPage {

    public ViceDeanManagementPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement viceDeanLessonProgram;

    @FindBy (xpath = "(//*[@id=\"lessonProgramId\"])[12]")
    public WebElement viceDeanChooseLesson;
    // (//input[@id='lessonProgramId'])[5]

    @FindBy (xpath = "//select[@id='teacherId']")
    public WebElement viceDeanChooseTeacher;

    @FindBy (xpath = "(//*[text()='Submit'])[4]")
    public WebElement viceDeanLessonProgramSubmit;

    @FindBy (xpath = "//*[@role='alert']")
    public WebElement viceDeanLessonProgramIdMustNotBeNullMessage;
    ////div[text()='The given id must not be null!; nested exception is java.lang.IllegalArgumentException: The given id must not be null!']


    @FindBy (xpath = "//div[text()='Lesson added to Teacher']")
    public WebElement viceDeanLessonAddedToTeacherMessage;
    @FindBy (xpath = "//div[text()='Lesson Created']")
    public WebElement lessonCreated;

    @FindBy (xpath = "//div[text()='Error: Lesson with lesson name c++ already register']")
    public WebElement errorLessonNameAlreadyRegister;


    //MAIN THREE HEADERS EDUCATION TERM, LESSONS,LESSON PROGRAM
    @FindBy(xpath = " //*[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonsHeadButton;
    @FindBy(xpath = " //*[@id='controlled-tab-example-tab-educationTerm']")
    public WebElement educationTermHead;
    @FindBy(xpath = " //*[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgramHead;



//EDUCATION TERM MANAGEMENT
    @FindBy(xpath = "//*[@id='term']")
    public WebElement chooseEducationTerm;
    @FindBy(xpath = "//*[@id='startDate']")
    public WebElement startDate;
    @FindBy(xpath = "//*[@id='endDate']")
    public WebElement endDate;
    @FindBy(xpath = "//*[@id='lastRegistrationDate']")
    public WebElement lastRegistrationDate;
    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement submitButtonEducationTerm;

    @FindBy(xpath = "//div[text()='Lesson Created']")
    public WebElement alertMessage;

    //LESSON MANAGEMENT
    @FindBy(xpath = "//*[@id='lessonName']")
    public WebElement lessonName;
    @FindBy(xpath = "//*[@id='compulsory']")
    public WebElement compulsoryClickButton;
    @FindBy(xpath = "//*[@id='creditScore']")
    public WebElement creditScore;
    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement submitButtonLessonManagement;
    @FindBy(xpath = "(//button[@type='button'])[10]")
    public WebElement firstLessonDeleteButton;
    @FindBy(xpath = "(//a[@role='button'])[15]")
    public WebElement lessonsListFirstPage;
    @FindBy(xpath = "(//a[@role='button'])[16]")
    public WebElement lessonsListPreviousPage;
    @FindBy(xpath = "(//a[@role='button'])[17]")
    public WebElement lessonsListNextPage;
    @FindBy(xpath = "(//a[@role='button'])[18]")
    public WebElement lessonsListLastPage;



    //LESSON PROGRAM MANAGEMENT

    @FindBy(xpath = "(//div[@class=' css-13cymwt-control']")
    public WebElement selectLesson;
    @FindBy(xpath = "//*[@id='day']")
    public WebElement chooseDay;
    @FindBy(xpath = "//*[@id='educationTermId']")
    public WebElement chooseEducationTermLesson;
    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement lessonStartTime;
    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement lessonStopTime;
    @FindBy(xpath = "(//button[@type='button'])[30]")
    public WebElement lessonAddSubmitButton;
    @FindBy(xpath = "(//a[@role='button'])[19]")
    public WebElement firstPageLessonProgramList;
    @FindBy(xpath = "(//a[@role='button'])[30]")
    public WebElement previousPageLessonProgramList;
    @FindBy(xpath = "(//a[@role='button'])[30]")
    public WebElement nextPageLessonProgramList;
    @FindBy(xpath = "(//a[@role='button'])[22]")
    public WebElement lastPageLessonProgramList;

    @FindBy(xpath = "(//*[@id='lessonProgramId'])[1]")
    public WebElement firstLessonChooseButtonClick;
    @FindBy(xpath = "//*[@id='teacherId']")
    public WebElement chooseTeacherLesson;
    @FindBy(xpath = "(//button[@type='button'])[31]")
    public WebElement submitLessonProgramAssignment;

}
