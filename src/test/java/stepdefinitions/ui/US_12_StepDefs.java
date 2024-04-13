package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.ViceDeanManagementPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US_12_StepDefs {

    LoginPage loginPage = new LoginPage();
    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();

    Actions actions = new Actions(Driver.getDriver());

    @And("User clicks on Login button on homepage")
    public void userClicksOnLoginButtonOnHomepage() {
        loginPage.loginButtonMainPage.click();
    }

    @And("User types the username of his Vice Dean account")
    public void userTypesTheUsernameOfHisViceDeanAccount() {
        loginPage.userName.sendKeys("ViceDeanIrfan");
    }

    @And("User types the password of his Vice Dean account")
    public void userTypesThePasswordOfHisViceDeanAccount() {
        loginPage.password.sendKeys("ViceIrfan05");
    }

    @And("User clicks on the Login button")
    public void userClicksOnTheLoginButton() {
        loginPage.loginButtonBlue.click();
    }

    @When("User clicks on Lesson Program part")
    public void userClicksOnLessonProgramPart() {
        viceDeanManagementPage.viceDeanLessonProgram.click();
        WaitUtils.waitFor(2);
    }

    @And("User chooses a lesson from Lesson Program Assignment part")
    public void userChoosesALessonFromLessonProgramAssignmentPart() {
        JSUtils.JSclickWithTimeout(viceDeanManagementPage.viceDeanChooseLesson);
        WaitUtils.waitFor(2);

    }

    @And("User scrolls down to choose a teacher")
    public void userScrollsDown() {

        actions.moveToElement(viceDeanManagementPage.viceDeanChooseTeacher);
        WaitUtils.waitFor(1);

    }

    @And("User scrolls down to choose a lesson")
    public void userScrollsDownToChooseALesson() {
        actions.moveToElement(viceDeanManagementPage.viceDeanChooseLesson).click();
        WaitUtils.waitFor(1);
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        JSUtils.JSclickWithTimeout(viceDeanManagementPage.viceDeanLessonProgramSubmit);
        WaitUtils.waitFor(1);
    }

    @Then("User must see Lesson added to Teacher message")
    public void userMustSeeLessonAddedToTeacherMessage() {
        Assert.assertTrue(viceDeanManagementPage.viceDeanLessonAddedToTeacherMessage.isDisplayed());
    }

    @Then("User must see The given id must not be null! message")
    public void userMustSeeTheGivenIdMustNotBeNullMessage() {
        WaitUtils.waitForVisibility(viceDeanManagementPage.viceDeanLessonProgramIdMustNotBeNullMessage,4);
        Assert.assertTrue("The given id must not be null!", viceDeanManagementPage.viceDeanLessonProgramIdMustNotBeNullMessage.getText().contains("The given id must not be null!"));
    }

    @And("User closes the page")
    public void userClosesThePage() {
        Driver.closeDriver();
    }

    @And("User clicks on choose teacher button and selects a teacher from the menu")
    public void userClicksOnChooseTeacherButtonAndSelectsATeacherFromTheMenu() {
        JSUtils.JSclickWithTimeout(viceDeanManagementPage.viceDeanChooseTeacher);
        WaitUtils.waitFor(2);
        Select select = new Select(viceDeanManagementPage.viceDeanChooseTeacher);
        select.selectByValue("5318");
    }
}
