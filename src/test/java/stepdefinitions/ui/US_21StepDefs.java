package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GradesAndAnnouncementsPage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.ConfigReader;
import utilities.WaitUtils;

public class US_21StepDefs {

    LoginPage loginPage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    GradesAndAnnouncementsPage gradesAndAnnouncementsPage = new GradesAndAnnouncementsPage();

    @And("User enters User Name as student")
    public void userEntersUserNameAsStudent() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("student_name"));
        WaitUtils.waitFor(1);

    }

    @And("User enters Password as student")
    public void userEntersPasswordAsStudent() {
        loginPage.password.sendKeys(ConfigReader.getProperty("student_password"));
        WaitUtils.waitFor(1);
    }

    @When("User clicks on menu as student")
    public void userClicksOnMenuAsStudent() {
        mainMenuPage.menuButton.click();
        WaitUtils.waitFor(1);
    }

    @Then("User verify that sees Choose Lesson, Grade and Announcements and log out")
    public void userVerifyThatSeesChooseLessonGradeAndAnnouncementsAndLogOut() {
        Assert.assertTrue(mainMenuPage.chooseLessonInsideMenu.isDisplayed());
        Assert.assertTrue(mainMenuPage.gradeAndAnnouncementsInsideMainMenuOfStudent.isDisplayed());
        Assert.assertTrue(mainMenuPage.logoutInsideMenu.isDisplayed());
        WaitUtils.waitFor(10);
    }

    @And("User clicks on Grades and Announcements")
    public void userClicksOnGradesAndAnnouncements() {
        mainMenuPage.gradeAndAnnouncementsInsideMainMenuOfStudent.click();
        WaitUtils.waitFor(2);
    }

    @Then("User verifies that there is no lesson to choose")
    public void userVerifiesThatThereIsLessonToChoose() {
        Assert.assertFalse(mainMenuPage.chooseLessonInsideMenu.isDisplayed());
        WaitUtils.waitFor(1);
    }
}
