package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement contact;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement nameOfTheContact;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailOfTheContact;

    @FindBy(xpath = "//*[@id='subject']")
    public WebElement subjectOfTheContact;

    @FindBy(xpath = "//*[@id='message']")
    public WebElement typeMessageOfTheContact;

    @FindBy(xpath = "//*[text()='Send Message']")
    public WebElement clickSendMessageButton;

    @FindBy(xpath = "//*[text()='Contact Message Created Successfully']")
    public WebElement contactMessageCreated;

    @FindBy(xpath = "//*[text()='Please enter valid email']")
    public WebElement contactMessageIsNotCreated;

    public WebElement messageOfTheContact;

    @FindBy (xpath = "//table[@class='table table-striped table-bordered table-hover']")
    public WebElement contactTable;

}
