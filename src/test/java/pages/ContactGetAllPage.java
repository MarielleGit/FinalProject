package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactGetAllPage {

    public ContactGetAllPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//h5")    public WebElement contactGetAllContactMessagePage;

    @FindBy(xpath = "(//tr/th)[1]")
    public WebElement contactGetAllContactMessageName;
    @FindBy(xpath = "(//tr/th)[2]")
    public WebElement contactGetAllContactMessageEmail;
    @FindBy(xpath = "(//tr/th)[3]")
    public WebElement contactGetAllContactMessageDate;
    @FindBy(xpath = "(//tr/th)[4]")
    public WebElement contactGetAllContactMessageSubject;
    @FindBy(xpath = "(//tr/th)[5]")
    public WebElement contactGetAllContactMessageMessage;
    @FindBy(xpath = "(//a[@class='page-link'])[1]")
    public WebElement contactGetAllContactMessageLeftForwardButton;
    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement contactGetAllContactMessageLeftButton;
    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement contactGetAllContactMessageRightButton;
    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement contactGetAllContactMessageRightForwardButton;
    @FindBy(xpath = "//span[@class='page-link']")
    public WebElement contactGetAllContactMessageNumOfPage;

    @FindBy(xpath = "(//span[text()='about team management'])[1]")
    public WebElement contactGetAllContactMessageInMessage;


}



