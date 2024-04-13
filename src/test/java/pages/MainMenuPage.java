package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainMenuPage {
    public MainMenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Admin Management']")
    public WebElement adminManagementInsideMenu;

    @FindBy(xpath = "//a[text()='Dean Management']")
    public WebElement deanManagementInsideMenu;

    @FindBy(xpath =  "//a[text()='Vice Dean Management']")
    public WebElement viceDeanManagementInsideMenu;

    @FindBy(xpath = "//a[text()='Lesson Management']")
    public WebElement lessonManagementInsideMenu;

    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagementInsideMenu;

    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentManagementInsideMenu;

    @FindBy(xpath = "//a[text()='Student Info Management']")
    public WebElement studentInfoManagementInsideMenu;

    @FindBy(xpath = "//a[text()='Meet Management']")
    public WebElement meetManagementInsideMenu;

    @FindBy(xpath = "//a[text()='Choose Lesson']")
    public WebElement chooseLessonInsideMenu;

    @FindBy(xpath = "//a[text()='Contact Get All']")
    public WebElement contactGetAllInsideMenu;

    @FindBy(xpath = "//a[text()='Guest User']")
    public WebElement guestUserInsideMenu;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutInsideMenu;

    @FindBy(xpath = "//a[.='Grades and Announcements']")
    public WebElement gradeAndAnnouncementsInsideMainMenuOfStudent;

    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement yesForLogout;



}
