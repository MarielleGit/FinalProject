package stepdefinitions.ui;

import io.cucumber.core.cli.Main;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ht.Le;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.LessonManagementPage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

public class US_10StepDefs {

    LoginPage loginPage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    LessonManagementPage lessonManagementPage = new LessonManagementPage();


    @Given("User should navigate to {string}")
    public void userShouldNavigateTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("Management_url"));
        WaitUtils.waitFor(1);
    }

    @And("User clicks on Login Button")
    public void userClicksOnLoginButton() {
        loginPage.loginButtonMainPage.click();
        WaitUtils.waitFor(1);
    }

    @And("User enters User Name")
    public void userEntersUserName() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("ViceDeanUsername"));
        WaitUtils.waitFor(1);
    }

    @And("User enters Password")
    public void userEntersPassword() {
        loginPage.password.sendKeys(ConfigReader.getProperty("ViceDeanPassword"));
        WaitUtils.waitFor(1);
    }

    @And("User clicks on login button \\(submit)")
    public void userClicksOnLoginButtonSubmit() {
        loginPage.loginButton.click();
        WaitUtils.waitFor(1);
    }

    @When("User clicks on Menu")
    public void userClicksOnMenu() {
        mainMenuPage.menuButton.click();
        WaitUtils.waitFor(1);
    }

    @And("User sees Lesson Management, teacher Management, student management, contact get all and log out")
    public void userSeesLessonManagementTeacherManagementStudentManagementContactGetAllAndLogOut() {
        Assert.assertTrue(mainMenuPage.lessonManagementInsideMenu.isDisplayed());
        Assert.assertTrue(mainMenuPage.studentManagementInsideMenu.isDisplayed());
        Assert.assertTrue(mainMenuPage.teacherManagementInsideMenu.isDisplayed());
        Assert.assertTrue(mainMenuPage.contactGetAllInsideMenu.isDisplayed());
        Assert.assertTrue(mainMenuPage.logoutInsideMenu.isDisplayed());
        WaitUtils.waitFor(1);
    }

    @And("User clicks Lesson Management")
    public void userClicksLessonManagement() {
        mainMenuPage.lessonManagementInsideMenu.click();
        WaitUtils.waitFor(1);
    }

    @And("User clicks Lesson Program")
    public void userClicksLessonProgram() {
        lessonManagementPage.lessonProgram.click();
        WaitUtils.waitFor(1);
    }

    @And("User clicks on choose lesson")
    public void userClicksOnChooseLesson() {
        lessonManagementPage.lessonProgramChooseLessons.click();
        lessonManagementPage.lessonProgramChooseLessons.sendKeys(ConfigReader.getProperty("choose_lesson"),Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @And("User clicks on choose education term")
    public void userClicksOnChooseEducationTerm() {
        Select select = new Select(lessonManagementPage.lessonProgramChooseEducationTerm);
        select.selectByValue("45");
        WaitUtils.waitFor(1);
    }

    @And("User choose day")
    public void userChooseDay() {
        lessonManagementPage.lessonProgramChooseDay.sendKeys(ConfigReader.getProperty("day"));
        WaitUtils.waitFor(1);
    }
    @And("User enters start stop time")
    public void userEntersStartStopTime() {
        lessonManagementPage.lessonProgramStartTime.sendKeys(ConfigReader.getProperty("start_time"));
        lessonManagementPage.lessonProgramStopTime.sendKeys(ConfigReader.getProperty("stop_time"));
        WaitUtils.waitFor(1);
    }



    @And("User clicks clicks on Submit button")
    public void userClicksClicksOnSubmitButton() {
        lessonManagementPage.lessonProgramSubmitButton.click();
        WaitUtils.waitFor(1);
    }

    @Then("User sees success message")
    public void userSeesSuccessMessage() {
        Assert.assertTrue(lessonManagementPage.lessonManagementLessonsProgramSuccessMessage.isDisplayed());
        WaitUtils.waitFor(1);
    }

    @When("User clicks on menu")
    public void userClicksOnMenu2() {
        mainMenuPage.menuButton.click();
        WaitUtils.waitFor(1);
    }

    @And("User verify that sees Lesson Management, teacher Management, student management, contact get all and log out")
    public void userVerifyThatSeesLessonManagementTeacherManagementStudentManagementContactGetAllAndLogOut() {
        Assert.assertTrue(mainMenuPage.lessonManagementInsideMenu.isDisplayed());
        Assert.assertTrue(mainMenuPage.studentManagementInsideMenu.isDisplayed());
        Assert.assertTrue(mainMenuPage.teacherManagementInsideMenu.isDisplayed());
        Assert.assertTrue(mainMenuPage.contactGetAllInsideMenu.isDisplayed());
        Assert.assertTrue(mainMenuPage.logoutInsideMenu.isDisplayed());
        WaitUtils.waitFor(1);

    }

    @And("User clicks on Lesson Management")
    public void userClicksOnLessonManagement() {
        mainMenuPage.lessonManagementInsideMenu.click();
        WaitUtils.waitFor(1);
    }

    @And("User clicks on Lesson Program")
    public void userClicksOnLessonProgram() {
        lessonManagementPage.lessonProgram.click();
        WaitUtils.waitFor(1);
    }

    @And("User enters start stop same time")
    public void userEntersStartStopSameTime() {
        lessonManagementPage.lessonProgramStartTime.sendKeys(ConfigReader.getProperty("start_time"));
        lessonManagementPage.lessonProgramStopTime.sendKeys(ConfigReader.getProperty("start_time"));
        WaitUtils.waitFor(1);
    }

    @And("User clicks on Submit button")
    public void userClicksOnSubmitButton() {
        lessonManagementPage.lessonProgramSubmitButton.click();
        WaitUtils.waitFor(1);
    }

    @Then("User sees error message")
    public void userSeesErrorMessage() {
        Assert.assertTrue(lessonManagementPage.lessonManagementLessonsProgramErrorMessage.isDisplayed());
        WaitUtils.waitFor(1);
    }

    @And("User close the web page")
    public void userCloseTheWebPage() {
        Driver.closeDriver();
    }
}
