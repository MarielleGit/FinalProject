package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.StudentManagementPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertEquals;

public class US_15_StepDefs {
    LoginPage loginPage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    StudentManagementPage studentManagementPage = new StudentManagementPage();

    public static String name;
    public static String userName;
    public static String EmailAddress;
    public static int phoneNumber;
    public static int ssnNumber;

    @Given("Vice Dean goes to {string} homepage")
    public void vice_dean_goes_to_homepage(String url) {
        Driver.getDriver().get(url);
    }
    @And("clicks on Login right corner of the page")
    public void clicks_on_login_right_corner_of_the_page() {
        WaitUtils.waitFor(2);
        loginPage.loginButtonMainPage.click();
    }
    @And("enters username in the Username input field")
    public void enters_username_in_the_username_input_field() {
        WaitUtils.waitFor(2);
        loginPage.userName.sendKeys("ViceCaptainZoro");
    }
    @And("enters password in the password input field")
    public void enters_password_in_the_password_input_field() {
        WaitUtils.waitFor(2);
        loginPage.password.sendKeys("Nikolas2022!!");
    }
    @And("clicks on Login button")
    public void clicks_on_login_button() {
        WaitUtils.waitFor(2);
        loginPage.loginButton.click();
    }

    // TC_01
    @When("click on the Menu button on the right corner of the page")
    public void click_on_the_menu_button_on_the_right_corner_of_the_page() {
        WaitUtils.waitFor(2);
        studentManagementPage.menuButton.click();
    }
    @And("selects Student Management on the dropdown list")
    public void selects_student_management_on_the_dropdown_list() {
        BrowserUtils.clickWithTimeOut(studentManagementPage.studentManagementOption,3);
    }
    @And("select the teacher on the dropdown list")
    public void select_the_teacher_on_the_dropdown_list() {
        WaitUtils.waitFor(2);
        studentManagementPage.chooseTeacher.click();
        Select select = new Select(studentManagementPage.chooseTeacher);
        select.selectByValue("4938");
    }
    @And("enters a valid student Name")
    public void enters_a_valid_student_name() {
        WaitUtils.waitFor(2);
        name=Faker.instance().name().name();
        studentManagementPage.name.sendKeys(name);
    }
    @And("enters a valid student Surname")
    public void enters_a_valid_student_surname() {
        WaitUtils.waitFor(2);
        studentManagementPage.surname.sendKeys("Marques");
    }
    @And("enters the student Birth Place")
    public void enters_the_student_birth_place() {
        WaitUtils.waitFor(2);
        studentManagementPage.birthPlace.sendKeys("Portugal");
    }
    @And("enters a valid email address")
    public void enters_a_valid_email_address() {
        WaitUtils.waitFor(2);
        EmailAddress=Faker.instance().name().username();
        studentManagementPage.email.sendKeys(EmailAddress+"@gmail.com");
    }
    @And("enters a valid Phone number")
    public void enters_a_valid_phone_number() {
        WaitUtils.waitFor(2);
        phoneNumber = Faker.instance().number().numberBetween(100,999);
        studentManagementPage.phoneNumber.sendKeys(phoneNumber+"-987-6089");
    }
    @And("selects the student gender")
    public void selects_the_student_gender() {
        WaitUtils.waitFor(2);
        studentManagementPage.femaleGender.click();
    }
    @And("enters the Date of Birth")
    public void enters_the_date_of_birth() {
        WaitUtils.waitFor(2);
        studentManagementPage.dateOfBirth.sendKeys("20/08/1989");
    }
    @And("enters a valid SSN number")
    public void enters_a_valid_ssn_number() {
        WaitUtils.waitFor(2);
        ssnNumber = Faker.instance().number().numberBetween(100,999);
        studentManagementPage.ssn.sendKeys(ssnNumber+"-75-5907");
    }
    @And("enters a valid User name")
    public void enters_a_valid_user_name() {
        WaitUtils.waitFor(2);
        userName=Faker.instance().name().username();
        studentManagementPage.username.sendKeys(userName);
    }
    @And("enters the student Father's name")
    public void enters_the_student_father_s_name() {
        WaitUtils.waitFor(2);
        studentManagementPage.fatherName.sendKeys("Pedrog Marques");
    }
    @And("enters the student Mother's name")
    public void enters_the_student_mother_s_name() {
        WaitUtils.waitFor(2);
        studentManagementPage.motherName.sendKeys("Alices Marques");
    }
    @And("enters a valid Password")
    public void enters_a_valid_password() {
        WaitUtils.waitFor(2);
        studentManagementPage.password.sendKeys("Am1234r5@");
    }
    @And("clicks on Submit button")
    public void clicks_on_submit_button() {
        BrowserUtils.clickWithTimeOut(studentManagementPage.submitButton,5);
        WaitUtils.waitFor(1);
    }

    @Then("sees the success message {string}")
    public void sees_the_message(String expectedResult) {
        assertEquals(expectedResult, studentManagementPage.successMessageStudentSaved.getText() );
        WaitUtils.waitFor(1);
       // studentManagementPage.successMessageStudentSaved.isDisplayed();
    }

// TC_02

    @And("enters a INVALID SSN number")
    public void entersAINVALIDSSNNumber() {
        WaitUtils.waitFor(1);
        studentManagementPage.ssn.sendKeys("345-4567891");
    }

    @And("enters a valid Username")
    public void entersAValidUsername() {
        WaitUtils.waitFor(1);
        studentManagementPage.username.sendKeys("Julianor");
    }

    @Then("sees the failed message {string}")
    public void seesTheFailedMessage(String message) {
        assertEquals(message, studentManagementPage.invalidSsnMessage.getText() );
        WaitUtils.waitFor(1);
       // studentManagementPage.invalidSsnMessage.isDisplayed();
    }
}
