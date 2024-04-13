package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pages.DeanManagementPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import static com.github.javafaker.Faker.instance;

public class US_06StepDefs {

    public static String viceDeanCreateUserName ="aAbCc11";
    public static  String viceDeanCreateSSN= "496-11-2039";
    public static  String viceDeanPhoneNumb= "441-410-1039";
    LoginPage loginPage = new LoginPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();

    @Given("admin goes to {string} homepage")
    public void adminGoesToHomepage(String url) {
        Driver.getDriver().get(url);
    }
    @And("User clicks on Login button right corner of the page")
    public void userClicksOnLoginButtonRightCornerOfThePage() {
        loginPage.loginButtonMainPage.click();
    }

    @And("User enters a valid User name")
    public void userEntersAValidUserName() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("DeanUsername"));
    }

    @And("User enters a valid password")
    public void userEntersAValidPassword() {
        loginPage.password.sendKeys(ConfigReader.getProperty("DeanPassword"));
    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {
        loginPage.loginButton.click();
    }

    @When("User enters name in name field")
    public void userEntersNameInNameField() {

deanManagementPage.name.sendKeys("Naim");

    }

    @And("User enters last name in the Surname field")
    public void userEntersLastNameInTheSurnameField() {

deanManagementPage.surname.sendKeys("last");

    }

    @And("User enters place of birth in the Birth Place field")
    public void userEntersPlaceOfBirthInTheBirthPlaceField() {

deanManagementPage.birthPlace.sendKeys("Ankara");

    }

    @And("User select gender")
    public void userSelectGender() {
        deanManagementPage.maleGender.click();
    }

    @And("User enters date of birth in the date of birth field")
    public void userEntersDateOfBirthInTheDateOfBirthField() {
        deanManagementPage.dateOfBirth.sendKeys("10101990");
    }

    @And("User enters phone number in the phone number field")
    public void userEntersPhoneNumberInThePhoneNumberField() {

deanManagementPage.phoneNumber.sendKeys(viceDeanPhoneNumb);
    }

    @And("User enters social security number in the SSN field")
    public void userEntersSocialSecurityNumberInTheSSNField() {

deanManagementPage.ssn.sendKeys(viceDeanCreateSSN);

    }

    @And("User enters user name in the User Name field")
    public void userEntersUserNameInTheUserNameField() {

deanManagementPage.username.sendKeys(viceDeanCreateUserName);

    }

    @And("User enters valid password in the Password field")
    public void userEntersValidPasswordInThePasswordField() {
        deanManagementPage.password.sendKeys("123456789Ae");
    }

    @And("User clicks the Submit button")
    public void userClicksTheSubmitButton() throws InterruptedException {
        deanManagementPage.submitButton.click();
    }

    @Then("User sees a completed message")
    public void userSeesACompletedMessage() {
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(deanManagementPage.alertMessage);
    }
//TC02

    @And("User enters phone number that not contains - in the phone number field")
    public void userEntersPhoneNumberThatNotContainsInThePhoneNumberField() {
        deanManagementPage.phoneNumber.sendKeys(("444444444445"));
    }


    @Then("User sees a error message phone number")
    public void userSeesAErrorMessagePhoneNumber() {
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(deanManagementPage.invalidPhoneMessageDean);
    }
}
