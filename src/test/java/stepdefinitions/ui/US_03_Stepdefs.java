package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.ContactPage;
import utilities.WaitUtils;
import static org.junit.Assert.*;

public class US_03_Stepdefs {

    ContactPage contactPage =new ContactPage();
    @And("The user must click Contact")
    public void theUserMustClickContact() {
        contactPage.contact.click();
        WaitUtils.waitFor(1);
    }


//TC_01
    @And("The user must type the Name")
    public void theUserMustTypeTheName() {
        contactPage.nameOfTheContact.sendKeys("Admin", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("The user must type the email address")
    public void theUserMustTypeTheEmailAddress() {
        contactPage.emailOfTheContact.sendKeys("admin1@gmail.com", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("The user must type the Subject")
    public void theUserMustTypeTheSubject(){
        contactPage.subjectOfTheContact.sendKeys("final project", Keys.TAB);
        WaitUtils.waitFor(1);

    }

    @And("The user must type Message")
    public void theUserMustTypeMessage() {
        contactPage.typeMessageOfTheContact.sendKeys("about team management", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("The user must click Send Message button")
    public void theUserMustClickSendMessageButton() {
        contactPage.clickSendMessageButton.click();
        WaitUtils.waitFor(1);

    }

    @And("The user see {string} message")
    public void theUserSeeMessage(String message) {
        assertEquals(message,contactPage.contactMessageCreated.getText());
        WaitUtils.waitFor(1);

    }



//TC_02
    @And("user must type the Name")
    public void userMustTypeTheName() {
        contactPage.nameOfTheContact.sendKeys("Admin", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("user must type the email address")
    public void userMustTypeTheEmailAddress() {
        contactPage.emailOfTheContact.sendKeys("admin1gmail.com", Keys.TAB);
        WaitUtils.waitFor(1);

    }

    @And("user must type the Subject")
    public void userMustTypeTheSubject() {
        contactPage.subjectOfTheContact.sendKeys("final project", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("user must type Message")
    public void userMustTypeMessage() {
        contactPage.typeMessageOfTheContact.sendKeys("about team management", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @And("user must click Send Message button")
    public void userMustClickSendMessageButton() {
        contactPage.clickSendMessageButton.click();
        WaitUtils.waitFor(1);
    }

    @And("user see {string} message")
    public void userSeeMessage(String message) {
        //WaitUtils.waitForVisibility(contactPage.contactMessageCreated,3);
      assertTrue(message,contactPage.contactMessageIsNotCreated.getText().contains(message));
        WaitUtils.waitFor(1);

    }



}
