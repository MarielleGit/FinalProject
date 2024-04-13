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
import utilities.ActionsUtils;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

import java.util.ArrayList;
import java.util.List;

public class US_22_StepDefs {
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage= new AdminManagementPage();
    public static String Adminssn="111-24-0001";
    public static String Adminphonenumber="079-013-0001";
    public static String Adminusername="HekmatAminiaaa";

    @When("Admin enters the first name for new Admin")
    public void adminEntersTheFirstNameForNewAdmin() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.name,"Hekmat",2);
    }

    @And("Admin enters the surname for new Admin")
    public void adminEntersTheSurnameForNewAdmin() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.surname,"Amini",2);
    }

    @And("Admin enters the birth place of new Admin")
    public void adminEntersTheBirthPlaceOfNewAdmin() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.birthPlace,"Kabul",2);
    }

    @And("Admin enters gender of new Admin")
    public void adminEntersGenderOfNewAdmin() {

        BrowserUtils.clickWithTimeOut(adminManagementPage.maleGender,2);
    }

    @And("Admin enters birth date of new Admin")
    public void adminEntersBirthDateOfNewAdmin() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.dateOfBirth,"01/01/2000",2);
    }

    @And("Admin enters phone number of new Admin in the format\\(xxx-xxx-xxxx)")
    public void adminEntersPhoneNumberOfNewAdminInTheFormatXxxXxxXxxx() {

        BrowserUtils.sendKeysWithTimeout(adminManagementPage.phoneNumber,Adminphonenumber,2);
    }

    @And("Admin enters SSN number of new Admin in the format\\(xxx-xx-xxxx)")
    public void adminEntersSSNNumberOfNewAdminInTheFormatXxxXxXxxx() {

        BrowserUtils.sendKeysWithTimeout(adminManagementPage.ssn,Adminssn,2);
    }

    @And("Admin enters a username for new Admin")
    public void adminEntersAUsernameForNewAdmin() {

        BrowserUtils.sendKeysWithTimeout(adminManagementPage.username,Adminusername,2);
    }

    @And("Admin enters a password for new admin\\(at least eight chars and UpC,LowC,Num)")
    public void adminEntersAPasswordForNewAdminAtLeastEightCharsAndUpCLowCNum() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.password,"Hekmat123",2);
    }

    @And("Admin clicks the Submit button")
    public void adminClicksTheSubmitButton() {
        BrowserUtils.clickWithTimeOut(adminManagementPage.submitButton,5);
        WaitUtils.waitFor(1);

    }

    @And("Admin should see Admin saved message")
    public void adminShouldSeeAdminSavedMessage() {
        WaitUtils.waitFor(1);
        adminManagementPage.adminsavedMessage.isDisplayed();
    }

    @Then("Admin should see the new Admin in the Admin List")
    public void adminShouldSeeTheNewAdminInTheAdminList() {
        ActionsUtils.actionsScrollDown();
        BrowserUtils.clickWithTimeOut(adminManagementPage.ListLastPartButton,5);
        WaitUtils.waitFor(6);

        List<WebElement> ssnColumnData = Driver.getDriver().findElements(By.xpath("//table//tbody//td[4]"));
        List<String> ssnColumn = new ArrayList<>();
        for (WebElement each:ssnColumnData){
            String ssnString= each.getText();
            ssnColumn.add(ssnString);
        }
        System.out.println(ssnColumn);
        boolean flag=false;
        if (ssnColumn.contains(Adminssn)){
            flag=true;
        }
        Assert.assertTrue(flag);
    }

    @And("Admin enters a password for new admin\\(less than eight chars and UpC,LowC,Num)")
    public void adminEntersAPasswordForNewAdminLessThanEightCharsAndUpCLowCNum() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.password,"Hekmat1",2);
    }

    @Then("Admin should see the At least 8 characters still visible")
    public void adminShouldSeeTheAtLeastCharactersStillVisible() {
        adminManagementPage.AtLeast8CharectersMessage.isDisplayed();
    }


    @And("Admin enters SSN in different format \\(changes the places of -)")
    public void adminEntersSSNInDifferentFormatChangesThePlacesOf() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.ssn,"112-011-201",2);
    }

    @And("Admin should see Please enter valid SSN number message")
    public void adminShouldSeePleaseEnterValidSSNNumberMessage() {
        WaitUtils.waitFor(2);
        adminManagementPage.EnterValidSSNNumberMessage.isDisplayed();
    }

    @Then("Admin should not see the New Admin in the Admin List")
    public void adminShouldNotSeeTheNewAdminInTheAdminList() {
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
        if (ssnColumn.contains("112-011-201")){
            flag=true;
        }
        Assert.assertFalse(flag);

    }

    @And("close the browser")
    public void closeTheBrowser() {
        Driver.closeDriver();
    }
}