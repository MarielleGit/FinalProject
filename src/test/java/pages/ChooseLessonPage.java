package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseLessonPage {
    public ChooseLessonPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//tr//th)[1]")
    public WebElement chooseLessonChooseLesson;
    @FindBy(xpath = "(//tr//th)[2]")
    public WebElement chooseLessonLesson;
    @FindBy(xpath = "(//tr//th)[3]")
    public WebElement chooseLessonTeacher;
    @FindBy(xpath = "(//tr//th)[4]")
    public WebElement chooseLessonDay;
    @FindBy(xpath = "(//tr//th)[5]")
    public WebElement chooseLessonStartTime;
    @FindBy(xpath = "(//tr//th)[6]")
    public WebElement chooseLessonStopTime;
    @FindBy(xpath = "(//tr//th)[7]")
    public WebElement chooseLessonLessonProgramListLesson;
    @FindBy(xpath = "(//tr//th)[8]")
    public WebElement chooseLessonLessonProgramListDay;
    @FindBy(xpath = "(//tr//th)[9]")
    public WebElement chooseLessonLessonProgramStartTime;
    @FindBy(xpath = "(//tr//th)[10]")
    public WebElement chooseLessonLessonProgramStopTime;
    @FindBy(xpath = "(//input[@id='lessonProgramId'])[1]")
    public WebElement chooseLessonChooseLessonBox; //the number is change for every different box
    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement chooseLessonChooseLessonSubmitButton;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement chooseLessonSuccessMessage;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement chooseLessonErrorMessage;


}
