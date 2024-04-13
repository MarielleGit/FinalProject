package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;
public class US_04_StepDefs {

    LoginPage loginPage = new LoginPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    public static String deanUserName;
    public static int phoneNumber;
    public static String fullPhoneNumber;
    public static int ssnNumber;
    public static String fullssnNumber;
    public static String deanPassword;

    @And("clicks Dean Management option")
    public void clicksDeanManagementOption() {
        mainMenuPage.deanManagementInsideMenu.click();
    }

    @And("enters Dean’s Name")
    public void entersDeanSName() {
        WaitUtils.waitFor(2);
        deanManagementPage.name.sendKeys("Ali");
    }

    @And("enters Dean’s Surname")
    public void entersDeanSSurname() {
        deanManagementPage.surname.sendKeys("Can");
    }

    @And("enters Dean’s Birth Place")
    public void entersDeanSBirthPlace() {
        deanManagementPage.birthPlace.sendKeys("TR");
    }

    @And("selects Dean’s Gender")
    public void selectsDeanSGender() {
        deanManagementPage.maleGender.click();
    }

    @And("enters Dean’s Date of Birth")
    public void entersDeanSDateOfBirth() {
        deanManagementPage.dateOfBirth.sendKeys("24.09.1990");
    }
    //01.01.1999

    @And("enters Dean’s Phone Number")
    public void entersDeanSPhoneNumber() {
        phoneNumber = Faker.instance().number().numberBetween(100,999);
        deanManagementPage.phoneNumber.sendKeys("226-662-2261");
    }

    @When("enters SSN Number")
    public void entersSSNNumber() {
        ssnNumber = Faker.instance().number().numberBetween(100,999);
        deanManagementPage.ssn.sendKeys("882-22-2881");
    }

    @And("enters user name")
    public void entersUserName() {
        //deanUserName=Faker.instance().name().username();
        //   deanManagementPage.username.sendKeys(deanUserName);
        deanManagementPage.username.sendKeys("AliCancan");

    }

    @And("enters password")
    public void entersPassword() {
        deanPassword = "Dean12345";
        deanManagementPage.password.sendKeys(deanPassword);
    }

    @And("clicks Submit button")
    public void clicksSubmitButton() {
        deanManagementPage.submitButton.click();
    }

    @Then("see Dean Saved message")
    public void seeDeanSavedMessage() {
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(deanManagementPage.successMessageDeanSaved);
    }
    @And("clicks logout option and clicks yes")
    public void clicksLogoutOptionAndClicksYes() {
        mainMenuPage.logoutInsideMenu.click();
        mainMenuPage.yesForLogout.click();
    }

    @When("enters invalid SSN Number")
    public void entersInvalidSSNNumber() {
        deanManagementPage.ssn.sendKeys("882-2282881");
    }

    @Then("see Please enter valid SSN number message")
    public void seePleaseEnterValidSSNNumberMessage() {
        WaitUtils.waitForVisibility(deanManagementPage.invalidSsnMessageDeanSaved,3);
        BrowserUtils.verifyElementDisplayed(deanManagementPage.invalidSsnMessageDeanSaved);
    }

    @Then("close the webpage")
    public void closeTheWebpage() {
        Driver.closeDriver();
    }
}
