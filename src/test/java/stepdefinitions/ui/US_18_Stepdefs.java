package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.StudentInfoManagementPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_18_Stepdefs {
    
    LoginPage loginPage = new LoginPage();
    
    MainMenuPage mainMenuPAge =new MainMenuPage();
    
    
    StudentInfoManagementPage studentInfoManagementPage=new StudentInfoManagementPage();
    
    
    
    
    
    
    
    @Given("Thet teacher navigates to {string}")
    public void thetTeacherNavigatesTo(String HomeUrl) {
        Driver.getDriver().get(HomeUrl);
        
        WaitUtils.waitFor(1);
    }
    
    @And("Thet teacher clicks on Login button on homepage")
    public void thetTeacherClicksOnLoginButtonOnHomepage() {
        loginPage.loginButtonMainPage.click();
        
        WaitUtils.waitFor(1);
    }
    
    @And("Thet teacher enters the username")
    public void thetTeacherEntersTheUsername() {
        loginPage.userName.sendKeys("İbrahim3");
        
        WaitUtils.waitFor(1);
    }
    
    @And("Thet teacher enters the password")
    public void thetTeacherEntersThePassword() {
        loginPage.password.sendKeys("ibrahim33A");
        
        WaitUtils.waitFor(1);
    }
    
    @And("Thet teacher clicks on Login button")
    public void thetTeacherClicksOnLoginButton() {
        loginPage.loginButton.click();
        WaitUtils.waitFor(1);
    }
    
    @When("Thet teacher sees Student Info Management page")
    public void thetTeacherSeesStudentInfoManagementPage() {
        assertTrue(studentInfoManagementPage.headOfStudentInfoManagement.isDisplayed());
        WaitUtils.waitFor(2);
    }
    
    @And("Thet teacher sees Student Info List")
    public void thetTeacherSeesStudentInfoList() {
        assertTrue(studentInfoManagementPage.addStudentInfoStudentInfoManagement.isDisplayed());
        WaitUtils.waitFor(2);
    }
    
    @And("Thet teacher sees Student")
    public void thetTeacherSeesStudent() {
        assertTrue(studentInfoManagementPage.studentInfoManagementName.isDisplayed());
        WaitUtils.waitFor(2);

    }

    @And("Thet teacher clicks Edit button")
    public void thetTeacherClicksEditButton() {
        BrowserUtils.clickWithTimeOut(studentInfoManagementPage.chooseButtonEditStudentInfoManagement,2);
        WaitUtils.waitFor(2);
    }

    @And("Thet teacher sees Edit Student Info Menu")
    public void thetTeacherSeesEditStudentInfoMenu() {

        studentInfoManagementPage.editStudentInfoStudentInfoManagement.isDisplayed();
        WaitUtils.waitFor(2);
        
               }
    @And("Thet teacher select choose lesson Edit Student Info Menu")
    public void thetTeacherSelectChooseLessonEditStudentInfoMenu() {
        studentInfoManagementPage.editMenuChooseLessonStudentInfoManagement.click();
        WaitUtils.waitFor(2);
    }
    
    @And("Thet teacher select education term Edit Student Info Menu")
    public void thetTeacherSelectEducationTermEditStudentInfoMenu() {
        
        studentInfoManagementPage.editMenuChooseEducationTermStudentInfoManagement.click();
        
        WaitUtils.waitFor(2);
    }
    @And("Thet teacher enters Absentee")
    public void thetTeacherEntersAbsentee() {
        
        studentInfoManagementPage.editMenuChooseEducationTermStudentInfoManagement.click();
        
        
        WebElement absenteeELement=studentInfoManagementPage.editMenuEnterAbsenteeStudentInfoManagement;
                      absenteeELement.sendKeys("",Keys.TAB);
        
        WaitUtils.waitFor(2);
    }

    @And("Thet teacher enters Midterm Exam")
    public void thetTeacherEntersMidtermExam() {
        studentInfoManagementPage.editMenuEnterMidtermStudentInfoManagement.sendKeys("50",Keys.TAB);
        WaitUtils.waitFor(2);
    }

    @And("Thet teacher enters Final Exam")
    public void thetTeacherEntersFinalExam() {
        studentInfoManagementPage.editMenuEnterFinalExamStudentInfoManagement.sendKeys("77",Keys.TAB);
        WaitUtils.waitFor(2);
    }

    @And("Thet teacher enters Info Note")
    public void thetTeacherEntersInfoNote() {
        studentInfoManagementPage.editMenuEnterInfoNoteStudentInfoManagement.sendKeys("asfassdas1515",Keys.TAB);
        WaitUtils.waitFor(2);
    }

    @And("Thet teacher clicks Submit Button")
    public void thetTeacherClicksSubmitButton() {
        studentInfoManagementPage.chooseSubmitbuttomEditStudentInfoManagement.click();
        WaitUtils.waitFor(2);
    }
    
    

    @And("Thet teacher must see {string} message")
    public void thetTeacherMustSeeMessage(String expectedResult) {
        assertEquals(expectedResult,"Student Info Updated Succesfully");
        WaitUtils.waitFor(5);
    }

    @And("tdClose driver")
    public void tdcloseDriver() {
        Driver.closeDriver();
    }

    //TC_02
    
    @When("Theti teacher sees Student Info Management page")
    public void thetiTeacherSeesStudentInfoManagementPage() {
        assertTrue(studentInfoManagementPage.headOfStudentInfoManagement.isDisplayed());
        WaitUtils.waitFor(2);
    }

   
        
    

    @And("Theti teacher sees Student Info List")
    public void thetiTeacherSeesStudentInfoList() {
        assertTrue(studentInfoManagementPage.addStudentInfoStudentInfoManagement.isDisplayed());
        WaitUtils.waitFor(2);
    }

    @And("Theti teacher sees Student")
    public void thetiTeacherSeesStudent() {
        assertTrue(studentInfoManagementPage.studentInfoManagementName.isDisplayed());
        WaitUtils.waitFor(2);
    }

    @And("Theti teacher clicks Edit button")
    public void thetiTeacherClicksEditButton() {
        BrowserUtils.clickWithTimeOut(studentInfoManagementPage.chooseButtonEditStudentInfoManagement,2);
        WaitUtils.waitFor(2);
    }
    @And("Theti teacher sees Edit Student Info Menu")
    public void thetiTeacherSeesEditStudentInfoMenu() {
        studentInfoManagementPage.editStudentInfoStudentInfoManagement.isDisplayed();
        WaitUtils.waitFor(2);
    }

    @And("Theti teacher enters Absentee")
    public void thetiTeacherEntersAbsentee() {studentInfoManagementPage.editMenuChooseEducationTermStudentInfoManagement.click();
        
        
        WebElement absenteeELement=studentInfoManagementPage.editMenuEnterAbsenteeStudentInfoManagement;
        absenteeELement.sendKeys("",Keys.TAB);
        
        WaitUtils.waitFor(2);
    }

    @And("Theti teacher enters Midterm Exam")
    public void thetiTeacherEntersMidtermExam() {
        studentInfoManagementPage.editMenuEnterMidtermStudentInfoManagement.sendKeys("1000",Keys.TAB);
        WaitUtils.waitFor(2);
    }

    @And("Theti teacher enters Final Exam")
    public void thetiTeacherEntersFinalExam() {
        studentInfoManagementPage.editMenuEnterFinalExamStudentInfoManagement.sendKeys("0",Keys.TAB);
        WaitUtils.waitFor(2);
        
    }

    @And("Theti teacher enters Info Note")
    public void thetiTeacherEntersInfoNote() {
        studentInfoManagementPage.editMenuEnterInfoNoteStudentInfoManagement.sendKeys("asfaaasdaasda1515",Keys.TAB);
        WaitUtils.waitFor(2);
    }
    

    @And("Theti teacher clicks Submit Button")
    public void thetiTeacherClicksSubmitButton() {
        studentInfoManagementPage.chooseSubmitbuttomEditStudentInfoManagement.click();
        WaitUtils.waitFor(2);
    }

    @And("Theti teachers must see javascript pop-up message {string} message")
    public void thetiTeachersMustSeeJavascriptPopUpMessageMessage(String expectedResult) {
        assertEquals(expectedResult, "'100.0' değerinden küçük yada eşit olmalı");
        WaitUtils.waitFor(5);
        
    }
    @And("Theti close driver")
    public void thetiCloseDriver() {
        Driver.closeDriver();
    }
    
    
    
}
