package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.TeacherManagementPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepdefinitions.ui.US_13_StepDefs.teacherName;

public class US_14_StepDefs {

    Actions actions;
    LoginPage loginPage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();

    @And("finds the teacher created on the Teacher List on the page")
    public void findsTheTeacherCreatedOnTheTeacherListOnThePage() {
        WaitUtils.waitFor(2);
       // BrowserUtils.clickWithTimeOut(teacherManagementPage.ListLastPartButton,2);
        teacherManagementPage.findTeachOnTheList.getText().contains("Rolandas");
        WaitUtils.waitFor(1);
//        Assert.assertTrue(teacherManagementPage.findTeachOnTheList.isDisplayed());
    }
    @And("clicks on Edit button on the teacher name")
    public void clicksOnEditButtonOnTheTeacherName() {
        WaitUtils.waitFor(2);
        BrowserUtils.clickWithTimeOut(teacherManagementPage.teacherEditListButton,2);
        WaitUtils.waitFor(1);
    }
    @And("selects lesson on Choose Lessons on Edit Box")
    public void selectsLessonOnChooseLessonsOnEditBox() {
//        actions = new Actions(Driver.getDriver());
//        actions.doubleClick(teacherManagementPage.chooseLessonBox);
        teacherManagementPage.chooseLessonBox.sendKeys("C#",Keys.TAB);
        WaitUtils.waitFor(4);
    }
    @And("enters a valid teacher Name on Edit Box")
    public void entersAValidTeacherNameOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.nameBox.sendKeys("Juliany");
    }
    @And("enters a valid teacher Surname on Edit Box")
    public void entersAValidTeacherSurnameOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.surnameBox.sendKeys(Keys.TAB);
    }
    @And("enters a valid Birth Place on Edit Box")
    public void entersAValidBirthPlaceOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.BirthPlaceBox.sendKeys(Keys.TAB);
    }
    @And("enters a valid email address on Edit Box")
    public void entersAValidEmailAddressOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.emailBox.sendKeys("rohlla@gmail.com");
    }
    @And("enters a valid Phone number on Edit Box")
    public void entersAValidPhoneNumberOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.phoneBox.sendKeys(Keys.TAB);
    }
    @And("enters a valid SSN on Edit Box")
    public void entersAValidSSNOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.ssnEditBox.sendKeys("399-23-3956",Keys.TAB);
    }
    @And("selects the Is Advisor Teacher box on Edit Box")
    public void selectsTheIsAdvisorTeacherBoxOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.isAdvisorBox.click();
    }
    @And("selects the teacher Gender on Edit Box")
    public void selectsTheTeacherGenderOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.maleBox.click();
    }
    @And("enters a valid Date of Birth on Edit Box")
    public void entersAValidDateOfBirthOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.dateOfbirthBox.sendKeys("02/10/1945");
    }
    @And("enters a valid User Name on Edit Box")
    public void entersAValidUserNameOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.usernameBox.sendKeys(Keys.TAB);
    }
    @And("enters a valid Password on Edit Box")
    public void entersAValidPasswordOnEditBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.passwordBox.sendKeys("Abddll456@");
    }
    @And("clicks on Submit button on Edit Box")
    public void clicksOnSubmitButtonOnEditBox() {
        WaitUtils.waitFor(2);
        BrowserUtils.clickWithTimeOut(teacherManagementPage.submitBox,2);
        WaitUtils.waitFor(1);
    }
    @Then("sees the message {string} on Edit Box")
    public void seesTheMessageOnEditBox(String success_message) {
        WaitUtils.waitFor(1);
        //teacherManagementPage.successMessageBox.isDisplayed();
        assertEquals(success_message, teacherManagementPage.successMessageBox.getText());
        WaitUtils.waitFor(1);
    }
    @Then("sees {string} message on the Birth Place box")
    public void seesMessageOnTheBirthPlaceBox(String required_message) {
        WaitUtils.waitFor(2);
        assertEquals(required_message,teacherManagementPage.requiredBirthPlaceMessageBOx.getText());
        WaitUtils.waitFor(1);

    }
    @And("let the Birth Place on Edit Box empty")
    public void letTheBirthPlaceOnEditBoxEmpty() {
        teacherManagementPage.BirthPlaceBox.sendKeys(Keys.DELETE);
    }
}
