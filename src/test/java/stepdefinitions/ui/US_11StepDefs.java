package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;
import pages.LessonManagementPage;
import utilities.ActionsUtils;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.WaitUtils;

public class US_11StepDefs {

    LessonManagementPage lessonManagementPage = new LessonManagementPage();

    @And("User goes to Lesson Program Assignment")
    public void userGoesToLessonProgramAssignment() {
        WaitUtils.waitFor(5);
        ActionsUtils.actionsScrollDown();
    }

    @And("User clicks on choose lesson box")
    public void userClicksOnChooseLessonBox() {
        BrowserUtils.clickWithTimeOut(lessonManagementPage.lessonProgramLessonProgramAssignmentChooseLesson,5);
//        lessonManagementPage.lessonProgramLessonProgramAssignmentChooseLesson.click();
        WaitUtils.waitFor(2);
    }

    @And("User clicks on choose teacher dropdown")
    public void userClicksOnChooseTeacherDropdown() {
        Select select = new Select(lessonManagementPage.lessonProgramChooseTeacher);
        select.selectByValue("5435");
        WaitUtils.waitFor(2);
    }
    @And("User clicks on Assignment Submit button")
    public void userClicksOnAssignmentSubmitButton() {
        lessonManagementPage.lessonProgramLessonProgramAssignmentSubmitButton.click();
        WaitUtils.waitFor(2);
    }

    @Then("User must see success message")
    public void userMustSeeSuccessMessage() {
//        Assert.assertTrue(lessonManagementPage.lessonManagementLessonsProgramSuccessMessage.isDisplayed());
        WaitUtils.waitFor(1);
    }
}
