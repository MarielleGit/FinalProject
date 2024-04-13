package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.MeetManagementPage;
import utilities.BrowserUtils;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US_19_StepDefs {
    MeetManagementPage meetManagementPage = new MeetManagementPage();
    LoginPage loginPage = new LoginPage();

    @And("User types the username of his teacher account")
    public void userTypesTheUsernameOfHisTeacherAccount() {
        loginPage.userName.sendKeys("SemaTeacher");
        WaitUtils.waitFor(1);
    }

    @And("User types the password of his teacher account")
    public void userTypesThePasswordOfHisTeacherAccount() {
        loginPage.password.sendKeys("SemaTeacher1");
        WaitUtils.waitFor(1);
    }

    @And("Teacher clicks on Login button")
    public void teacherClicksOnLoginButton() {
        loginPage.loginButtonBlue.click();
        WaitUtils.waitFor(1);
    }

    @When("User clicks on menu button")
    public void userClicksOnMenuButton() {
        meetManagementPage.teacherMenuButton.click();
        WaitUtils.waitFor(1);
    }

    @And("User clicks on Meet Management")
    public void userClicksOnMeetManagement() {
        meetManagementPage.teacherMeetManagementButton.click();
        WaitUtils.waitFor(1);
    }

    @And("User must see Meet Management on the screen")
    public void userMustSeeMeetManagementOnTheScreen() {
        Assert.assertTrue(meetManagementPage.getTeacherMeetManagementTextVisible.isDisplayed());
        WaitUtils.waitFor(1);
    }

    @And("User types a FUTURE date in Date of Meet box")
    public void userTypesAFUTUREDateInDateOfMeetBox() {
        int date;
        date = Faker.instance().number().numberBetween(1,31);
        meetManagementPage.teacherMeetDateBox.sendKeys(date+"-03-2025");
        //meetManagementPage.teacherMeetDateBox.sendKeys("05-06-2024");
        WaitUtils.waitFor(1);
    }

    @And("User types the start time in Start Time box")
    public void userTypesTheStartTimeInStartTimeBox() {
        meetManagementPage.teacherMeetStartTimeBox.sendKeys("14:00");
        WaitUtils.waitFor(1);
    }

    @And("User types the stop time in Stop Time box")
    public void userTypesTheStopTimeInStopTimeBox() {
        meetManagementPage.teacherMeetStopTimeBox.sendKeys("14:30");
        WaitUtils.waitFor(1);
    }

    @And("User types a short description on meeting in Description box")
    public void userTypesAShortDescriptionOnMeetingInDescriptionBox() {
        meetManagementPage.teacherMeetDescriptionBox.sendKeys("Project Meeting");
        WaitUtils.waitFor(1);
    }


    @Then("User must see Meet saved successfully message")
    public void userMustSeeMeetSavedSuccessfullyMessage() {
        WaitUtils.waitForVisibility(meetManagementPage.teacherMeetSavedSuccessfullyMessage,4);
        Assert.assertEquals("Meet Saved Successfully", meetManagementPage.teacherMeetSavedSuccessfullyMessage.getText());
        WaitUtils.waitFor(1);
    }

    @And("User types a PAST date in Date of Meet box")
    public void userTypesAPASTDateInDateOfMeetBox() {
        int date;
        date = Faker.instance().number().numberBetween(1,31);
        meetManagementPage.teacherMeetDateBox.sendKeys(date+"-03-2023");
        //meetManagementPage.teacherMeetDateBox.sendKeys("03-03-2023");
        WaitUtils.waitFor(1);
    }

    @Then("User must see must be a future date message on meet page")
    public void userMustSeeMustBeAFutureDateMessageOnMeetPage() {
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(meetManagementPage.teacherMeetMustBeFutureDateMessage);
        //Assert.assertTrue(meetManagementPage.teacherMeetMustBeFutureDateMessage.isDisplayed());
        //Assert.assertEquals("must be a future date" , meetManagementPage.teacherMeetMustBeFutureDateMessage.getText());
    }

    @Then("User must see must be a future date message")
    public void userMustSeeMustBeAFutureDateMessage() {
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(meetManagementPage.teacherMeetEditMustBeFutureDateMessage);
        //Assert.assertTrue(meetManagementPage.teacherMeetEditMustBeFutureDateMessage.isDisplayed());
        //Assert.assertEquals("must be a future date" , meetManagementPage.teacherMeetEditMustBeFutureDateMessage.getText());
    }
    @And("User clicks on select student button and selects a student from the menu")
    public void userClicksOnSelectStudentButtonAndSelectsAStudentFromTheMenu() {
        JSUtils.JSclickWithTimeout(meetManagementPage.teacherMeetSelectStudentButton);
        WaitUtils.waitFor(2);
        meetManagementPage.teacherMeetSelectStudentButton.sendKeys("Faruk Duran" , Keys.ENTER);
    }

    @And("User clicks on Meet Management submit button")
    public void userClicksOnMeetManagementSubmitButton() {
        JSUtils.JSclickWithTimeout(meetManagementPage.teacherMeetSubmitButton);
    }
}
