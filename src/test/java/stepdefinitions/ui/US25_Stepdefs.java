package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.MainMenuPage;
import pages.StudentManagementPage;
import utilities.BrowserUtils;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US25_Stepdefs {
    StudentManagementPage studentManagementPage = new StudentManagementPage();
    MainMenuPage mainMenuPage = new MainMenuPage();

    @And("Admin clicks the Student Management option")
    public void adminClicksTheStudentManagementOption() {
        BrowserUtils.clickWithTimeOut(mainMenuPage.studentManagementInsideMenu,1);

    }


    @And("Admin clicks Choose Advisor Teacher input field and selects first teacher from Choose Teacher option")
    public void adminClicksChooseAdvisorTeacherInputFieldAndSelectsFirstTeacherFromChooseTeacherOption() {
        Select select = new Select(studentManagementPage.chooseTeacherLast);
        select.selectByValue("4938");
        WaitUtils.waitFor(1);
    }


    @And("Admin enters a student name")
    public void adminEntersAStudentName() {
        studentManagementPage.name.sendKeys("Mercan");
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a student surname")
    public void adminEntersAStudentSurname() {
        studentManagementPage.surname.sendKeys("Gülümsün");
        WaitUtils.waitFor(1);
    }

    @And("Admin clicks the Gender box")
    public void adminClicksTheGenderBox() {
        studentManagementPage.femaleGender.click();
        WaitUtils.waitFor(1);
    }

    @And("Admin enters the Father name")
    public void adminEntersTheFatherName() {
        studentManagementPage.fatherName.sendKeys("Gokhan");
        WaitUtils.waitFor(1);
    }

    @And("Admin enters the Mother name")
    public void adminEntersTheMotherName() {
        studentManagementPage.motherName.sendKeys("Sule");
        WaitUtils.waitFor(1);
    }

    @Then("Admin sees a success message {string}")
    public void adminSeesASuccessMessage(String message) {

        WaitUtils.waitForVisibility(studentManagementPage.SuccessMessageStudentSaved,2);
        Assert.assertEquals(message,studentManagementPage.SuccessMessageStudentSaved.getText());
        WaitUtils.waitFor(1);
    }

    @Then("Admin sees a failed message {string}")
    public void adminSeesAFailedMessage(String failedMessage) {

        WaitUtils.waitForVisibility(studentManagementPage.invalidSsnMessage,2);
        Assert.assertEquals(failedMessage,studentManagementPage.invalidSsnMessage.getText());
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a Birth Place as Hatay")
    public void adminEntersABirthPlaceAsHatay() {
        studentManagementPage.birthPlace.sendKeys("Hatay");
        WaitUtils.waitFor(1);

    }

    @And("Admin enters a phone number as {string}")
    public void adminEntersAPhoneNumberAs(String phoneNumber) {
        studentManagementPage.phoneNumber.sendKeys(phoneNumber);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters Date of Birth in Date of Birth field as {string}")
    public void adminEntersDateOfBirthInDateOfBirthFieldAs(String dateOfBirth) {
        studentManagementPage.dateOfBirth.sendKeys(dateOfBirth);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a Ssn number as {string}")
    public void adminEntersASsnNumberAs(String ssnNumber) {
        studentManagementPage.ssn.sendKeys(ssnNumber);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a password as {string}")
    public void adminEntersAPasswordAs(String password) {
        studentManagementPage.password.sendKeys(password);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters an email as {string}")
    public void adminEntersAnEmailAs(String email) {
        studentManagementPage.email.sendKeys(email);
        WaitUtils.waitFor(1);
    }

    @And("Admin enters a username as {string}")
    public void adminEntersAUserNameAs(String userName) {
        studentManagementPage.username.sendKeys(userName);
        WaitUtils.waitFor(1);
    }


    @And("Admin enters an invalid Ssn number as {string}")
    public void adminEntersAnInvalidSsnNumberAs(String invalidSsnNumber) {
        studentManagementPage.ssn.sendKeys(invalidSsnNumber);
        WaitUtils.waitFor(1);
    }

    @And("Admin clicks on Submit button in Student Management Page")
    public void adminClicksOnSubmitButtonInStudentManagementPage() {
        JSUtils.JSclickWithTimeout(studentManagementPage.submitButton);
    }
}
