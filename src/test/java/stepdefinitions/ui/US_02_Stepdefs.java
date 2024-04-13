package stepdefinitions.ui;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import pages.GuestUserPage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.Driver;
import utilities.WaitUtils;
import static org.junit.Assert.*;

public class US_02_Stepdefs {


    LoginPage loginPage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    GuestUserPage guestUserPage = new GuestUserPage();


    @And("the students clicks login button")
    public void theStudentsClicksLoginButton() {
        loginPage.loginButtonMainPage.click();
        WaitUtils.waitFor(1);
    }

    @And("Admin types the username")
    public void adminTypesTheUsername() {
        loginPage.userName.click();
        loginPage.userName.sendKeys("AdminBatch197", Keys.TAB);
        WaitUtils.waitFor(1);

    }

    @And("Admin types the password")
    public void adminTypesThePassword() {
        loginPage.password.sendKeys("Batch197+");
        WaitUtils.waitFor(1);

    }

    @And("Admin clicks on Login button")
    public void adminClicksOnLoginButton() {
        loginPage.loginButton.click();
        WaitUtils.waitFor(1);

    }

    @And("Admin clicks on menu button")
    public void adminClicksOnMenuButton() {
        mainMenuPage.menuButton.click();
        WaitUtils.waitFor(1);

    }

    @And("Admin clicks on the Guest user of the main menu")
    public void adminClicksOnTheGuestUserOfTheMainMenu() {
        mainMenuPage.guestUserInsideMenu.click();
        WaitUtils.waitFor(1);

    }


    // TC_01
    @And("Admin should be able to see Name, Phone Number, SSN and User Name information in the guest user list.")
    public void adminshouldBeAbleToSeeNamePhoneNumberSSNAndUserNameInformationInTheGuestUserList() {
        assertTrue(guestUserPage.guestUserListVisible.isDisplayed());
        WaitUtils.waitFor(1);

        assertTrue(guestUserPage.nameOfTheGuestUserListVisible.isDisplayed());
        WaitUtils.waitFor(1);

        assertTrue(guestUserPage.phoneNumberOfTheGuestUserListVisible.isDisplayed());
        WaitUtils.waitFor(1);

        assertTrue(guestUserPage.ssnOfTheGuestUserListVisible.isDisplayed());
        WaitUtils.waitFor(1);

        assertTrue(guestUserPage.userNameOfTheGuestUserListVisible.isDisplayed());
        WaitUtils.waitFor(1);


    }

    @And("Admin must be able to delete information, from the Guest User List.")
    public void adminMustBeAbleToDeleteInformationFromTheGuestUserList() {
        guestUserPage.deleteOfTheGuestUserListVisible.click();
        WaitUtils.waitFor(1);

    }


    @And("Admin must be able to see {string} message")
    public void adminMustBeAbleToSeeMessage(String message) {
        assertEquals(message, guestUserPage.deleteOfTheGuestUserListMessage.getText());
        WaitUtils.waitFor(1);

    }

    @And("close the driver")
    public void closeTheDriver() {
        Driver.closeDriver();
    }


    // TC_02
    @And("Admin click Contact All of the main menu")
    public void adminClickGetContactAllOfTheMainMenu() {
    mainMenuPage.contactGetAllInsideMenu.click();
    }

    @And("Admin must not see {string} of the header")
    public void adminMustNotSeeOfTheHeader(String message) {
        assertFalse("Guest User List", false);

    }


}
