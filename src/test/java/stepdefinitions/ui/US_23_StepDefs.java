package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminManagementPage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.ActionsUtils;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

import java.util.ArrayList;
import java.util.List;


public class US_23_StepDefs {
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage= new AdminManagementPage();
    MainMenuPage mainMenuPage= new MainMenuPage();


    public static String vicedeanSsn="111-23-0003";
    public static String vicedeanphoneNumber="079-012-0003";
    public static String vicedeanUsername="AhmadRaminaab";


    @When("Admin enters the first name for new Vice Dean")
    public void adminEntersTheFirstNameForNewViceDean() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.name,"Hekmat",2);
    }

    @And("Admin enters the surname for new Vice Dean")
    public void adminEntersTheSurnameForNewViceDean() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.surname,"Amini",2);
    }

    @And("Admin enters the birth place of new Vice Dean")
    public void adminEntersTheBirthPlaceOfNewViceDean() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.birthPlace,"Kabul",2);
    }

    @And("Admin enters gender of new Vice Dean")
    public void adminEntersGenderOfNewViceDean() {
        BrowserUtils.clickWithTimeOut(adminManagementPage.maleGender,2);
    }

    @And("Admin enters birth date of new Vice Dean")
    public void adminEntersBirthDateOfNewViceDean() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.dateOfBirth,"01/01/2000",2);
    }

    @And("Admin enters phone number of new Vice Dean in the format\\(xxx-xxx-xxxx)")
    public void adminEntersPhoneNumberOfNewViceDeanInTheFormatXxxXxxXxxx() {

        BrowserUtils.sendKeysWithTimeout(adminManagementPage.phoneNumber,vicedeanphoneNumber,2);
    }

    @And("Admin enters SSN number of new Vice Dean in the format\\(xxx-xx-xxxx)")
    public void adminEntersSSNNumberOfNewViceDeanInTheFormatXxxXxXxxx() {

        BrowserUtils.sendKeysWithTimeout(adminManagementPage.ssn,vicedeanSsn,2);
    }

    @And("Admin enters a username for new Vice Dean")
    public void adminEntersAUsernameForNewViceDean() {

        BrowserUtils.sendKeysWithTimeout(adminManagementPage.username,vicedeanUsername,2);
    }

    @And("Admin enters a password for new Vice Dean\\(at least eight chars and UpC,LowC,Num)")
    public void adminEntersAPasswordForNewViceDeanAtLeastEightCharsAndUpCLowCNum() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.password,"Hekmat123",2);
    }

    @And("Admin clicks the submit button")
    public void adminClicksTheSubmitButton() {
        BrowserUtils.clickWithTimeOut(adminManagementPage.submitButton,5);
        WaitUtils.waitFor(2);
    }

    @And("Admin should see Vice Dean Saved message")
    public void adminShouldSeeViceDeanSavedMessage() {
    adminManagementPage.ViceDeanSavedMessage.isDisplayed();
    }

    @Then("Admin should see the new Vice Dean in the Vice Dean List")
    public void adminShouldSeeTheNewViceDeanInTheViceDeanList() {
        ActionsUtils.actionsScrollDown();
        BrowserUtils.clickWithTimeOut(adminManagementPage.ListLastPartButton,5);
        WaitUtils.waitFor(5);
        List<WebElement> ssnColumnData = Driver.getDriver().findElements(By.xpath("//table//tbody//td[4]"));
        List<String> ssnColumn = new ArrayList<>();
        for (WebElement each:ssnColumnData){
            String ssnString= each.getText();
            ssnColumn.add(ssnString);
        }
        System.out.println(ssnColumn);
        boolean flag=false;
        if (ssnColumn.contains(vicedeanSsn)){
            flag=true;
        }
        Assert.assertTrue(flag);
    }

    @And("Admin leaves the username field empty")
    public void adminLeavesTheUsernameFieldEmpty() {

    }

    @And("Admin should see Required message under username field")
    public void adminShouldSeeRequiredMessageUnderUsernameField() {
        adminManagementPage.RequiredMessageUnderUsername.isDisplayed();
    }

    @Then("Admin should NOT see the new Vice Dean in the Vice Dean List")
    public void adminShouldNOTSeeTheNewViceDeanInTheViceDeanList() {
        ActionsUtils.actionsScrollDown();
        BrowserUtils.clickWithTimeOut(adminManagementPage.ListLastPartButton,5);
        WaitUtils.waitFor(4);
        List<WebElement> ssnColumnData = Driver.getDriver().findElements(By.xpath("//table//tbody//td[4]"));
        List<String> ssnColumn = new ArrayList<>();
        for (WebElement each:ssnColumnData){
            String ssnString= each.getText();
            ssnColumn.add(ssnString);
        }
        System.out.println(ssnColumn);
        boolean flag=false;
        if (ssnColumn.contains("112-01-1225")){
            flag=true;
        }
        Assert.assertFalse(flag);
    }

    @And("Admin enters a password for new admin\\(at least eight chars and UpC,LowC)")
    public void adminEntersAPasswordForNewAdminAtLeastEightCharsAndUpCLowC() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.password,"Hekmatabc",2);
    }

    @And("Admin should see One Number message under the password field")
    public void adminShouldSeeOneNumberMessageUnderThePasswordField() {
    adminManagementPage.OnenumberMessageUnderPassword.isDisplayed();
    }

    @And("Admin leaves the password field empty")
    public void adminLeavesThePasswordFieldEmpty() {

    }

    @And("admin clicks the menuButton")
    public void adminClicksTheMenuButton() {
        BrowserUtils.clickWithTimeOut(mainMenuPage.menuButton,2);
    }

    @And("admin click the Vice Dean Management")
    public void adminClickTheViceDeanManagement() {
        BrowserUtils.clickWithTimeOut(mainMenuPage.viceDeanManagementInsideMenu,3);
    }

    @And("Admin enters new SSN number of new Vice Dean in the format\\(xxx-xx-xxxx)")
    public void adminEntersNewSSNNumberOfNewViceDeanInTheFormatXxxXxXxxx() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.ssn,"112-01-1225",2);
    }
}
