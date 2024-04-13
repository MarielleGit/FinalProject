package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MeetManagementPage;
import utilities.BrowserUtils;
import utilities.WaitUtils;

public class US_20_StepDefs {

    MeetManagementPage meetManagementPage = new MeetManagementPage();

    @And("User must see Meet List on the screen")
    public void userMustSeeMeetListOnTheScreen() {
        Assert.assertTrue(meetManagementPage.teacherMeetListText.isDisplayed());
    }

    @And("User clicks on the edit button of a student")
    public void userClicksOnTheEditButtonOfAStudent() {
        BrowserUtils.clickWithTimeOut(meetManagementPage.teacherMeetEditButton,2);
        WaitUtils.waitFor(1);
    }

    @And("User updates the Date of Meeting")
    public void userUpdatesTheDateOfMeeting() {

        int date;
        date = Faker.instance().number().numberBetween(1,31);
        meetManagementPage.teacherMeetEditDateBox.sendKeys(date+"-05-2025");
        //meetManagementPage.teacherMeetEditDateBox.sendKeys("02-05-2024");
        WaitUtils.waitFor(1);
    }

    @And("teacher clicks on Submit button")
    public void teacherClicksOnSubmitButton() {
        WaitUtils.waitFor(2);
        meetManagementPage.teacherMeetEditSubmitButton.click();

    }

    @Then("User must see Meet Updated Successfully message")
    public void userMustSeeMeetUpdatedSuccessfullyMessage() {
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(meetManagementPage.teacherMeetEditUpdatedSuccessfully);
        //Assert.assertEquals("Meet Updated Successfully" , meetManagementPage.teacherMeetEditUpdatedSuccessfully.getText());
    }

    @And("User assigns a past date to the Date of Meeting")
    public void userAssignsAPastDateToTheDateOfMeeting() {
        int date;
        date = Faker.instance().number().numberBetween(1,31);
        meetManagementPage.teacherMeetEditDateBox.sendKeys(date+"-05-2023");
        //meetManagementPage.teacherMeetEditDateBox.sendKeys("02-05-2024");
        WaitUtils.waitFor(1);

    }
}
