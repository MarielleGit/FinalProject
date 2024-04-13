package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.TeacherManagementPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

public class US24_Stepdefs {
    LoginPage loginPage = new LoginPage();
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    MainMenuPage mainMenuPage = new MainMenuPage();

    @Given("Admin goes to website {string}")
    public void adminGoesToWebsite(String url) {
        Driver.getDriver().get(url);
    }


    @And("Admin clicks on the Log in button at the home page")
    public void adminClicksOnTheLogInButtonAtTheHomePage() {

        BrowserUtils.clickWithTimeOut(loginPage.loginButtonMainPage,1);
    }

    @And("Admin enters the  admin username")
    public void adminEntersTheAdminUserName() {
        loginPage.userName.sendKeys("AdminBatch197");
        WaitUtils.waitFor(2);
    }

    @And("Admin enters the  admin password")
    public void adminEntersTheAdminPassword() {
        loginPage.password.sendKeys("Batch197+");
        WaitUtils.waitFor(2);
    }

    @And("Admin clicks on the Login button")
    public void adminClicksOnTheLoginButton() {

        BrowserUtils.clickWithTimeOut(loginPage.loginButton,1);
    }

    @When("Admin clicks the Menu button")
    public void adminClicksTheMenuButton() {

        BrowserUtils.clickWithTimeOut(mainMenuPage.menuButton,1);
    }

    @And("Admin clicks on the Teacher Management option")
    public void adminClicksOnTheTeacherManagementOption() {
        BrowserUtils.clickWithTimeOut(mainMenuPage.teacherManagementInsideMenu,1);
    }


    @And("Admin selects first lesson from lessons option")
    public void adminSelectsFirstLessonFromLessonsOption() {
//        Actions actions = new Actions(Driver.getDriver());
//        actions.doubleClick(teacherManagementPage.chooseLessonsLast);
//       teacherManagementPage.chooseLessonsLast.sendKeys("Flying",Keys.TAB);
        teacherManagementPage.inputLessons.click();
        teacherManagementPage.inputLessons.sendKeys("Flying",Keys.ENTER);
        WaitUtils.waitFor(2);
        teacherManagementPage.inputLessons.sendKeys(Keys.ENTER);
        WaitUtils.waitFor(2);
    }


    @And("Admin clicks on the Is Adviser Teacher box")
    public void adminClicksOnTheIsAdviserTeacherBox() {
        teacherManagementPage.isAdvisorTeacherButton.click();
        WaitUtils.waitFor(1);
    }

    @And("Admin clicks on one option from Gender boxes")
    public void adminClicksOnOneOptionFromGenderBoxes() {
        teacherManagementPage.maleRadioOption.click();
        WaitUtils.waitFor(1);
    }


    @And("Admin clicks on Submit button")
    public void adminClicksOnSubmitButton() {
        teacherManagementPage.submitButton.click();
    }

    @Then("Admin verify to see a success message {string}")
    public void adminVerifyToSeeASuccessMessage(String message) {
        WaitUtils.waitForVisibility(teacherManagementPage.teacherManagementAddTeacherSuccessMessage,2);
        WaitUtils.waitFor(1);
        Assert.assertEquals(message,teacherManagementPage.teacherManagementAddTeacherSuccessMessage.getText());
        WaitUtils.waitFor(1);
    }


    @Then("Admin verify to see a fail message {string}")
    public void adminVerifyToSeeAFailMessage(String failMessage) {
        WaitUtils.waitForVisibility(teacherManagementPage.failSsnMessage,2);
        WaitUtils.waitFor(1);
        Assert.assertEquals(failMessage,teacherManagementPage.failSsnMessage.getText());
        WaitUtils.waitFor(1);
    }

    @And("close the web page")
    public void closeTheWebPage() {
        Driver.closeDriver();
    }

    @And("Admin enters a teacher name as {string}")
    public void adminEntersATeacherNameAs(String teacherName) {
        teacherManagementPage.teacherName.sendKeys(teacherName);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a teacher surname as {string}")
    public void adminEntersATeacherSurnameAs(String teacherSurname) {
        teacherManagementPage.teacherSurname.sendKeys(teacherSurname);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a Birth Place as {string}")
    public void adminEntersABirthPlaceAs(String teacherBirthPlace) {
        teacherManagementPage.teacherBirthPlace.sendKeys(teacherBirthPlace);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a phone number {string}")
    public void adminEntersAPhoneNumber(String teacherPhoneNumber) {
        teacherManagementPage.teacherPhoneNumber.sendKeys(teacherPhoneNumber);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a User Name {string}")
    public void adminEntersAUserName(String teacherUserName) {
        teacherManagementPage.teacherUsername.sendKeys(teacherUserName);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a password {string}")
    public void adminEntersAPassword(String teacherPassword) {
        teacherManagementPage.teacherPassword.sendKeys(teacherPassword);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a teacher email as {string}")
    public void adminEntersATeacherEmailAs(String teacherEmail) {
        teacherManagementPage.teacherEmail.sendKeys(teacherEmail);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a teacher Ssn number as {string}")
    public void adminEntersATeacherSsnNumberAs(String teacherSsn) {
        teacherManagementPage.teacherSsn.sendKeys(teacherSsn);
        WaitUtils.waitFor(1);
    }
}
