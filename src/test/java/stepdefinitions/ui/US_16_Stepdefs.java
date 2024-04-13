package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactGetAllPage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;


public class US_16_Stepdefs {

    LoginPage loginPage = new LoginPage();

    MainMenuPage mainMenuPAge =new MainMenuPage();

    ContactGetAllPage contactGetAllPage= new ContactGetAllPage();

    @Given("The Vice Dean navigates to {string}")
    public void theViceDeanNavigatesTo(String HomeUrl) {
        Driver.getDriver().get(HomeUrl);

        WaitUtils.waitFor(1);
    }

    @And("The Vice Dean clicks on Login button on homepage")
    public void theViceDeanClicksOnLoginButtonOnHomepage() {
        loginPage.loginButtonMainPage.click();

        WaitUtils.waitFor(1);
    }

    @And("The Vice Dean types the username")
    public void theViceDeanTypesTheUsername() {
        loginPage.userName.sendKeys("İbrahim2");

        WaitUtils.waitFor(1);
    }

    @And("The Vice Dean types the password")
    public void theViceDeanTypesThePassword() {
        loginPage.password.sendKeys("ibrahim22A");

        WaitUtils.waitFor(1);
    }

    @And("The Vice Dean clicks on Login button")
    public void theViceDeanClicksOnLoginButton() {

        loginPage.loginButton.click();
        WaitUtils.waitFor(1);
    }

    @When("The Vice Dean clicks on the Menu button")
    public void theViceDeanClicksOnTheMenuButton() {

        mainMenuPAge.menuButton.click();
        WaitUtils.waitFor(1);
    }
    @And("The Vice Dean selects Contact Get All option")
    public void theViceDeanSelectsContactGetAllOption() {
        mainMenuPAge.contactGetAllInsideMenu.click();
        WaitUtils.waitFor(3);
    }


    @Then("The Vice Dean should see the Contact Message page")
    public void theViceDeanShouldSeeTheContactMessagePage() {
        assertTrue(contactGetAllPage.contactGetAllContactMessagePage.isDisplayed());

        WaitUtils.waitFor(3);


    }

    @And("The Vice Dean should see Contact Messages")
    public void theViceDeanShouldSeeContactMessages() {
        assertTrue(contactGetAllPage.contactGetAllContactMessageInMessage.getText().contains("about team management"));
        WaitUtils.waitFor(1);


    }


}
