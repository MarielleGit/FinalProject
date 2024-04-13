package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.TeacherManagementPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepdefinitions.ui.US_15_StepDefs.*;

public class US_13_StepDefs {

    public static String teacherName = "Rlllonndas";
    public static String teacherUsername = "Mcclhnefl";

    public static String teacherSurname = "Mcrlqnj";
    public  static String teacherSsn = "284-22-2992";
    Actions action;




    LoginPage loginPage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();

    @And("selects Teacher Management on the menu")
    public void selectsTeacherManagementOnTheMenu() {
        WaitUtils.waitFor(3);
       // WaitUtils.waitForVisibility(teacherManagementPage.teacherManagement,2);
        JSUtils.JSclickWithTimeout(teacherManagementPage.teacherManagement);
    }

    @And("selects lesson on Choose Lessons dropdown list")
    public void selectsLessonOnChooseLessonsDropdownList() {
        WaitUtils.waitFor(2);
        teacherManagementPage.chooseLessons.click();
        action = new Actions(Driver.getDriver());

        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.chooseLessons,"Flying"+Keys.ENTER, 2);
        action.doubleClick(teacherManagementPage.chooseLessons);
        teacherManagementPage.chooseLessons.sendKeys("C#",Keys.TAB);

//       List<WebElement>elements= Driver.getDriver().findElements(By.cssSelector("#react-select-7-listbox>div>div"));
//        for (int i = 0; i < elements.size(); i++) {
//            System.out.println(elements.get(i));
//        }
    }

    @And("enters a valid teacher Name")
    public void entersAValidTeacherName() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherName.sendKeys(teacherName);
        WaitUtils.waitFor(2);
    }

    @And("enters a valid teacher Surname")
    public void entersAValidTeacherSurname() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherSurname.sendKeys(teacherSurname);
        WaitUtils.waitFor(2);
    }

    @And("enters a valid Birth Place")
    public void entersAValidBirthPlace() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherBirthPlace.sendKeys("EUA");
    }

    @And("selects the Is Advisor Teacher box")
    public void selectsTheIsAdvisorTeacherBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.isAdvisorTeacherButton.click();
    }

    @And("selects the teacher Gender")
    public void selectsTheTeacherGender() {
        WaitUtils.waitFor(2);
        teacherManagementPage.femaleRadioOption.click();
    }

    @And("enters a valid Date of Birth")
    public void entersAValidDateOfBirth() {
        WaitUtils.waitFor(2);
        teacherManagementPage.DateOfBirth.sendKeys("29/11/1991");
    }

    @And("enters a valid SSN")
    public void entersAValidSSN() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherSsn.sendKeys(teacherSsn);
    }

    @And("enters a valid UserName")
    public void entersAValidUserName() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherUsername.sendKeys(teacherUsername);
    }

    @Then("sees the message {string}")
    public void seesTheMessage(String success_message) {
        WaitUtils.waitForVisibility(teacherManagementPage.teacherManagementAddTeacherSuccessMessage,1);
        BrowserUtils.verifyElementDisplayed(teacherManagementPage.teacherManagementAddTeacherSuccessMessage);
        //assertTrue(teacherManagementPage.teacherManagementAddTeacherSuccessMessage.isDisplayed());
       // assertEquals(success_message, teacherManagementPage.teacherManagementAddTeacherSuccessMessage.getText());
    }

    @And("enters a INVALID SSN")
    public void entersAINVALIDSSN() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherSsn.sendKeys("23564589566666");
    }

    @Then("sees the error message {string}")
    public void seesTheErrorMessage(String error_message) {
//        WaitUtils.waitForVisibility(teacherManagementPage.invalidSsnmessage,4);
//        WaitUtils.waitFor(2);
//        teacherManagementPage.invalidSsnmessage.isDisplayed();
//        WaitUtils.waitFor(1);

        assertEquals(error_message, teacherManagementPage.invalidSsnmessage.getText());
        WaitUtils.waitFor(1);
    }
}
