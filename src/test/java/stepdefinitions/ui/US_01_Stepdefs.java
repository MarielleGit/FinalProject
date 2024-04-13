package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.*;

public class US_01_Stepdefs {
    WebDriver driver = new ChromeDriver();

    RegisterPage registerPage = new RegisterPage();

    @Given("Student goes to website {string}")
    public void studentGoesToWebsite(String Management_url) {
        Driver.getDriver().get(Management_url);
    }

    @And("the students clicks register button")
    public void theStudentsClicksRegisterButton() {
        registerPage.registerPage.click();
        WaitUtils.waitFor(1);

    }

    @And("students write their name")
    public void studentsWriteTheirName() {
        registerPage.nameOfTheRegisterField.sendKeys("John", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("students write their surname")
    public void studentsWriteTheirSurname() {
        registerPage.surnameField.sendKeys("Doe", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("students write their birth place")
    public void studentsWriteTheirBirthPlace() {
        registerPage.birthPlaceField.sendKeys("New york", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("students write their phone number")
    public void studentsWriteTheirPhoneNumber() {
        registerPage.phoneNumberField.sendKeys("171-569-5896", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("students select their gender")
    public void studentsSelectTheirGender() {
        registerPage.maleOfGender.click();
        WaitUtils.waitFor(1);
    }

    @And("students write their date of birth")
    public void studentsWriteTheirDateOfBirth() {
        registerPage.birthDayField.sendKeys("06/07/1978");
        WaitUtils.waitFor(1);
    }

    @And("students write their ssn")
    public void studentsWriteTheirSsn() {
        registerPage.ssnField.sendKeys("456-89-8569");
        WaitUtils.waitFor(1);
    }

    @And("students write their username")
    public void studentsWriteTheirUsername() {
        registerPage.userNameOfTheRegisterField.sendKeys("Johndoe");
        WaitUtils.waitFor(1);
    }

    //TC_01
    @And("students write their password")
    public void studentsWriteTheirPassword() {
        registerPage.passwordField.sendKeys("SecurePwd1");
        WaitUtils.waitFor(1);
    }

    @And("students click register button")
    public void studentsClickRegisterButton() {
        BrowserUtils.clickWithTimeOut(registerPage.registerButton,2);
        WaitUtils.waitFor(1);
    }

    @Then("students must see {string} message")
    public void studentsMustSeeMessage(String expectedResult) {
        assertEquals(expectedResult, "Guest User Registered");
        WaitUtils.waitFor(1);
    }


    //TC_02
    @And("student writes their password")
    public void studentWritesTheirPassword() {
        registerPage.passwordField.sendKeys("nasilsin0122");
        WaitUtils.waitFor(1);

    }

    @Then("students must see the {string} message")
    public void studentsMustSeeTheMessage(String expectedResult) {
        assertEquals("One uppercase character", registerPage.passwordFieldMessageOfRegisterButton.getText());
        WaitUtils.waitFor(1);
    }

    @Then("students should not click register button")
    public void studentsShouldNotClickRegisterButton() {
        assertFalse(registerPage.registerButton.isSelected());
    }



}
