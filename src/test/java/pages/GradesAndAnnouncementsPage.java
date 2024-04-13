package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GradesAndAnnouncementsPage {
    public GradesAndAnnouncementsPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//tr//th)[1]")
    public WebElement gradeAndAnnouncementsLessonName;
    @FindBy(xpath = "(//tr//th)[2]")
    public WebElement gradeAndAnnouncementsAbsentee;
    @FindBy(xpath = "(//tr//th)[3]")
    public WebElement gradeAndAnnouncementsMidtermExam;
    @FindBy(xpath = "(//tr//th)[4]")
    public WebElement gradeAndAnnouncementsFinalExam;
    @FindBy(xpath = "(//tr//th)[5]")
    public WebElement gradeAndAnnouncementsNote;
    @FindBy(xpath = "(//tr//th)[6]")
    public WebElement gradeAndAnnouncementsInfoNote;
    @FindBy(xpath = "(//tr//th)[7]")
    public WebElement gradeAndAnnouncementsAverage;
    @FindBy(xpath = "(//tr//th)[8]")
    public WebElement gradeAndAnnouncementsDate;
    @FindBy(xpath = "(//tr//th)[9]")
    public WebElement gradeAndAnnouncementsStartTime;
    @FindBy(xpath = "(//tr//th)[10]")
    public WebElement gradeAndAnnouncementsStopTime;
    @FindBy(xpath = "(//tr//th)[11]")
    public WebElement gradeAndAnnouncementsDescription;
    @FindBy(xpath = "(//a[@class='page-link'])[1]")
    public WebElement gradeAndAnnouncementsLeftForwardButton;
    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement gradeAndAnnouncementsLeftButton;
    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement gradeAndAnnouncementsRightButton;
    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement gradeAndAnnouncementsRightForwardButton;
    @FindBy(xpath = "(//span[@class='page-link'])")
    public WebElement gradeAndAnnouncementsNumOfPage;




}
