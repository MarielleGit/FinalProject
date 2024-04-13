package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.Driver;

import java.sql.SQLOutput;
import java.util.List;

public class Us_07StepDefs {
DeanManagementPage deanManagementPage = new DeanManagementPage();
ContactPage contactPage= new ContactPage();
MainMenuPage mainMenuPage = new MainMenuPage();

    @And("User clicks on Menu button right corner of the page")
    public void userClicksOnMenuButtonRightCornerOfThePage() {
        mainMenuPage.menuButton.click();
    }

    @And("User clicks on Contact Get All left side of the page")
    public void userClicksOnContactGetAllLeftSideOfThePage() {
        mainMenuPage.contactGetAllInsideMenu.click();
    }

    @Then("User sees Messages, authors, emails, sending dates, and subject information")
    public void userSeesMessagesAuthorsEmailsSendingDatesAndSubjectInformation() {
        System.out.println("*********Table Headers That Dean Can See***********");
        List<WebElement> listRows = contactPage.contactTable.findElements(By.tagName("tr"));
        List<WebElement> listHeaders = listRows.get(0).findElements(By.tagName("th"));
        for(int header =0; header<listHeaders.size();header++){
            System.out.println(listHeaders.get(header).getText());
            for(int row=1; row<listRows.size(); row++){
                System.out.println(listRows.get(row).findElements(By.xpath("td")).get(header).getText());
            }
        }
        System.out.println("\n");
    }
}
