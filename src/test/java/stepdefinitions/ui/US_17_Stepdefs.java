package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.StudentInfoManagementPage;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_17_Stepdefs {


    LoginPage loginPage = new LoginPage();

    MainMenuPage mainMenuPAge =new MainMenuPage();

    StudentInfoManagementPage studentInfoManagementPage=new StudentInfoManagementPage();

    Actions actions = new Actions(Driver.getDriver());

    @Given("The teacher navigates to {string}")
    public void theTeacherNavigatesTo(String HomeUrl) {
        Driver.getDriver().get(HomeUrl);

        WaitUtils.waitFor(1);

    }

    @And("The teacher clicks on Login button on homepage")
    public void theTeacherClicksOnLoginButtonOnHomepage() {
        loginPage.loginButtonMainPage.click();

        WaitUtils.waitFor(1);
    }

    @And("The teacher enters the username")
    public void theTeacherEntersTheUsername() {
        loginPage.userName.sendKeys("İbrahim3");

        WaitUtils.waitFor(1);
    }

    @And("The teacher enters the password")
    public void theTeacherEntersThePassword() {
        loginPage.password.sendKeys("ibrahim33A");

        WaitUtils.waitFor(1);
    }

    @And("The teacher clicks on Login button")
    public void theTeacherClicksOnLoginButton() {
        loginPage.loginButton.click();
        WaitUtils.waitFor(1);
    }
    
    // TC 01

    @When("The teacher sees Student Info Management page")
    public void theTeacherSeesStudentInfoManagementPage() {
        assertTrue(studentInfoManagementPage.chooseStudentStudentInfoManagement.isDisplayed());

        WaitUtils.waitFor(2);
    }

    @And("The teacher clicks Choose Lesson")
    public void theTeacherClicksChooseLesson() {
        Select selectlesson  =new Select(studentInfoManagementPage.chooseLessonStudentInfoManagement);
        selectlesson.selectByVisibleText("C#");
//        studentInfoManagementPage.chooseLessonStudentInfoManagement.click();
 
        WaitUtils.waitFor(2);
    }
    

    @And("The teacher clicks Choose Student")
    public void theTeacherClicksChooseStudent() {
        Select selectStudent=new Select(studentInfoManagementPage.chooseStudentFromDropDownStudentInfoManagement);
        selectStudent.selectByValue("3361");
//        studentInfoManagementPage.chooseStudentFromDropDownStudentInfoManagement.click();
        WaitUtils.waitFor(2);
    }

    @And("The teacher clicks Choose Education Term")
    public void theTeacherClicksChooseEducationTerm() {
        Select selectEducationTerm=new Select(studentInfoManagementPage.chooseEducationTermInfoManagement);
        selectEducationTerm.selectByValue("47");
        
    }

    @And("The teacher enters Absentee")
    public void theTeacherEntersAbsentee() {

        studentInfoManagementPage.chooseAbsenteeStudentTermInfoManagement.sendKeys("10", Keys.TAB);
        
         WaitUtils.waitFor(2);
    }
    @And("The teacher enters Midterm Exam")
    public void theTeacherEntersMidtermExam() {
        studentInfoManagementPage.choosemidttermExamStudentInfoManagement.sendKeys("40", Keys.TAB);
        WaitUtils.waitFor(2);
    }

    @And("The teacher enters Final Exam")
    public void theTeacherEntersFinalExam() {
        studentInfoManagementPage.choosefinalExamStudentInfoManagement.sendKeys("56", Keys.TAB);
        WaitUtils.waitFor(2);
    }

    @And("The teacher enters Info Note")
    public void theTeacherEntersInfoNote() {
        studentInfoManagementPage.chooseinfoNoteStudentInfoManagement.sendKeys("hello world, this is a test", Keys.TAB);
        WaitUtils.waitFor(5);
    }
    
    @And("teacher clicks Submit Button")
    public void teacherClicksSubmitButton() {
        studentInfoManagementPage.chooseButtonSTudentTermInfoManagement.click();
    }
    
    @And("teachers must see Student Info saved Successfully message")
    public void teachersMustSeeMessage() {
        studentInfoManagementPage.studentinfosavedMessage.isDisplayed();
        WaitUtils.waitFor(1);
    }
    
    @And("Close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }
    
    
    
    //TC_02
    @When("teacher sees Student Info Management page")
    public void teacherSeesStudentInfoManagementPage() {
                   assertTrue(studentInfoManagementPage.chooseStudentStudentInfoManagement.isDisplayed());
            WaitUtils.waitFor(2);
            
        
        
    }
    
    @And("teacher clicks Choose Lesson")
    public void teacherClicksChooseLesson() {
        Select selectlesson1  =new Select(studentInfoManagementPage.chooseLessonStudentInfoManagement);
        selectlesson1.selectByIndex(1);
        WaitUtils.waitFor(2);
    }
    
    @And("teacher clicks Choose Student")
    public void teacherClicksChooseStudent() {
        Select selectStudent1=new Select(studentInfoManagementPage.chooseStudentFromDropDownStudentInfoManagement);
        selectStudent1.selectByIndex(6);
        WaitUtils.waitFor(2);
    }
    
    @And("teacher clicks Choose Education Term")
    public void teacherClicksChooseEducationTerm() {
        Select selectEducationTerm=new Select(studentInfoManagementPage.chooseEducationTermInfoManagement);
        selectEducationTerm.selectByValue("47");
        
        
    }
    
    @And("teacher enters Absentee")
    public void teacherEntersAbsentee() {
        studentInfoManagementPage.chooseAbsenteeStudentTermInfoManagement.sendKeys("0", Keys.TAB);
        WaitUtils.waitFor(2);
    }
    
    @And("teacher enters Midterm Exam")
    public void teacherEntersMidtermExam() {
        studentInfoManagementPage.choosemidttermExamStudentInfoManagement.sendKeys("30", Keys.TAB);
        WaitUtils.waitFor(2);
    }
    
    @And("teacher enters Final Exam")
    public void teacherEntersFinalExam() {
        studentInfoManagementPage.choosefinalExamStudentInfoManagement.sendKeys("150", Keys.TAB);
        WaitUtils.waitFor(2);
    }
    
    @And("teacher enters Info Note")
    public void teacherEntersInfoNote() {
        studentInfoManagementPage.chooseinfoNoteStudentInfoManagement.sendKeys("hello world, this is a test", Keys.TAB);
        WaitUtils.waitFor(5);
    }
    @And("tteacher clicks submit button")
    public void tteacherClicksSubmitButton() {
        studentInfoManagementPage.chooseButtonSTudentTermInfoManagement.click();
        WaitUtils.waitFor(5);
    }
    
    @And("tteachers must see javascript pop-up message {string} message")
    public void tteachersMustSeeJavascriptPopUpMessageMessage(String expectedResult) {
        assertEquals(expectedResult,"'100.0' değerinden küçük yada eşit olmalı");
        WaitUtils.waitFor(5);
        
    }
    
    
    @And("cclose driver")
    public void ccloseDriver() {
        Driver.closeDriver();
    }
}
