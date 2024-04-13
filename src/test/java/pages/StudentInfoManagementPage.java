package pages;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.events.Event;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class StudentInfoManagementPage {
    public StudentInfoManagementPage(){PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//h3[@bg='primary']")    public WebElement headOfStudentInfoManagement;
    @FindBy(xpath = "//h5[@bg='primary']")    public WebElement addStudentInfoStudentInfoManagement;
    
    //@FindBy(xpath = "//div[text()='Edit Student Info']") public WebElement editStudentInfoMenu;

    @FindBy(xpath = "//select[@id='lessonId']") public WebElement chooseLessonStudentInfoManagement;
    
    
    @FindBy(xpath = "//select[@id='studentId']") public WebElement chooseStudentFromDropDownStudentInfoManagement;
    
     //option[@value='3288']=Adam Smith

    @FindBy(xpath = "//select[@id='studentId']") public WebElement chooseStudentStudentInfoManagement;
    @FindBy(xpath = "//select[@id='educationTermId']") public WebElement chooseEducationTermInfoManagement;

    @FindBy(id = "absentee") public WebElement chooseAbsenteeStudentTermInfoManagement;

    @FindBy(id = "midtermExam") public WebElement choosemidttermExamStudentInfoManagement;
    @FindBy(id = "finalExam") public WebElement choosefinalExamStudentInfoManagement;



    @FindBy(id = "infoNote") public WebElement chooseinfoNoteStudentInfoManagement;
    

    @FindBy(xpath = "//button[text()='Submit' ]") public WebElement chooseButtonSTudentTermInfoManagement;
    
    @FindBy(xpath = "//tbody/tr[1]/td[9]/span[1]/button[1]") public WebElement chooseButtonEditStudentInfoManagement;
    @FindBy(xpath = "//div[@class='text-center modal-title h4']") public WebElement editStudentInfoStudentInfoManagement;
    
    @FindBy(xpath = "//div[@class='mt-2 col-md-auto']//select[@id='lessonId']") public WebElement editMenuChooseLessonStudentInfoManagement;
    @FindBy(xpath = "//div[@class='mt-2 col-md-auto']//select[@id='educationTermId']") public WebElement editMenuChooseEducationTermStudentInfoManagement;
    @FindBy(xpath = "//div[@role='dialog']//div[4]//div[1]//input[1]") public WebElement editMenuEnterAbsenteeStudentInfoManagement;
    @FindBy(xpath = "//div[@role='dialog']//div[5]//div[1]//input[1]") public WebElement editMenuEnterMidtermStudentInfoManagement;
    @FindBy(xpath = "//div[@role='dialog']//div[6]//div[1]//input[1]") public WebElement editMenuEnterFinalExamStudentInfoManagement;
    @FindBy(xpath = "//div[@role='dialog']//div[7]//div[1]//input[1]") public WebElement editMenuEnterInfoNoteStudentInfoManagement;
    @FindBy(xpath = "//div[@role='dialog']//div[4]//div[1]//input[1]") public WebElement clearAbsenteeValueStudentIngoManagement;
    
    
    
    @FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='Submit']") public WebElement  chooseSubmitbuttomEditStudentInfoManagement;
    
    
    
    
    @FindBy(xpath = "(//tr/th)[1]")
    public WebElement studentInfoManagementName;
    @FindBy(xpath = "(//tr/th)[2]")
    public WebElement studentInfoManagementLessonName;
    @FindBy(xpath = "(//tr/th)[3]")
    public WebElement studentInfoManagementAbsentee;
    @FindBy(xpath = "(//tr/th)[4]")
    public WebElement studentInfoManagementMidtermExam;
    @FindBy(xpath = "(//tr/th)[5]")
    public WebElement cstudentInfoManagementFinalExam;

    @FindBy(xpath = "(//tr/th)[6]")
    public WebElement studentInfoManagementNote;

    @FindBy(xpath = "(//tr/th)[7]")
    public WebElement studentInfoManagementİnfoNote;
    @FindBy(xpath = "(//tr/th)[8]")
    public WebElement studentInfoManagementAverage;

    @FindBy(xpath = "(//a[@class='page-link'])[1]")
    public WebElement studentInfoManagementLeftForwardButton;

    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement studentInfoManagementLeftButton;

    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement studentInfoManagementRightButton;

    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement studentInfoManagementRightForwardButton;

    @FindBy(xpath = "//span[@class='page-link']")
    public WebElement studentInfoManagementNumOfPage;

    @FindBy(xpath = "//div[text()='Student Info saved Successfully']")
    public WebElement studentinfosavedMessage;

}

