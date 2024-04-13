package stepdefinitions.ui;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.ViceDeanManagementPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.WaitUtils;

import static org.junit.Assert.assertEquals;

public class Us_08StepDefs {

    public static String className="CplusSs";

    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
    LoginPage loginPage= new LoginPage();
    @And("User enters a valid Vice Dean User name")
    public void userEntersAValidViceDeanUserName() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("ViceDeanUsername"));
    }

    @And("User enters a valid Vice Dean password")
    public void userEntersAValidViceDeanPassword() {
        loginPage.password.sendKeys(ConfigReader.getProperty("ViceDeanPassword"));
    }

    @When("User clicks on Lessons top center of the page")
    public void userClicksOnLessonsTopCenterOfThePage() {
        viceDeanManagementPage.lessonsHeadButton.click();
    }

    @And("User enters lesson name on Lesson Name field")
    public void userEntersLessonNameOnLessonNameField() {
        viceDeanManagementPage.lessonName.sendKeys(className);
    }

    @And("User select compulsory button")
    public void userSelectCompulsoryButton() {
        viceDeanManagementPage.compulsoryClickButton.click();
    }

    @And("User enters credit score for lesson on Credit Score field")
    public void userEntersCreditScoreForLessonOnCreditScoreField() {

        viceDeanManagementPage.creditScore.sendKeys("4");
    }

    @And("User clicks Submit button")
    public void userClicksSubmitButton() {
        viceDeanManagementPage.submitButtonLessonManagement.click();
    }

    @And("User enters same lesson name that already created on Lesson Name field")
    public void userEntersSameLessonNameThatAlreadyCreatedOnLessonNameField() {
        viceDeanManagementPage.lessonName.sendKeys("c++");
    }


    @And("User sees a error message")
    public void userSeesAErrorMessage() {
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(viceDeanManagementPage.errorLessonNameAlreadyRegister);
//        String text = viceDeanManagementPage.alertMessage.getText();
//        String expectedText = "Error: Lesson with lesson name c++ already registered";
//        Assert.assertEquals(expectedText,text);
    }

    @And("User sees a success message")
    public void userSeesASuccessMessage() {
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(viceDeanManagementPage.lessonCreated);

//        String text = viceDeanManagementPage.lessonCreated.getText();
//        String expectedText = "Lesson Created";
//        Assert.assertEquals(expectedText,text);
    }

}